package my.application.ieltsspeaking.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer

const val googleApi = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"


fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}

fun Context.snackBar(view: View, message: String) {
    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
}

fun View.manageVisibility(isVisible: Boolean) {
    if (isVisible)
        this.visibility = View.VISIBLE
    else
        this.visibility = View.GONE
}

class Extensions : YouTubeBaseActivity() {
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
                        Toast.makeText(context, "Success", Toast.LENGTH_SHORT)
                            .show()
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

    fun checkInternetConnection(view: View): Boolean {

        val connectionManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = connectionManager.activeNetworkInfo

        return activeNetwork?.isConnectedOrConnecting == true
    }

}