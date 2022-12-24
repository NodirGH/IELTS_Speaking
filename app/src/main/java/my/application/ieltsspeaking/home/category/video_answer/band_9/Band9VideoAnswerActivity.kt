package my.application.ieltsspeaking.home.category.video_answer.band_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.ActivityBand9VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.Extensions
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band9VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand9VideoAnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand9VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataVideoAnswer.videoAnswerBand9Data()
        val adapter = VideoAnswerAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
            override fun onVideoClick(position: Int) {

                if (Extensions().checkInternetConnection(this@Band9VideoAnswerActivity)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    Extensions.playVideo(
                        videoId = when (position + 1) {
                            1 -> "-vW-QUI__LA"
                            2 -> "rAoJ8TN5bAE"
                            3 -> "MAQpZloh78A"
                            4 -> "lj_sEsay9ro"
                            5 -> "TneqhthYz_w"
                            6 -> "EuMfmdxP69E"
                            7 -> "8BGO5IU6mw0"
                            8 -> "hs6HBKpN36c"
                            9 -> "jTW7eubvi_c"
                            10 -> "I_VTQP4UPWE"
                            11 -> "V6twSFNeUk4"
                            12 -> "o2EkKh8-Z2c"
                            else -> "o2EkKh8-Z2c"
                        }
                    )
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, Extensions.youtubePlayerInit)
            }
        })
        Extensions.youtubeInitializer(this)

    }
}