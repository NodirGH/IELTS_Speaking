package my.application.ieltsspeaking.home.category.vocabulary.categories.result

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import my.application.ieltsspeaking.databinding.FragmentVocabularyResultBinding
import my.application.ieltsspeaking.utils.SharedViewModel

class VocabularyResultFragment : Fragment() {

    private lateinit var binding: FragmentVocabularyResultBinding
    private var questionSize: Int = 0
    private var correctAnswers: Int = 0
    private var incorrectAnswers: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sharedViewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

        sharedViewModel.questionsSize.observe(viewLifecycleOwner) {
            binding.tvQuestionSize.text = it.toString()
            questionSize = it
        }

        sharedViewModel.correctAnswer.observe(viewLifecycleOwner) {
            binding.tvCorrectAnswers.text = it.toString()
            correctAnswers = it
        }

        sharedViewModel.incorrectAnswer.observe(viewLifecycleOwner) {
            binding.tvIncorrectAnswers.text = it.toString()
            incorrectAnswers = it

            val resultPercent = ((correctAnswers.toFloat() / questionSize.toFloat()) * 100)
            binding.tvResultPercent.text = "${resultPercent.toInt().toString()}%"

            binding.cpbResultProgressBar.apply {
                progressMax = 100f
                setProgressWithAnimation(resultPercent, 3000)
                progressBarWidth = 10f
                backgroundProgressBarWidth = 13f
                progressBarColor = Color.GREEN
            }
        }



        binding.btnFinishResult.setOnClickListener {
            val action = VocabularyResultFragmentDirections.actionVocabularyResultFragmentToVocabularyFragment()
            findNavController().navigate(action)
        }
    }
}
