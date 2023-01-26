package my.application.ieltsspeaking.home.drawer_layout.give_suggestion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import my.application.ieltsspeaking.databinding.ActivityGiveSuggestionsBinding
import my.application.ieltsspeaking.utils.toast


class GiveSuggestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGiveSuggestionsBinding
    private lateinit var getter: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiveSuggestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {

            val title = binding.tvTitle.text
            getter = "mahkamov.nodirbek.95@gmail.com"
            val message = binding.etMessage.text.toString()

            sendEmail(title, message)
        }
    }

    private fun sendEmail(title: CharSequence, message: String) {

        val mIntent = Intent(Intent.ACTION_SENDTO).apply {

            type = "message/rfc822"
            data = Uri.parse("mailto:")
            putExtra(Intent.EXTRA_EMAIL, getter)
            putExtra(Intent.EXTRA_SUBJECT, title)
            putExtra(Intent.EXTRA_EMAIL, message)
        }

        try {
            startActivity(Intent.createChooser(mIntent, "Choose email..."))
        } catch (e: Exception) {
            toast(e.message.toString())
        }
    }
}