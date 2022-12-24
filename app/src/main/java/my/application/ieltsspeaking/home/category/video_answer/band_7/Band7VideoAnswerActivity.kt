package my.application.ieltsspeaking.home.category.video_answer.band_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.databinding.ActivityBand7VideoAnswerBinding
import my.application.ieltsspeaking.home.category.video_answer.band_6.Band6VideoAnswerActivity
import my.application.ieltsspeaking.utils.Extensions
import my.application.ieltsspeaking.utils.toast

class Band7VideoAnswerActivity : YouTubeBaseActivity() {

    private lateinit var binding: ActivityBand7VideoAnswerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBand7VideoAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (Extensions().checkInternetConnection(this)){
                toast("Connected")
            } else toast("Not connected")
        }

    }
}