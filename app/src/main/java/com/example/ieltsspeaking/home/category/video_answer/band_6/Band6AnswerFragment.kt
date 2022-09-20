package com.example.ieltsspeaking.home.category.video_answer.band_6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentBand6AnswerBinding
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerFragment
import java.io.IOException

class Band6AnswerFragment : Fragment(){

    private val videoId = "de3kFn4DzGg"
    private val googleApi = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"

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

        val youtubePlayerInit: YouTubePlayer.OnInitializedListener =object :YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                provider: YouTubePlayer.Provider?,
                player: YouTubePlayer?,
                wasRestored: Boolean
            ) {
                if (player == null) return
                if (wasRestored){
                    player.play()
                }else{
                player.cueVideo(videoId)
                    player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT)
                }
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Log.d("Youtube Player", "Failed to initialize")
            }
        }
//        binding.btnPlay.setOnClickListener {
//
//        }

        val youTubePlayerFragment = childFragmentManager.findFragmentById(R.id.youtubePlayer) as YouTubePlayerFragment?
        youTubePlayerFragment?.initialize(googleApi, youtubePlayerInit)
    }

}