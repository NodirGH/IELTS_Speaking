package com.example.ieltsspeaking.home.category.part3Topic.question.answer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsspeaking.databinding.FragmentPart3AnswersBinding

private const val QUESTION = "question"

class Part3AnswersFragment : Fragment() {

    private lateinit var binding: FragmentPart3AnswersBinding
    private var questions: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            questions = it.getString(QUESTION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart3AnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvPart3Question.text = this.questions

        setPart3Answers()

    }

    private fun setPart3Answers() {
        binding.tvPart3Answer.text = when(this.questions){
            "Hello" -> "Hi"

            //TODO should be populated

            else -> "Goodbye"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(question: String) =
            Part3AnswersFragment().apply {
                arguments = Bundle().apply {
                    putString(QUESTION, question)
                }
            }
    }
}