package my.application.ieltsspeaking.home.category.video_answer.band_6

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerSupportFragment
import com.google.android.youtube.player.YouTubePlayerView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentBand6AnswerBinding


class Band6AnswerFragment : Fragment() {

    private val videoId = "de3kFn4DzGg"
    private val googleApiKey = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"

    private lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener
    private lateinit var youTubePlayer: YouTubePlayerView
    private lateinit var btnPlay: Button
    private lateinit var binding: FragmentBand6AnswerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBand6AnswerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val youTubePlayerFragment = YouTubePlayerSupportFragment()
//
//        youTubePlayerFragment.initialize(googleApiKey, object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(
//                provider: YouTubePlayer.Provider?,
//                player: YouTubePlayer,
//                wasRestored: Boolean
//            ) {
//                if (!wasRestored) {
////                    YPlayer = player
////                    YPlayer.setFullscreen(true)
////                    YPlayer.loadVideo("2zNSgSzhBfM")
////                    YPlayer.play()
//                    player.loadVideo(videoId)
//                }
//            }
//
//            override fun onInitializationFailure(arg0: YouTubePlayer.Provider?, arg1: YouTubeInitializationResult?) {
//                // TODO Auto-generated method stub
//            }
//        })
//        val transaction: FragmentTransaction = childFragmentManager.beginTransaction()
//        transaction.add(R.id.youtubeFragment, youTubePlayerFragment).commit()

//        youtubePlayerInit = object : YouTubePlayer.OnInitializedListener {
//            override fun onInitializationSuccess(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubePlayer?,
//                p2: Boolean
//            ) {
//                p1?.loadVideo(videoId)
//            }
//
//            override fun onInitializationFailure(
//                p0: YouTubePlayer.Provider?,
//                p1: YouTubeInitializationResult?
//            ) {
//
//            }
//        }
//
//        binding.btnPlay.setOnClickListener {
//            youTubePlayer.initialize(googleApiKey, youtubePlayerInit)
//        }

    }

}