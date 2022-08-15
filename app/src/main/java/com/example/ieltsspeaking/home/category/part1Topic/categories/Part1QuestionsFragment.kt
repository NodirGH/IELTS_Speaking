package com.example.ieltsspeaking.home.category.part1Topic.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.databinding.FragmentPart1QuestionsBinding
import com.example.ieltsspeaking.home.category.part1Topic.categories.adapter.Part1QuestionsAdapter
import com.example.ieltsspeaking.home.category.part1Topic.categories.data.Part1QuestionsStudyData
import com.example.ieltsspeaking.home.category.part1Topic.categories.model.ModelPart1Questions

private const val HEADING = "heading"

class Part1QuestionsFragment : Fragment() {

//    private var heading: String? = null

    private lateinit var binding: FragmentPart1QuestionsBinding
    private var heading: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            heading = it.getString(HEADING)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart1QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeadingPart1Questions.text = this.heading

//        binding.rvPart1Questions.layoutManager = LinearLayoutManager(requireContext())
//        val dataPart1QuestionsStudy = Part1QuestionsStudyData.getStudyQuestions()
//        val adapter = Part1QuestionsAdapter(dataPart1QuestionsStudy)
//        binding.rvPart1Questions.adapter = adapter
    }

//    override fun onItemClick(modelPart1Questions: ModelPart1Questions) {
//    }

    companion object {
        @JvmStatic
        fun newInstance(heading: String) =
            Part1QuestionsFragment().apply {
                arguments = Bundle().apply {
                    putString(HEADING, heading)
                }
            }
    }
}