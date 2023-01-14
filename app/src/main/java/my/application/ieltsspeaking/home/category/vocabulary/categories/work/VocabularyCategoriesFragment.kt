package my.application.ieltsspeaking.home.category.vocabulary.categories.work

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.databinding.FragmentVocabularyCategoriesBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.adapter.VocabularyWordsAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.data.VocabularyDataForAll
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.StartLearningFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.WorkTestFragment
import my.application.ieltsspeaking.home.category.vocabulary.globalTopicId
import my.application.ieltsspeaking.utils.UtilsForVocabulary

class VocabularyCategoriesFragment : Fragment() {
    private lateinit var binding: FragmentVocabularyCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setRecyclerView()

        binding.btnWorkTest.setOnClickListener{
            UtilsForVocabulary.navigateFragment(WorkTestFragment(), parentFragmentManager)
        }

        binding.btnWorkStartLearning.setOnClickListener {
            UtilsForVocabulary.navigateFragment(StartLearningFragment(), parentFragmentManager)
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
            binding.rvVocabularyWork.layoutManager = LinearLayoutManager(requireContext())
            binding.rvVocabularyWork.adapter = adapter


    }
}