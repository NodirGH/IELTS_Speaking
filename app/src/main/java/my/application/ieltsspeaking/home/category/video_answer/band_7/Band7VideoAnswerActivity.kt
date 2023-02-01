package my.application.ieltsspeaking.home.category.video_answer.band_7

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.databinding.ActivityBand7VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band7VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var adRequest: AdRequest
    private lateinit var adView: AdView
    private lateinit var binding: ActivityBand7VideoAnswerBinding
    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    var youtubePlayer: YouTubePlayer? = null
    var youtubeVideoId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand7VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adView = AdView(this)
        adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)
        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataVideoAnswer.videoAnswerBand7Data()
        val adapter = VideoAnswerAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@Band7VideoAnswerActivity)) {
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
                    1 -> "EoUL4lTsis4"
                    2 -> "3wvX1FMprVk"
                    3 -> "2Wguf-efyUA"
                    4 -> "0NCHcZYGW7w"
                    5 -> "dJRauTKnbg4"
                    6 -> "62KYznhM0k4"
                    7 -> "kvi7fPYLUuM"
                    8 -> "Aj8kC_kWieE"
                    9 -> "5kLzp9juRYA"
                    10 -> "nzvnMFvqn9g"
                    else -> "SAM9iLnCKx8"
                }
            )
        }
    }
}