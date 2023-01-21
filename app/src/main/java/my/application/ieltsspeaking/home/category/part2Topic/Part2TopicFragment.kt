package my.application.ieltsspeaking.home.category.part2Topic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2TopicBinding
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.home.category.part1Topic.questions.Part1QuestionsFragment
import my.application.ieltsspeaking.home.category.part2Topic.data.Part2TopicData
import my.application.ieltsspeaking.home.category.part2Topic.question.Part2QuestionsFragment
import my.application.ieltsspeaking.utils.UtilsForApp
import my.application.ieltsspeaking.utils.toast

class Part2TopicFragment : Fragment() {

    private lateinit var binding: FragmentPart2TopicBinding
    private var db = FirebaseFirestore.getInstance()
    private lateinit var userTopicList: ArrayList<ModelPartsTopic>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart2TopicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        binding.rvPart2.layoutManager = LinearLayoutManager(requireContext())
        userTopicList = arrayListOf()
        db.collection("Part2Topics").orderBy("id").get().addOnSuccessListener {

            if (!it.isEmpty){
                for (topics in it.documents){
                    val topic: ModelPartsTopic? = topics.toObject(ModelPartsTopic::class.java)
                    if (topic != null){
                        userTopicList.add(topic)
                    }
                }

                val adapter = PartsTopicAdapter()
                binding.rvPart2.adapter = adapter
//TODO
//                adapter.setClickListener(object : PartsTopicAdapter.PartTopicClickListener{
//                    override fun onPartsClick(position: Int) {
//                        navigateToQuestionFragment(position+1)
//                    }
//                })

            }

        }.addOnFailureListener { requireContext().toast(it.toString(), length = Toast.LENGTH_LONG) }

    }

    private fun navigateToQuestionFragment(position: Int) {
        val fragment = Part2QuestionsFragment()
        val argument = Bundle()
        argument.putInt("topic_position_part2", position)
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