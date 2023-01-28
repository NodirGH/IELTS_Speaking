package my.application.ieltsspeaking.home.category.pronunciation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPronunciationBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.pronunciation.adapter.PronunciationAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.ben_franklin.BenFranklinVideos
import my.application.ieltsspeaking.home.category.pronunciation.categories.homophones.HomophonesVideos
import my.application.ieltsspeaking.home.category.pronunciation.categories.idioms.IdiomsVideos
import my.application.ieltsspeaking.home.category.pronunciation.categories.phrasal_verbs.PhrasalVerbsVideos
import my.application.ieltsspeaking.home.category.pronunciation.categories.pronunciation.PronunciationVideos
import my.application.ieltsspeaking.home.category.pronunciation.categories.slang.SlangVideos
import my.application.ieltsspeaking.home.category.pronunciation.categories.useful_tips.UsefulTipsVideos
import my.application.ieltsspeaking.home.category.pronunciation.data.DataPronunciation
import my.application.ieltsspeaking.home.category.video_answer.band_8.Band8VideoAnswerActivity
import my.application.ieltsspeaking.home.category.video_answer.band_9.Band9VideoAnswerActivity
import my.application.ieltsspeaking.utils.UtilsForApp

class PronunciationFragment : BaseFragment<FragmentPronunciationBinding>(FragmentPronunciationBinding::inflate) {
    lateinit var mAdView: AdView
    private var mInterstitialAd: InterstitialAd? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MobileAds.initialize(requireContext()) {}

        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)

        loadInterstitial()

        UtilsForApp.updateStatusBarColor(R.color.bg_blue, requireContext(), requireActivity())

        binding.rvPronunciation.layoutManager = LinearLayoutManager(requireContext())
        val data = DataPronunciation.getPronunciationData()
        val adapter = PronunciationAdapter(data)
        binding.rvPronunciation.adapter = adapter

        adapter.setOnPronunciationClick(object : PronunciationAdapter.OnPronunciationClickListener{
            override fun onItemClick(position: Int) {
                when(position+1){
                    1 -> navigateToPronunciationActivity()
                    2 -> navigateToBenFranklinActivity()
                    3 -> navigateToIdiomsActivity()
                    4 -> navigateToSlangActivity()
                    5 -> navigateToPhrasalVerbsActivity()
                    6 -> navigateToHomophonesActivity()
                    7 -> navigateToUsefulTipsActivity()
                }
            }
        })
    }

    private fun loadInterstitial() {
        val adRequest = AdRequest.Builder().build()

        InterstitialAd.load(requireContext(),"ca-app-pub-3940256099942544/1033173712", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                 mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                mInterstitialAd = interstitialAd
            }
        })
    }

    private fun showInter(){
        if (mInterstitialAd != null) {
            mInterstitialAd?.show(requireActivity())
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.")
        }
    }

    private fun navigateToBenFranklinActivity(){
        val intent = Intent(requireContext(), BenFranklinVideos::class.java)
        startActivity(intent)
    }

    private fun navigateToIdiomsActivity(){
        showInter()
        val intent = Intent(requireContext(), IdiomsVideos::class.java)
        startActivity(intent)
    }

    private fun navigateToPhrasalVerbsActivity(){
        val intent = Intent(requireContext(), PhrasalVerbsVideos::class.java)
        startActivity(intent)
    }

    private fun navigateToPronunciationActivity(){
         val intent = Intent(requireContext(), PronunciationVideos::class.java)
        startActivity(intent)
    }

    private fun navigateToSlangActivity(){
        val intent = Intent(requireContext(), SlangVideos::class.java)
        startActivity(intent)
    }

    private fun navigateToHomophonesActivity(){
        val intent = Intent(requireContext(), HomophonesVideos::class.java)
        startActivity(intent)
    }

    private fun navigateToUsefulTipsActivity(){
        val intent = Intent(requireContext(), UsefulTipsVideos::class.java)
        startActivity(intent)
    }

}