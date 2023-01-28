package my.application.ieltsspeaking.home.category.video_answer.band_6

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.databinding.ActivityBand6VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band6VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand6VideoAnswerBinding
    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    var youtubePlayer: YouTubePlayer? = null
    var youtubeVideoId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand6VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataVideoAnswer.videoAnswerBand6Data()
        val adapter = VideoAnswerAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@Band6VideoAnswerActivity)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    youtubeVideoId = position + 1
//                    UtilsForYoutube.playVideo(
//                        videoId = when (position + 1) {
//                            1 -> "MSoBQSoiIT8"
//                            2 -> "1G-aYE5N-4o"
//                            3 -> "4nt0W8qNLfE"
//                            4 -> "A0Yl-C692Zg"
//                            5 -> "X0SQAUJ0C5U"
//                            6 -> "SAM9iLnCKx8"
//                            else -> "SAM9iLnCKx8"
//                        }
//                    )
                    playVideo()
                } else snackBar(binding.root, "No internet connection")

//                if (UtilsForYoutube.youtubePlayer == null) {
//                    binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
                    binding.youtubePlayer.initialize(googleApi, youtubePlayerInit)
//                }
            }
        })
//        UtilsForYoutube.youtubeInitializer(this)
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
                    1 -> "MSoBQSoiIT8"
                    2 -> "1G-aYE5N-4o"
                    3 -> "4nt0W8qNLfE"
                    4 -> "A0Yl-C692Zg"
                    5 -> "X0SQAUJ0C5U"
                    6 -> "SAM9iLnCKx8"
                    else -> "SAM9iLnCKx8"
                }
            )
        }
    }
}