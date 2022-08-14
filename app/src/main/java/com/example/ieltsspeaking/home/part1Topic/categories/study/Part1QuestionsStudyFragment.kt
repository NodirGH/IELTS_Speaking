package com.example.ieltsspeaking.home.part1Topic.categories.study

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.databinding.FragmentPart1QuestionsStudyBinding
import com.example.ieltsspeaking.home.part1Topic.categories.study.adapter.Part1QuestionsStudyAdapter
import com.example.ieltsspeaking.home.part1Topic.categories.study.data.Part1QuestionsStudyData

class Part1QuestionsStudyFragment : Fragment() {

    private lateinit var binding: FragmentPart1QuestionsStudyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart1QuestionsStudyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPart1QuestionsStudy.layoutManager = LinearLayoutManager(requireContext())
        val dataPart1QuestionsStudy = Part1QuestionsStudyData.getStudyQuestions()
        val adapter = Part1QuestionsStudyAdapter(dataPart1QuestionsStudy)
        binding.rvPart1QuestionsStudy.adapter = adapter

    }

}