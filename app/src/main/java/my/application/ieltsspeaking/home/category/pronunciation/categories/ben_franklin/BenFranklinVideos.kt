package my.application.ieltsspeaking.home.category.pronunciation.categories.ben_franklin

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.PronunciationLayoutBinding
import my.application.ieltsspeaking.home.category.pronunciation.categories.adapter.PronunciationVideosAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.data.DataPronunciation
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class BenFranklinVideos:YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoBenFranklin()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@BenFranklinVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    UtilsForYoutube.playVideo(
                        videoId = when (position + 1) {
                            1 -> "m3g51xfopIE"
                            2 -> "UNnzPydhQXU"
                            3 -> "cEda3liHF1U"
                            4 -> "j8_fY2m3NG4"
                            5 -> "Wr6JCyVixPA"
                            6 -> "xWIKLeRGqpE"
                            7 -> "TDV96EQBk8I"
                            8 -> "wuLIUtrSE-g"
                            9 -> "Qyy4wKhO-ZE"
                            10 -> "q7SAt9h4sd0"
                            else -> "q7SAt9h4sd0"
                        }
                    )
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
            }
        })
        UtilsForYoutube.youtubeInitializer(this)
    }
}