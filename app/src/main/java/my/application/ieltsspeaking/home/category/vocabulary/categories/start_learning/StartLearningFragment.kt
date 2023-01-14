package my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentStartLearningBinding
import my.application.ieltsspeaking.home.category.vocabulary.VocabularyFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.data.LearningWordsCollection
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.model.ModelStartLearning
import my.application.ieltsspeaking.home.category.vocabulary.globalTopicId
import my.application.ieltsspeaking.utils.UtilsForVocabulary

class StartLearningFragment : Fragment(), OnClickListener {

    private lateinit var binding: FragmentStartLearningBinding
    private var currentPosition = 1
    private var wordList: ArrayList<ModelStartLearning>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartLearningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            UtilsForVocabulary.context = requireContext()
        setLearningWords()

    }

    private fun setLearningWords() {

        wordList = when(globalTopicId){
            1-> LearningWordsCollection.getWorkWords()
            2-> LearningWordsCollection.getTravelWords()
            3-> LearningWordsCollection.getTechnologyWords()
            4 -> LearningWordsCollection.getSportWords()
            5-> LearningWordsCollection.getScienceWords()
            6 -> LearningWordsCollection.getRelationshipWords()
            7 -> LearningWordsCollection.getAccommodationWords()
            8 -> LearningWordsCollection.getEducationWords()
            9 -> LearningWordsCollection.getHobbyWords()
            10 -> LearningWordsCollection.getMixedWords()
            else -> LearningWordsCollection.getTravelWords()

        }
        binding.btnLearnedStartLearning.setOnClickListener(this)
        UtilsForVocabulary.setWords(
            wordList,
            currentPosition,
            binding.tvFlipCardFront,
            binding.tvFlipCardDefinition,
            binding.tvFlipCardExample,
            binding.pbProgressBarStartLearning,
            wordList!!.size,
            binding.tvProgressBarCounterStartLearning
        )
        UtilsForVocabulary.rotateFlipCard(
            requireActivity(),
            binding.tvFlipCardFront,
            binding.llFlipCardBack,
            requireContext()
        )
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnLearnedStartLearning -> {
                currentPosition++
                if (currentPosition <= wordList!!.size) {
                    UtilsForVocabulary.setWords(
                        wordList,
                        currentPosition,
                        binding.tvFlipCardFront,
                        binding.tvFlipCardDefinition,
                        binding.tvFlipCardExample,
                        binding.pbProgressBarStartLearning,
                        wordList!!.size,
                        binding.tvProgressBarCounterStartLearning
                    )
                } else {
                    UtilsForVocabulary.alertDialog(
                        VocabularyFragment(),
                        parentFragmentManager)

                }
            }
        }
    }
}