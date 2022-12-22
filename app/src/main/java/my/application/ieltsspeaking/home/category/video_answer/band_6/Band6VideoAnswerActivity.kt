package my.application.ieltsspeaking.home.category.video_answer.band_6

import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import my.application.ieltsspeaking.databinding.ActivityBand6VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer

class Band6VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand6VideoAnswerBinding
    private val googleApi = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"
    private var videoId: String? = null
    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private var isPlaying: Boolean = false

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
                Toast.makeText(this@Band6VideoAnswerActivity, "${position + 1}", Toast.LENGTH_SHORT)
                    .show()

                videoId = when (position + 1) {
                    1 -> "RBUbja6V9Aw"
                    2 -> "cfjWm3Q0LsA"
                    3 -> "RBUbja6V9Aw"
                    4 -> "cfjWm3Q0LsA"
                    5 -> "RBUbja6V9Aw"
                    6 -> "cfjWm3Q0LsA"
                    7 -> "RBUbja6V9Aw"
                    8 -> "cfjWm3Q0LsA"
                    9 -> "RBUbja6V9Aw"
                    10 -> "cfjWm3Q0LsA"
                    else -> "cfjWm3Q0LsA"
                }
                videoInitialed()
            }
        })

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                youTubePlayer1: YouTubePlayer?,
                p2: Boolean
            ) {
                youTubePlayer1?.loadVideo(videoId)
                Toast.makeText(this@Band6VideoAnswerActivity, "Success", Toast.LENGTH_SHORT).show()
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(this@Band6VideoAnswerActivity, "Error", Toast.LENGTH_SHORT).show()
            }
        }


    }

    private fun videoInitialed(){

        if (isPlaying) onStop()
        binding.youtubePlayer.initialize(googleApi, youtubePlayerInit)
        isPlaying = true

    }

}