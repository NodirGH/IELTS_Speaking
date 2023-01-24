package my.application.ieltsspeaking.home.category.part3Topic.question.answer

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart3AnswersBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.utils.UtilsForApp


class Part3AnswersFragment :
    BaseFragment<FragmentPart3AnswersBinding>(FragmentPart3AnswersBinding::inflate) {

    private val args: Part3AnswersFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(
            R.color.background_light_blue,
            requireContext(),
            requireActivity()
        )

        binding.tvPart3Question.text = args.answer.question
        binding.tvPart3Answer.text = args.answer.answer
    }
}