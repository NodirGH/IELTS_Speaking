package my.application.ieltsspeaking.home.category.vocabulary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.databinding.FragmentVocabularyBinding
import my.application.ieltsspeaking.home.category.vocabulary.adapter.VocabularyAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.work.VocabularyWorkFragment
import my.application.ieltsspeaking.home.category.vocabulary.data.VocabularyData
import my.application.ieltsspeaking.utils.UtilsForVocabulary
import my.application.ieltsspeaking.utils.toast

class VocabularyFragment : Fragment() {
    private lateinit var binding: FragmentVocabularyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvVocabulary.layoutManager = LinearLayoutManager(requireContext())
        val data = VocabularyData.getVocabularyData()
        val adapter = VocabularyAdapter(data)
        binding.rvVocabulary.adapter = adapter

        adapter.setOnWordClickListener(object : VocabularyAdapter.OnVocabularyWordCLickListener {
            override fun onItemClick(position: Int) {
                when (position + 1) {
                    1 ->  UtilsForVocabulary.navigateFragment(VocabularyWorkFragment(), parentFragmentManager)
                    2 -> requireContext().toast("Clicked 2")
                    3 -> requireContext().toast("Clicked 3")
                    4 -> requireContext().toast("Clicked 4")
                    5 -> requireContext().toast("Clicked 5")
                    6 -> requireContext().toast("Clicked 6")
                    7 -> requireContext().toast("Clicked 7")
                    8 -> requireContext().toast("Clicked 8")
                    9 -> requireContext().toast("Clicked 9")
                    10 -> requireContext().toast("Clicked 10")
                    else -> requireContext().toast("Error")
                }
            }
        })
    }
}