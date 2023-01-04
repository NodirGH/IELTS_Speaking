package my.application.ieltsspeaking.home.category.pronunciation.categories.phrasal_verbs

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

class PhrasalVerbsVideos: YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoPhrasalVerbs()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
            override fun onVideoClick(position: Int) {

                if (UtilsForYoutube().checkInternetConnection(this@PhrasalVerbsVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    UtilsForYoutube.playVideo(
                        videoId = when (position + 1) {
                            1 -> "MHKa48BWbPw"
                            2 -> "bNgCN3OPuIM"
                            3 -> "QXgeTOIYE1A"
                            4 -> "nIlnxm8m2ec"
                            5 -> "G2NwmcNKaHk"
                            6 -> "r7VKVXbaj_Y"
                            7 -> "wvxlX3kAsoU"
                            else -> "wvxlX3kAsoU"
                        }
                    )
                } else snackBar(binding.root, "No internet connection")

                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
            }
        })
        UtilsForYoutube.youtubeInitializer(this)
    }
}