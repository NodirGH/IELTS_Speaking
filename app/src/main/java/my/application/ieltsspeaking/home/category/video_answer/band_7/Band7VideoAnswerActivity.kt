package my.application.ieltsspeaking.home.category.video_answer.band_7

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.ActivityBand7VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.Extensions
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band7VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand7VideoAnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand7VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataVideoAnswer.videoAnswerBand7Data()
        val adapter = VideoAnswerAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
            override fun onVideoClick(position: Int) {

                if (Extensions().checkInternetConnection(this@Band7VideoAnswerActivity)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    Extensions.playVideo(
                        videoId = when (position + 1) {
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
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, Extensions.youtubePlayerInit)
            }
        })
        Extensions.youtubeInitializer(this)

    }
}