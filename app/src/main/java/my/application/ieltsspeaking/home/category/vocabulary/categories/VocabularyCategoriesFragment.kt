package my.application.ieltsspeaking.home.category.vocabulary.categories

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyCategoriesBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.adapter.VocabularyWordsAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.data.VocabularyDataForAll
import my.application.ieltsspeaking.home.category.vocabulary.globalTopicId
import my.application.ieltsspeaking.utils.navigateSafe
import my.application.ieltsspeaking.utils.snackBar
import my.application.ieltsspeaking.utils.toast

class VocabularyCategoriesFragment :
    BaseFragment<FragmentVocabularyCategoriesBinding>(FragmentVocabularyCategoriesBinding::inflate) {

    private var mRewardedAd: RewardedAd? = null
    private lateinit var adRequest: AdRequest

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adRequest = AdRequest.Builder().build()
        loadRewardedAds()
        setRecyclerView()

        binding.btnTest.setOnClickListener {
            if (isInternetConnected()) {
                showVideoAd()
            } else {
                requireContext().snackBar(
                    binding.root,
                    "You have to watch ads"
                )
                Handler().postDelayed({
                    requireContext().toast("Turn on Wi-Fi or Internet", Toast.LENGTH_LONG)
                }, 2500)
            }
        }

        binding.btnStartLearning.setOnClickListener {
            findNavController().navigateSafe(R.id.vocabularyStartLearningFragment)
        }
    }

    private fun setRecyclerView() {
        val data = when (globalTopicId) {
            1 -> VocabularyDataForAll.getWorkWords()
            2 -> VocabularyDataForAll.getTravelWords()
            3 -> VocabularyDataForAll.getTechnologyWords()
            4 -> VocabularyDataForAll.getSportWords()
            5 -> VocabularyDataForAll.getScienceWords()
            6 -> VocabularyDataForAll.getRelationshipWords()
            7 -> VocabularyDataForAll.getAccommodationWords()
            8 -> VocabularyDataForAll.getEducationWords()
            9 -> VocabularyDataForAll.getHobbyWords()
            10 -> VocabularyDataForAll.getMixedWords()
            else -> VocabularyDataForAll.getWorkWords()
        }
        val adapter = VocabularyWordsAdapter(data)
        binding.rvVocabularyAll.layoutManager = LinearLayoutManager(requireContext())
        binding.rvVocabularyAll.adapter = adapter
    }

    private fun loadRewardedAds() {
        RewardedAd.load(
            requireContext(),
            getString(R.string.ID_AdRewarded),
            adRequest,
            object : RewardedAdLoadCallback() {
                override fun onAdFailedToLoad(p0: LoadAdError) {
                    mRewardedAd = null
                }

                override fun onAdLoaded(rewardedAd: RewardedAd) {
                    mRewardedAd = rewardedAd

                    fullScreenCallbackReward()
                }
            })
    }

    private fun showVideoAd() {
        if (mRewardedAd != null) {
            mRewardedAd?.show(requireActivity(), OnUserEarnedRewardListener() {
                fun onUserEarnedReward(rewardItem: RewardItem) {
                    var rewardAmount = rewardItem.amount
                    var rewardType = rewardItem.type
                }
            })
        } else {
            findNavController().navigateSafe(R.id.vocabularyTestFragment)
        }
    }

    private fun fullScreenCallbackReward() {
        mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {

            override fun onAdDismissedFullScreenContent() {
                mRewardedAd = null
                findNavController().navigateSafe(R.id.vocabularyTestFragment)
            }
        }
    }

    private fun isInternetConnected(): Boolean {
        val connectionManager =
            requireActivity().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectionManager.activeNetworkInfo
        return activeNetwork?.isConnectedOrConnecting == true
    }
}