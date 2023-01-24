package my.application.ieltsspeaking.home.category.vocabulary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyBinding
import my.application.ieltsspeaking.home.category.vocabulary.adapter.VocabularyAdapter
import my.application.ieltsspeaking.home.category.vocabulary.data.VocabularyData
import my.application.ieltsspeaking.utils.navigateSafe

var globalTopicId = 0
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

                findNavController().navigateSafe(R.id.vocabularyCategoriesFragment)
                globalTopicId = position+1
            }
        })
    }
}