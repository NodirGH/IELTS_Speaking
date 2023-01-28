package my.application.ieltsspeaking.home.category.video_answer.band_8

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.databinding.ActivityBand8VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band8VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand8VideoAnswerBinding
    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private var youtubePlayer: YouTubePlayer? = null
    private var youtubeVideoId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand8VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataVideoAnswer.videoAnswerBand8Data()
        val adapter = VideoAnswerAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

//        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
//            override fun onVideoClick(position: Int) {
//
//                if (UtilsForYoutube().checkInternetConnection(this@Band8VideoAnswerActivity)) {
//                    binding.ivIcYoutube.manageVisibility(false)
//                        UtilsForYoutube.videoId = when (position + 1) {
//                            1 -> "2blqaHXJ25w"
//                            2 -> "eaCxcVX9dfI"
//                            3 -> "eay1wXKPtws"
//                            4 -> "MUj-UaHrHS8"
//                            5 -> "FyUePxyZmSE"
//                            6 -> "Z6xj1ElwjiI"
//                            7 -> "sKugRINqAf0"
//                            8 -> "1WPrNqAxFnA"
//                            9 -> "DLdEdqx8d4g"
//                            10 -> "cWOOU1laA7U"
//                            else -> "cWOOU1laA7U"
//                        }
//                    UtilsForYoutube.playVideo()
//                } else snackBar(binding.root, "No internet connection")
//
//                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
//            }
//        })
//        UtilsForYoutube.youtubeInitializer()

        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@Band8VideoAnswerActivity)) {
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
                    1 -> "2blqaHXJ25w"
                    2 -> "eaCxcVX9dfI"
                    3 -> "eay1wXKPtws"
                    4 -> "MUj-UaHrHS8"
                    5 -> "FyUePxyZmSE"
                    6 -> "Z6xj1ElwjiI"
                    7 -> "sKugRINqAf0"
                    8 -> "1WPrNqAxFnA"
                    9 -> "DLdEdqx8d4g"
                    10 -> "cWOOU1laA7U"
                    else -> "cWOOU1laA7U"
                }
            )
        }
    }
}