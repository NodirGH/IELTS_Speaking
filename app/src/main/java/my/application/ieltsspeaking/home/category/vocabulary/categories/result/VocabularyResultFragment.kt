package my.application.ieltsspeaking.home.category.vocabulary.categories.result

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyResultBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.utils.SharedViewModel
import my.application.ieltsspeaking.utils.UtilsForYoutube

class VocabularyResultFragment :
    BaseFragment<FragmentVocabularyResultBinding>(FragmentVocabularyResultBinding::inflate) {

    private var questionSize: Int = 0
    private var correctAnswers: Int = 0
    private var incorrectAnswers: Int = 0
    private lateinit var adRequest: AdRequest
    private var mInterstitialAd: InterstitialAd? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adRequest = AdRequest.Builder().build()

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
            binding.tvResultPercent.text = "${resultPercent.toInt()}%"

            binding.cpbResultProgressBar.apply {
                progressMax = 100f
                setProgressWithAnimation(resultPercent, 3000)
                progressBarWidth = 10f
                backgroundProgressBarWidth = 13f
                progressBarColor = Color.GREEN
            }
        }

        binding.btnFinishResult.setOnClickListener {
            val action =
                VocabularyResultFragmentDirections.actionVocabularyResultFragmentToVocabularyFragment()
            if (UtilsForYoutube.isInternetConnected(requireContext())) {
                loadInterstitialAd()
                findNavController().navigate(action)
            } else findNavController().navigate(action)
        }
    }

    private fun loadInterstitialAd() {
        InterstitialAd.load(
            requireContext(),
            getString(R.string.ID_Interstitial),
            adRequest,
            object : InterstitialAdLoadCallback() {
                override fun onAdFailedToLoad(addError: LoadAdError) {
                    mInterstitialAd = null
                }

                override fun onAdLoaded(interstitialAd: InterstitialAd) {
                    mInterstitialAd = interstitialAd

                    mInterstitialAd?.show(requireActivity())
                }
            })

        if (mInterstitialAd != null) {
            mInterstitialAd?.show(requireActivity())
        }
    }
}
