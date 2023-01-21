package my.application.ieltsspeaking.home.category.pronunciation.categories.useful_tips

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.PronunciationLayoutBinding
import my.application.ieltsspeaking.home.category.pronunciation.categories.adapter.PronunciationVideosAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.data.DataPronunciation
import my.application.ieltsspeaking.utils.*

class  UsefulTipsVideos: YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoUsefulTips()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@UsefulTipsVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    UtilsForYoutube.playVideo(
                        videoId = when (position + 1) {
                            1 -> "4Iqrm82LED4"
                            2 -> "-P-5RC17BHw"
                            3 -> "T7SWETadMn0"
                            4 -> "oN1fP2Ffty4"
                            5 -> "cWes7irLOzI"
                            6 -> "KmoJ-YpvxqQ"
                            7 -> "_WJAJ7Le-yM"
                            else -> "_WJAJ7Le-yM"
                        }
                    )
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
            }
        })
        UtilsForYoutube.youtubeInitializer(this)
    }
}