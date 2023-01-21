package my.application.ieltsspeaking.home.drawer_layout.give_suggestion

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentGiveSuggestionsBinding


open class GiveSuggestionsFragment : Fragment() {
    private lateinit var binding: FragmentGiveSuggestionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGiveSuggestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sender = binding.tvSender.text
        val getter = binding.tvGetter.text
        val message = binding.etMessage.text

        val addresses = getter.split(",".toRegex()).toTypedArray()

        val intent = Intent(Intent.ACTION_SENDTO).apply {

            data = Uri.parse("mailTo:")
            putExtra(Intent.EXTRA_EMAIL, addresses)
            putExtra(Intent.EXTRA_SUBJECT, sender)
            putExtra(Intent.EXTRA_TEXT, message)
        }

            startActivity(intent)
    }
}