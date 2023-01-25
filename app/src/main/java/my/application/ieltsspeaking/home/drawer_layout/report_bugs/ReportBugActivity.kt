package my.application.ieltsspeaking.home.drawer_layout.report_bugs

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.ActivityReportBugBinding
import my.application.ieltsspeaking.utils.toast

class ReportBugActivity : AppCompatActivity() {
    private lateinit var getter: String
    private lateinit var binding: ActivityReportBugBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportBugBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {

            val title = binding.tvTitle.text
            getter = "mahkamov.nodirbek.95@gmail.com"
            val message = binding.etMessage.text.toString().trim()

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