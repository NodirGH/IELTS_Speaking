package my.application.ieltsspeaking.home.category.pronunciation.categories.useful_tips

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.PronunciationLayoutBinding
import my.application.ieltsspeaking.home.category.pronunciation.categories.adapter.PronunciationVideosAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.data.DataPronunciation
import my.application.ieltsspeaking.utils.*

class  UsefulTipsVideos: YouTubeBaseActivity() {

    private lateinit var adRequest: AdRequest
    private lateinit var adView: AdView
    private lateinit var binding: PronunciationLayoutBinding
    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private var youtubePlayer: YouTubePlayer? = null
    private var youtubeVideoId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adView = AdView(this)
        adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoUsefulTips()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick{
            override fun onVideoClick(position: Int) {
                if (UtilsForYoutube().checkInternetConnection(this@UsefulTipsVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    youtubeVideoId = position + 1
                    playVideo()
                } else snackBar(binding.root, "No internet connection")
                binding.youtubePlayer.initialize(googleApi, youtubePlayerInit)

            }
        })
    }

    fun youtubeInitializer(context: Context) {

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                youTubePlayer1: YouTubePlayer?,
                p2: Boolean
            ) {
                if (!p2) {
                    youtubePlayer = youTubePlayer1
                    playVideo()
                }
                youTubePlayer1?.setShowFullscreenButton(false)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun playVideo() {
        youtubeInitializer(this)
        if (youtubePlayer != null) {
            youtubePlayer!!.loadVideo(
                when (youtubeVideoId) {
                    1 -> "4Iqrm82LED4"
                    2 -> "-P-5RC17BHw"
                    3 -> "T7SWETadMn0"
                    4 -> "oN1fP2Ffty4"
                    5 -> "cWes7irLOzI"
                    6 -> "KmoJ-YpvxqQ"
                    7 -> "_WJAJ7Le-yM"
                    else -> "_WJAJ7Le-yM"
                }
            )
        }
    }
}