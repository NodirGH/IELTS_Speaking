package my.application.ieltsspeaking.home.category.video_answer.band_6

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.ActivityBand6VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band6VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand6VideoAnswerBinding

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
                    UtilsForYoutube.playVideo(
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
                } else snackBar(binding.root, "No internet connection")

                if (UtilsForYoutube.youtubePlayer == null) {
                    binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
                }
            }
        })
        UtilsForYoutube.youtubeInitializer(this)
    }
}