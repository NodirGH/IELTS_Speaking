package my.application.ieltsspeaking.home.category.pronunciation.categories.idioms

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

class IdiomsVideos: YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoIdioms()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@IdiomsVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    UtilsForYoutube.playVideo(
                        videoId = when (position + 1) {
                            1 -> "Hm-n-_uqCvQ"
                            2 -> "XvsopmnMfg8"
                            3 -> "KJS77wXttpI"
                            4 -> "qS-5D7HLmuI"
                            5 -> "awUqKKEKQh4"
                            6 -> "HclqADvf35Y"
                            7 -> "XVbTrlCmuM8"
                            8 -> "gdU1sFMI5uo"
                            9 -> "P4F9n8Q_Fe8"
                            else -> "P4F9n8Q_Fe8"
                        }
                    )
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
            }
        })
        UtilsForYoutube.youtubeInitializer(this)
    }
}