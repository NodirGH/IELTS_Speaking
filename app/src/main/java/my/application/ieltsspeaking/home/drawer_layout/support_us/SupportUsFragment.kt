package my.application.ieltsspeaking.home.drawer_layout.support_us

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.OnUserEarnedRewardListener
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentSupportUsBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar
import my.application.ieltsspeaking.utils.toast

class SupportUsFragment :
    BaseFragment<FragmentSupportUsBinding>(FragmentSupportUsBinding::inflate) {

    private var mRewardedAd: RewardedAd? = null
    private lateinit var adRequest: AdRequest
//    private lateinit var adView: AdView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adRequest = AdRequest.Builder().build()
//        adView = AdView(requireContext())
//        binding.adView.loadAd(adRequest)

        loadRewardedAdd()


        binding.btnPress.setOnClickListener {
            if (isInternetConnected()) {
                showVideoAd()
            } else requireContext().snackBar(binding.root, "Please, turn on Wi-fi or Internet")
        }
    }

    private fun loadRewardedAdd() {
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
            requireContext().toast("Server error, please try again later")
            loadRewardedAdd()
        }
    }

    private fun fullScreenCallbackReward() {
        mRewardedAd?.fullScreenContentCallback = object : FullScreenContentCallback() {

            override fun onAdDismissedFullScreenContent() {
                // Called when ad is dismissed.
                // Set the ad reference to null so you don't show the ad a second time.
                mRewardedAd = null
                initializeThankYou()
            }
        }
    }

    private fun initializeThankYou() {
        binding.laThankYou.apply {
            playAnimation()
            manageVisibility(true)
        }

        binding.laFireworks.apply {
            playAnimation()
            manageVisibility(true)
        }
    }

    private fun isInternetConnected(): Boolean {
        val connectionManager =
            requireActivity().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectionManager.activeNetworkInfo
        return activeNetwork?.isConnectedOrConnecting == true
    }
}