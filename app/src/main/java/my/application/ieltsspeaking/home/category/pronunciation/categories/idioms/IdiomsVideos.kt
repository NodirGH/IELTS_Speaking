package my.application.ieltsspeaking.home.category.pronunciation.categories.idioms

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.databinding.PronunciationLayoutBinding
import my.application.ieltsspeaking.home.category.pronunciation.categories.adapter.PronunciationVideosAdapter
import my.application.ieltsspeaking.home.category.pronunciation.categories.data.DataPronunciation
import my.application.ieltsspeaking.utils.UtilsForYoutube
import my.application.ieltsspeaking.utils.googleApi
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.snackBar

class IdiomsVideos: YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding
    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private var youtubePlayer: YouTubePlayer? = null
    private var youtubeVideoId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoIdioms()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

//        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
//            override fun onVideoClick(position: Int) {
//
//                if (UtilsForYoutube().checkInternetConnection(this@IdiomsVideos)) {
//                    binding.ivIcYoutube.manageVisibility(false)
//                    UtilsForYoutube.playVideo(
//                        videoId = when (position + 1) {
//                            1 -> "Hm-n-_uqCvQ"
//                            2 -> "XvsopmnMfg8"
//                            3 -> "KJS77wXttpI"
//                            4 -> "qS-5D7HLmuI"
//                            5 -> "awUqKKEKQh4"
//                            6 -> "HclqADvf35Y"
//                            7 -> "XVbTrlCmuM8"
//                            8 -> "gdU1sFMI5uo"
//                            9 -> "P4F9n8Q_Fe8"
//                            else -> "P4F9n8Q_Fe8"
//                        }
//                    )
//                } else snackBar(binding.root, "No internet connection")
//
//                binding.youtubePlayer.initialize(googleApi, UtilsForYoutube.youtubePlayerInit)
//            }
//        })
//        UtilsForYoutube.youtubeInitializer(this)

        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick{
            override fun onVideoClick(position: Int) {
                if (UtilsForYoutube().checkInternetConnection(this@IdiomsVideos)) {
                    binding.ivIcYoutube.manageVisibility(false)
                    youtubeVideoId = position + 1
                    playVideo()
                } else snackBar(binding.root, "No internet connection")
                binding.youtubePlayer.initialize(googleApi, youtubePlayerInit)

            }
        })
    }

    fun youtubeInitializer(context: Context) {

        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                youTubePlayer1: YouTubePlayer?,
                p2: Boolean
            ) {
                if (!p2) {
                    youtubePlayer = youTubePlayer1
                    playVideo()
                }
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun playVideo() {
        youtubeInitializer(this)
        if (youtubePlayer != null) {
            youtubePlayer!!.loadVideo(
                when (youtubeVideoId) {
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
        }
    }
}