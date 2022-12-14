package my.application.ieltsspeaking.home.category.video_answer.band_7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import my.application.ieltsspeaking.databinding.FragmentBand7AnswerBinding

class Band7AnswerFragment : Fragment() {
    private lateinit var binding: FragmentBand7AnswerBinding
    private lateinit var youtubePlayerInitializer: YouTubePlayer.OnInitializedListener
    val videoId = "de3kFn4DzGg"
    private val googleApi = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBand7AnswerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        youtubePlayerInitializer = object : YouTubePlayer.OnInitializedListener {
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                youtubePlayer: YouTubePlayer?,
                p2: Boolean
            ) {
                youtubePlayer?.loadVideo(videoId)
                Toast.makeText(requireContext(), "Success", Toast.LENGTH_SHORT).show()
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Toast.makeText(requireContext(), "Failed", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnPlay.setOnClickListener {
            binding.ytpBand7.initialize(googleApi, youtubePlayerInitializer)
        }
    }
}