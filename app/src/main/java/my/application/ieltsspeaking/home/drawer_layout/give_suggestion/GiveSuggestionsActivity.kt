package my.application.ieltsspeaking.home.drawer_layout.give_suggestion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import my.application.ieltsspeaking.databinding.ActivityGiveSuggestionsBinding
import my.application.ieltsspeaking.utils.toast

class GiveSuggestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGiveSuggestionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGiveSuggestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSend.setOnClickListener {

            val sender = binding.tvSender.text.trim()
            val getter = binding.tvGetter.text.trim()
            val message = binding.etMessage.text.toString().trim()


//            val addresses = getter.split(",".toRegex()).toTypedArray()
//
//            val intent = Intent(Intent.ACTION_SENDTO).apply {
//
//                data = Uri.parse("mailto:")
//                putExtra(Intent.EXTRA_EMAIL, addresses)
//                putExtra(Intent.EXTRA_SUBJECT, sender)
//                putExtra(Intent.EXTRA_TEXT, message)

            sendEmail(getter, sender, message)

        }

//            if (intent.resolveActivity(packageManager) != null) {
//                startActivity(intent)
//            } else toast("Required app is not installed")
//
//        }



    }

    private fun sendEmail(getter: CharSequence, sender: CharSequence, message: String) {

        val mIntent = Intent(Intent.ACTION_SEND).apply {
//            type = "text/plain"
//            data = Uri.parse("mailto:")
            setDataAndType(Uri.parse("mailto:"), "text/plain")
            putExtra(Intent.EXTRA_EMAIL, getter)
            putExtra(Intent.EXTRA_SUBJECT, sender)
            putExtra(Intent.EXTRA_EMAIL, message)
        }

        try {
            startActivity(Intent.createChooser(mIntent, "Choose email..."))
        } catch (e: Exception) {
            toast(e.message.toString())
        }

    }
}