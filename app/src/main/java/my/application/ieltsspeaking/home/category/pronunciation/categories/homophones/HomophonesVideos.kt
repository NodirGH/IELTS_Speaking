package my.application.ieltsspeaking.home.category.pronunciation.categories.homophones

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.PronunciationLayoutBinding
import my.application.ieltsspeaking.home.category.pronunciation.categories.adapter.PronunciationVideosAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.data.DataPronunciation
import my.application.ieltsspeaking.utils.Extensions
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class HomophonesVideos: YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoHomophones()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
            override fun onVideoClick(position: Int) {

                if (Extensions().checkInternetConnection(this@HomophonesVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    Extensions.playVideo(
                        videoId = when (position + 1) {
                            1 -> "SMRx36QXdsI"
                            2 -> "azc-MTlbnFY"
                            3 -> "fEGNdYQH8fQ"
                            4 -> "vR-QqujzKMQ"
                            5 -> "RqPAeq3vA_s"
                            6 -> "6gHpjDQRUnc"
                            7 -> "BzCkqUwbxIE"
                            8 -> "lrewt5USFk0"
                            9 -> "oUa4FqVn2pA"
                            else -> "SMRx36QXdsI"
                        }
                    )
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, Extensions.youtubePlayerInit)
            }
        })
        Extensions.youtubeInitializer(this)

    }
}