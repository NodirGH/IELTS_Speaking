package com.example.ieltsspeaking.home.category.part1Topic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentPart1TopicBinding
import com.example.ieltsspeaking.home.category.part1Topic.adapter.Part1TopicAdapter
import com.example.ieltsspeaking.home.category.part1Topic.data.Part1TopicData
import com.example.ieltsspeaking.home.category.part1Topic.categories.study.Part1QuestionsStudyFragment

class Part1TopicFragment : Fragment() {

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
        val adapter = Part1TopicAdapter(part1Data)
        binding.rvPart1.adapter = adapter

        adapter.setOnItemClickListener(object : Part1TopicAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                when (position + 1) {
                    1 -> Toast.makeText(requireContext(), "You clicked #1", Toast.LENGTH_SHORT)
                        .show()
                    2 -> navigateToStudyQuestionsFragment()
                    3 -> Toast.makeText(requireContext(), "You clicked #3", Toast.LENGTH_SHORT)
                        .show()
                    4 -> Toast.makeText(requireContext(), "You clicked #4", Toast.LENGTH_SHORT)
                        .show()
                    5 -> Toast.makeText(requireContext(), "You clicked #5", Toast.LENGTH_SHORT)
                        .show()
                    6 -> Toast.makeText(requireContext(), "You clicked #6", Toast.LENGTH_SHORT)
                        .show()
                    7 -> Toast.makeText(requireContext(), "You clicked #7", Toast.LENGTH_SHORT)
                        .show()
                    8 -> Toast.makeText(requireContext(), "You clicked #8", Toast.LENGTH_SHORT)
                        .show()
                    9 -> Toast.makeText(requireContext(), "You clicked #9", Toast.LENGTH_SHORT)
                        .show()
                    10 -> Toast.makeText(requireContext(), "You clicked #10", Toast.LENGTH_SHORT)
                        .show()
                    11 -> Toast.makeText(requireContext(), "You clicked #11", Toast.LENGTH_SHORT)
                        .show()
                    12 -> Toast.makeText(requireContext(), "You clicked #12", Toast.LENGTH_SHORT)
                        .show()
                    13 -> Toast.makeText(requireContext(), "You clicked #13", Toast.LENGTH_SHORT)
                        .show()
                    14 -> Toast.makeText(requireContext(), "You clicked #14", Toast.LENGTH_SHORT)
                        .show()
                    15 -> Toast.makeText(requireContext(), "You clicked #15", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })

    }

    private fun navigateToStudyQuestionsFragment(){
        val part1QuestionFragment = Part1QuestionsStudyFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part1QuestionFragment)
        transaction.addToBackStack(null).commit()
    }

}
