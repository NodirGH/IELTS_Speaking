package my.application.ieltsspeaking.home.category.part3Topic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart3TopicBinding
import my.application.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import my.application.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import my.application.ieltsspeaking.home.category.part3Topic.data.Part3TopicData
import my.application.ieltsspeaking.home.category.part3Topic.question.Part3QuestionsFragment

class Part3TopicFragment : Fragment(), PartsTopicAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart3TopicBinding

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
        val part3Data = Part3TopicData.getPart3TopicData()
        val adapter = PartsTopicAdapter(part3Data, this)
        binding.rvPart3.adapter = adapter
    }

    override fun onItemClick(part1ModelTopic: ModelPartsTopic) {
        val part3QuestionsFragment = Part3QuestionsFragment.newInstance(part1ModelTopic.heading)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part3QuestionsFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}