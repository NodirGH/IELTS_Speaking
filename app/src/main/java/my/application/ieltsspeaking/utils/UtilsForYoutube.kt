package my.application.ieltsspeaking.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

class UtilsForYoutube: YouTubeBaseActivity() {
    companion object {

        lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
        var youtubePlayer: YouTubePlayer? = null

        fun youtubeInitializer(context: Context) {

            youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
                override fun onInitializationSuccess(
                    p0: YouTubePlayer.Provider?,
                    youTubePlayer1: YouTubePlayer?,
                    p2: Boolean
                ) {
                    if (!p2) {
                        youtubePlayer = youTubePlayer1
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

        fun playVideo(videoId: String) {
            if (youtubePlayer != null) {
                youtubePlayer!!.loadVideo(videoId)
            }
        }

    }

    fun checkInternetConnection(context: Context): Boolean {

        val connectionManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectionManager.activeNetworkInfo
        return activeNetwork?.isConnectedOrConnecting == true
    }
}