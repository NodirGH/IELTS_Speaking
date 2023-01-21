package my.application.ieltsspeaking.home.category.vocabulary.categories.result

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyResultBinding
import my.application.ieltsspeaking.home.category.vocabulary.VocabularyFragment
import my.application.ieltsspeaking.utils.UtilsForVocabulary

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

        setFragmentResultListener("Size") { _, bundle ->
            val amountOfQuestions = bundle.getInt("questionSize")
            val correct = bundle.getInt("correctAnswer")
            val incorrect = bundle.getInt("incorrectAnswer")
            questionSize = amountOfQuestions
            correctAnswers = correct
            incorrectAnswers = incorrect

            val resultPercent = ((correctAnswers.toFloat() / questionSize.toFloat()) * 100)
            binding.tvCorrectAnswers.text = correctAnswers.toString()
            binding.tvIncorrectAnswers.text = incorrectAnswers.toString()
            binding.tvQuestionSize.text = questionSize.toString()
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
            //TODO should be handled
            UtilsForVocabulary.navigateFragment(VocabularyFragment(), parentFragmentManager)

        }
    }

    private fun navigateToVocabulary() {
        val myFragment = VocabularyFragment()
        val fm = fragmentManager
        val transaction = fm!!.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, myFragment).commit()
    }


}
