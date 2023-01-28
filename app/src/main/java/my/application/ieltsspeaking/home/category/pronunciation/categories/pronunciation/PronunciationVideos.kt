package my.application.ieltsspeaking.home.category.pronunciation.categories.pronunciation

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

class PronunciationVideos: YouTubeBaseActivity() {

    private lateinit var binding: PronunciationLayoutBinding
    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private var youtubePlayer: YouTubePlayer? = null
    private var youtubeVideoId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = PronunciationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvYoutubeVideoAnswer.layoutManager = LinearLayoutManager(this)
        val data = DataPronunciation.videoPronunciation()
        val adapter = PronunciationVideosAdapter(data)
        binding.rvYoutubeVideoAnswer.adapter = adapter

//        adapter.setOnPronunciationVideo(object : PronunciationVideosAdapter.OnPronunciationVideoClick {
//            override fun onVideoClick(position: Int) {
//
//                if (UtilsForYoutube().checkInternetConnection(this@PronunciationVideos)) {
//                    binding.ivIcYoutube.manageVisibility(false)
//                    UtilsForYoutube.playVideo(
//                        videoId = when (position + 1) {
//                            1 -> "n4NVPg2kHv4"
//                            2 -> "3KaYtW-MjPQ"
//                            3 -> "lA5fMN0tCs8"
//                            4 -> "Rf-PvKimC6g"
//                            5 -> "UF4lWPgrNbg"
//                            6 -> "vv7cBMCBUdk"
//                            7 -> "zmeNGtRegvM"
//                            8 -> "pWCkrogNnzg"
//                            else -> "pWCkrogNnzg"
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
                if (UtilsForYoutube().checkInternetConnection(this@PronunciationVideos)) {
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
                    1 -> "n4NVPg2kHv4"
                    2 -> "3KaYtW-MjPQ"
                    3 -> "lA5fMN0tCs8"
                    4 -> "Rf-PvKimC6g"
                    5 -> "UF4lWPgrNbg"
                    6 -> "vv7cBMCBUdk"
                    7 -> "zmeNGtRegvM"
                    8 -> "pWCkrogNnzg"
                    else -> "pWCkrogNnzg"
                }
            )
        }
    }
}