package my.application.ieltsspeaking.home.category.part1Topic.questions.answers

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart1AnswersBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.utils.UtilsForApp

class Part1AnswersFragment : BaseFragment<FragmentPart1AnswersBinding>(FragmentPart1AnswersBinding::inflate) {

    private val args : Part1AnswersFragmentArgs by navArgs()
    private lateinit var adRequest: AdRequest
    private lateinit var adView: AdView

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         adView = AdView(requireContext())
         adRequest = AdRequest.Builder().build()
         binding.adView.loadAd(adRequest)

        UtilsForApp.updateStatusBarColor(
            R.color.background_light_blue,
            requireContext(),
            requireActivity()
        )
        binding.tvPart1Answer.text = args.answer.answer
        binding.tvPart1Question.text = args.answer.question
    }
}