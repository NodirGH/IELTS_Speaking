package my.application.ieltsspeaking.home.category.vocabulary.categories.result

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyResultBinding
import my.application.ieltsspeaking.home.category.vocabulary.VocabularyFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.correctAnswers
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.incorrectAnswers

class VocabularyResultFragment : Fragment() {

    private lateinit var binding: FragmentVocabularyResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val questionSize = 8
        val resultPercent = ((questionSize - incorrectAnswers) * 10).toFloat()
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

        binding.btnFinishResult.setOnClickListener {
            navigateToMainVocabularyFragment()
        }
    }

    private fun navigateToMainVocabularyFragment() {
        val fragment = VocabularyFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null).commit()

    }
}
