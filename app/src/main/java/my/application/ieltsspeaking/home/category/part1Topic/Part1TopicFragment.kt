package my.application.ieltsspeaking.home.category.part1Topic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
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
    var topicHeading = "heading test"

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

                adapter.setClickListener(object : PartsTopicAdapter.Part1TopicClickListener{
                    override fun onPart1Click(position: Int) {
                            navigateToQuestionFragment(position+1)
                    }
                })

            }
        }
            .addOnFailureListener { requireContext().toast(it.toString(), length = Toast.LENGTH_LONG) }
    }

    private fun navigateToQuestionFragment(position: Int) {
        val fragment = Part1QuestionsFragment()
        val argument = Bundle()
        argument.putInt("topic_position", position)
        fragment.arguments = argument
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
//        setFragmentResult("TOPIC", bundle)
        transaction.addToBackStack(null)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }

}