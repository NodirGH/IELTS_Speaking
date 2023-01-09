package my.application.ieltsspeaking.home.category.part2Topic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2TopicBinding
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.home.category.part2Topic.data.Part2TopicData
import my.application.ieltsspeaking.home.category.part2Topic.question.Part2QuestionsFragment
import my.application.ieltsspeaking.utils.toast

class Part2TopicFragment : Fragment()
//    , PartsTopicAdapter.OnItemClickListener
{

    private lateinit var binding: FragmentPart2TopicBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart2TopicBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPart2.layoutManager = LinearLayoutManager(requireContext())
        val part2Data = Part2TopicData.getPart2Data()
        val adapter = PartsTopicAdapter(part2Data)
        binding.rvPart2.adapter = adapter
        adapter.setClickListener(object : PartsTopicAdapter.Part1TopicClickListener {
            override fun onPart1Click(position: Int) {
                when (position + 1) {
                    1 -> requireContext().toast("1")
                    2 -> requireContext().toast("2")
                    3 -> requireContext().toast("3")
                    else -> requireContext().toast("4")
                }

            }


        })
    }

    private fun navigateToQuestions(part1ModelTopic: ModelPartsTopic) {
        val part2QuestionsFragment = Part2QuestionsFragment.newInstance(part1ModelTopic.heading)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part2QuestionsFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

//    override fun onItemClick(partModelTopic: ModelPartsTopic) {
//        val part2QuestionsFragment = Part2QuestionsFragment.newInstance(partModelTopic.heading)
//        val transaction = parentFragmentManager.beginTransaction()
//        transaction.replace(R.id.fragmentContainerView, part2QuestionsFragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }
}