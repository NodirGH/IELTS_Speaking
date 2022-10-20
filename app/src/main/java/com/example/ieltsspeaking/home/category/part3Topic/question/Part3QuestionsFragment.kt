package com.example.ieltsspeaking.home.category.part3Topic.question

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentPart3QuestionsBinding
import com.example.ieltsspeaking.home.category.part1Topic.questions.adapter.Part1QuestionsAdapter
import com.example.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions
import com.example.ieltsspeaking.home.category.part3Topic.question.answer.Part3AnswersFragment
import com.example.ieltsspeaking.home.category.part3Topic.question.data.Part3QuestionsData

private const val HEADING = "heading"

class Part3QuestionsFragment : Fragment(), Part1QuestionsAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart3QuestionsBinding
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
        binding = FragmentPart3QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeadingPart3Questions.text = this.heading

        setPart3RecyclerView()
    }

    private fun setPart3RecyclerView() {
        binding.rvPart3Questions.layoutManager = LinearLayoutManager(requireContext())
        val data: List<ModelPartsQuestions> = when (heading) {
            "Weather" -> Part3QuestionsData.getWeatherQuestions()
            else -> Part3QuestionsData.getWrongError()
        }
        val adapter = Part1QuestionsAdapter(data, this)
        binding.rvPart3Questions.adapter = adapter
    }

    override fun onItemClick(modelPartsQuestions: ModelPartsQuestions) {
        val part3AnswerFragment = Part3AnswersFragment.newInstance(modelPartsQuestions.question)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, part3AnswerFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance(heading: String) =
            Part3QuestionsFragment().apply {
                arguments = Bundle().apply {
                    putString(HEADING, heading)
                }
            }
    }
}