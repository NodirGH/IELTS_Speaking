package my.application.ieltsspeaking.home.category.part1Topic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart1TopicBinding
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.data.Part1TopicData
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.home.category.part1Topic.questions.Part1QuestionsFragment
import my.application.ieltsspeaking.home.category.test_yourself.model.TestYourselfModel
import my.application.ieltsspeaking.home.category.test_yourself.part1.TestYourselfPart1Fragment
import my.application.ieltsspeaking.home.category.test_yourself.part1.TestYourselfPart1RecordingFragment

class Part1TopicFragment : Fragment(), PartsTopicAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart1TopicBinding

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
        val part1Data = Part1TopicData.getPart1Data()
        val adapter = PartsTopicAdapter(part1Data, this)
        binding.rvPart1.adapter = adapter
    }

    override fun onItemClick(part1ModelTopic: ModelPartsTopic) {
        val part1QuestionsFragment = Part1QuestionsFragment.newInstance(part1ModelTopic.heading)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part1QuestionsFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}