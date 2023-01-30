package my.application.ieltsspeaking.home.drawer_layout.give_suggestion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
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
            getter = "nodirbek.dev.95@gmail.com"
            val message = binding.etMessage.text.toString().trim()

            sendViaGmail(getter, title, message)
        }
    }

    private fun sendViaGmail(getter: String, title: CharSequence?, message: String) {

        val mIntent = Intent(Intent.ACTION_SEND)
        mIntent.data = Uri.parse("mailto:")
        mIntent.type = "text/plain"
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(getter))
        mIntent.putExtra(Intent.EXTRA_SUBJECT, title)
        mIntent.putExtra(Intent.EXTRA_TEXT, message)

        try {
            startActivity(Intent.createChooser(mIntent, "Choose Email Client..."))
        } catch (e: Exception) {
            this.toast(e.toString(), length = Toast.LENGTH_LONG)
        }
    }
}