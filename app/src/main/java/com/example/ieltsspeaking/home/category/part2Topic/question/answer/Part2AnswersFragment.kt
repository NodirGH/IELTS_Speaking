package com.example.ieltsspeaking.home.category.part2Topic.question.answer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsspeaking.databinding.FragmentPart2AnswersBinding

private const val QUESTION = "question"

class Part2AnswersFragment : Fragment() {

    private lateinit var binding: FragmentPart2AnswersBinding
    private var question: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            question = it.getString(QUESTION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart2AnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvPart2Question.text = this.question

        setPart2Answers()
    }

    private fun setPart2Answers() {
//        binding.tvPart1Answer.text = when(this.question){
//
//        }
    }


    companion object {
        @JvmStatic
        fun newInstance(question: String) =
            Part2AnswersFragment().apply {
                arguments = Bundle().apply {
                    putString(QUESTION, question)
                }
            }
    }
}