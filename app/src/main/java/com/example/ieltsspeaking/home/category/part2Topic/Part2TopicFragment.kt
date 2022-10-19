package com.example.ieltsspeaking.home.category.part2Topic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentPart2TopicBinding
import com.example.ieltsspeaking.home.category.part1Topic.adapter.PartsTopicAdapter
import com.example.ieltsspeaking.home.category.part1Topic.model.ModelPartsTopic
import com.example.ieltsspeaking.home.category.part2Topic.data.Part2TopicData
import com.example.ieltsspeaking.home.category.part2Topic.question.Part2QuestionsFragment

class Part2TopicFragment : Fragment(), PartsTopicAdapter.OnItemClickListener {

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
        val adapter = PartsTopicAdapter(part2Data, this)
        binding.rvPart2.adapter = adapter
    }

    override fun onItemClick(part1ModelTopic: ModelPartsTopic) {
        val part2QuestionsFragment = Part2QuestionsFragment.newInstance(part1ModelTopic.heading)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part2QuestionsFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}