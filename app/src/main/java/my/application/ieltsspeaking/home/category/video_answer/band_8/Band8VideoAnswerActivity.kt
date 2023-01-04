package my.application.ieltsspeaking.home.category.video_answer.band_8

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.ActivityBand8VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.adapter.VideoAnswerAdapter
import my.application.ieltsspeaking.home.category.video_answer.data.DataVideoAnswer
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class Band8VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand8VideoAnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand8VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataVideoAnswer.videoAnswerBand8Data()
        val adapter = VideoAnswerAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnVideoAnswerListener(object : VideoAnswerAdapter.OnVideoAnswerClickListener {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@Band8VideoAnswerActivity)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    UtilsForYoutube.playVideo(
                        videoId = when (position + 1) {
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
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
            }
        })
        UtilsForYoutube.youtubeInitializer(this)
    }
}