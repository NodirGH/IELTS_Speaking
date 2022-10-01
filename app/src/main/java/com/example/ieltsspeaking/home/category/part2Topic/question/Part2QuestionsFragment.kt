package com.example.ieltsspeaking.home.category.part2Topic.question

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentPart2QuestionsBinding
import com.example.ieltsspeaking.home.category.part1Topic.questions.adapter.Part1QuestionsAdapter
import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

private const val HEADING = "heading"

class Part2QuestionsFragment : Fragment(), Part1QuestionsAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart2QuestionsBinding
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
        binding = FragmentPart2QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeadingPart2Questions.text = this.heading

        setPart2RecyclerView()
    }

    private fun setPart2RecyclerView() {
        binding.rvPart2Questions.layoutManager = LinearLayoutManager(requireContext())
//        val data: List<ModelPartsQuestions> = when(heading){
//
//        }
//        val adapter = Part1QuestionsAdapter(data, this)
//        binding.rvPart2Questions.adapter = adapter
    }

    override fun onItemClick(modelPartsQuestions: ModelPartsQuestions) {
//        val part2AnswerFragment = Part2AnswerFragment
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Part2QuestionsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Part2QuestionsFragment().apply {
                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
}