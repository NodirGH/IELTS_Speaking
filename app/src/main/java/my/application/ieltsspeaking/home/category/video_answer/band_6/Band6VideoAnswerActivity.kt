package my.application.ieltsspeaking.home.category.video_answer.band_6

import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.databinding.ActivityBand6VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer

class Band6VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand6VideoAnswerBinding
    private val googleApi = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"
    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private var mPlayer: YouTubePlayer? = null

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

                playVideo(
                    videoId = when (position + 1) {
                        1 -> "MSoBQSoiIT8"
                        2 -> "1G-aYE5N-4o"
                        3 -> "4nt0W8qNLfE"
                        4 -> "A0Yl-C692Zg"
                        5 -> "X0SQAUJ0C5U"
                        6 -> "SAM9iLnCKx8"
                        else -> "SAM9iLnCKx8"
                    }
                )
                binding.youtubePlayer.initialize(googleApi, youtubePlayerInit)
            }
        })

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                youTubePlayer1: YouTubePlayer?,
                p2: Boolean
            ) {
                if (!p2) {
                    mPlayer = youTubePlayer1
                    Toast.makeText(this@Band6VideoAnswerActivity, "Success", Toast.LENGTH_SHORT)
                        .show()
                }
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(this@Band6VideoAnswerActivity, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun playVideo(videoId: String) {
        if (mPlayer != null) {
            mPlayer!!.loadVideo(videoId)
        }
    }

}