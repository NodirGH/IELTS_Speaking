package my.application.ieltsspeaking.home.category.vocabulary.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyCategoriesBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.adapter.VocabularyWordsAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.data.VocabularyDataForAll
import my.application.ieltsspeaking.home.category.vocabulary.globalTopicId
import my.application.ieltsspeaking.utils.navigateSafe

class VocabularyCategoriesFragment : BaseFragment<FragmentVocabularyCategoriesBinding>(FragmentVocabularyCategoriesBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()

        binding.btnTest.setOnClickListener{
            findNavController().navigateSafe(R.id.vocabularyTestFragment)
        }

        binding.btnStartLearning.setOnClickListener {
            findNavController().navigateSafe(R.id.vocabularyStartLearningFragment)
        }
    }

    private fun setRecyclerView() {
            val data = when(globalTopicId){
                1 -> VocabularyDataForAll.getWorkWords()
                2 -> VocabularyDataForAll.getTravelWords()
                3 -> VocabularyDataForAll.getTechnologyWords()
                4-> VocabularyDataForAll.getSportWords()
                5 -> VocabularyDataForAll.getScienceWords()
                6 -> VocabularyDataForAll.getRelationshipWords()
                7 -> VocabularyDataForAll.getAccommodationWords()
                8 -> VocabularyDataForAll. getEducationWords()
                9 -> VocabularyDataForAll.getHobbyWords()
                10 -> VocabularyDataForAll.getMixedWords()
                else -> VocabularyDataForAll.getWorkWords()
            }
            val adapter = VocabularyWordsAdapter(data)
            binding.rvVocabularyAll.layoutManager = LinearLayoutManager(requireContext())
            binding.rvVocabularyAll.adapter = adapter
    }
}