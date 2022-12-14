package my.application.ieltsspeaking.home.category.pronunciation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.databinding.FragmentPronunciationBinding

class PronunciationFragment : Fragment() {
    private lateinit var binding: FragmentPronunciationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPronunciationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPronunciation.layoutManager = LinearLayoutManager(requireContext())
        val data = DataPronunciation.getPronunciationData()
        val adapter = PronunciationAdapter(data)
        binding.rvPronunciation.adapter = adapter

    }
}