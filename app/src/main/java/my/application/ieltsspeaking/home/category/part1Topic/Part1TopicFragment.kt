package my.application.ieltsspeaking.home.category.part1Topic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.FirebaseData
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart1TopicBinding
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.home.category.part1Topic.questions.Part1QuestionsFragment
import my.application.ieltsspeaking.utils.toast

class Part1TopicFragment : Fragment(){

    private lateinit var binding: FragmentPart1TopicBinding
    private var db = FirebaseFirestore.getInstance()
    private lateinit var userTopicList: ArrayList<ModelPartsTopic>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart1TopicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPart1.layoutManager = LinearLayoutManager(requireContext())
        userTopicList = arrayListOf()
        db.collection("Part1Topics").orderBy("id").get().addOnSuccessListener{

            if (!it.isEmpty){
                for (topics in it.documents){
                    val topic: ModelPartsTopic? = topics.toObject(ModelPartsTopic::class.java)
                    if (topic != null){
                        userTopicList.add(topic)
                    }
                }

                val adapter = PartsTopicAdapter(userTopicList)
                binding.rvPart1.adapter = adapter

                adapter.setOnPart1ClickListener(object : PartsTopicAdapter.Part1TopicClickListener{
                    override fun onPart1Click(position: Int) {
                        requireContext().toast("${position + 1} is clicked",)
                        navigateToQuestions()
                    }
                })
            }
        }
            .addOnFailureListener { Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_LONG).show() }
    }

    private fun navigateToQuestions() {
        val modelPartsTopic = ModelPartsTopic()
        val fragment = Part1QuestionsFragment.newInstance(modelPartsTopic.heading)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}