package my.application.ieltsspeaking.home.category.part3Topic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart3TopicBinding
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.home.category.part3Topic.question.Part3QuestionsFragment
import my.application.ieltsspeaking.utils.UtilsForApp
import my.application.ieltsspeaking.utils.toast

class Part3TopicFragment : Fragment() {

    private lateinit var binding: FragmentPart3TopicBinding
    private var db = FirebaseFirestore.getInstance()
    private lateinit var userTopicList: ArrayList<ModelPartsTopic>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart3TopicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvPart3.layoutManager = LinearLayoutManager(requireContext())

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        userTopicList = arrayListOf()
        db.collection("Part3Topics").orderBy("id").get().addOnSuccessListener {

            if (!it.isEmpty) {
                for (topics in it.documents) {
                    val topic: ModelPartsTopic? = topics.toObject(ModelPartsTopic::class.java)
                    if (topic != null) {
                        userTopicList.add(topic)
                    }
                }

                //todo
//                val adapter = PartsTopicAdapter(userTopicList)
//                binding.rvPart3.adapter = adapter
//
//                adapter.setClickListener(object : PartsTopicAdapter.PartTopicClickListener {
//                    override fun onPartsClick(position: Int) {
//                        navigateToQuestionFragment(position + 1)
//                    }
//                })

            }
        }
            .addOnFailureListener {
                requireContext().toast(
                    it.toString(),
                    length = Toast.LENGTH_LONG
                )
            }
    }

    private fun navigateToQuestionFragment(position: Int) {
        val fragment = Part3QuestionsFragment()
        val argument = Bundle()
        argument.putInt("topic_position_part3", position)
        fragment.arguments = argument
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.addToBackStack(null)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }
}
