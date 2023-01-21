package my.application.ieltsspeaking.home.category.part1Topic

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart1TopicBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.utils.UtilsForApp
import my.application.ieltsspeaking.utils.navigateSafeAction
import my.application.ieltsspeaking.utils.toast

class Part1TopicFragment :
    BaseFragment<FragmentPart1TopicBinding>(FragmentPart1TopicBinding::inflate) {

    private var db = FirebaseFirestore.getInstance()
    private lateinit var adapter: PartsTopicAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = PartsTopicAdapter()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(
            R.color.background_light_blue,
            requireContext(),
            requireActivity()
        )

        adapter.setClickListener(object : PartsTopicAdapter.PartTopicClickListener {
            override fun onPartsClick(topic: ModelPartsTopic) {
                val action =
                    Part1TopicFragmentDirections.actionPart1TopicFragmentToPart1QuestionsFragment(
                        topic
                    )
                findNavController().navigateSafeAction(action.actionId, action.arguments)
            }
        })
        binding.rvPart1.layoutManager = LinearLayoutManager(requireContext())
        binding.rvPart1.adapter = adapter
        db.collection("Part1Topics").orderBy("id").get().addOnSuccessListener {
            val userTopicList = ArrayList<ModelPartsTopic>()
            if (!it.isEmpty) {
                for (document in it.documents) {
                    val topic: ModelPartsTopic? = document.toObject(ModelPartsTopic::class.java)
                    topic?.hashId = document.id
                    if (topic != null) {
                        userTopicList.add(topic)
                    }
                }
                if (adapter.itemCount == 0)
                    adapter.submitList(userTopicList)
            }
        }
            .addOnFailureListener {
                requireContext().toast(
                    it.toString(),
                    length = Toast.LENGTH_LONG
                )
            }
    }


}