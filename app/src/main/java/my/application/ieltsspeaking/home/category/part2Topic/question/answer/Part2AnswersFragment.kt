package my.application.ieltsspeaking.home.category.part2Topic.question.answer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2AnswersBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.utils.UtilsForApp


class Part2AnswersFragment : BaseFragment<FragmentPart2AnswersBinding>(FragmentPart2AnswersBinding::inflate) {

    private val args: Part2AnswersFragmentArgs by navArgs()
    private lateinit var adRequest: AdRequest
    private lateinit var adView: AdView

     override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         adView = AdView(requireContext())
         adRequest = AdRequest.Builder().build()
         binding.adView.loadAd(adRequest)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        binding.tvPart2Question.text = args.answer.question
        binding.tvPart2Answer.text = args.answer.answer
    }
}