package my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import androidx.navigation.fragment.findNavController
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.DialogStartLearningBinding
import my.application.ieltsspeaking.databinding.FragmentStartLearningBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.data.LearningWordsCollection
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.model.ModelStartLearning
import my.application.ieltsspeaking.home.category.vocabulary.globalTopicId
import my.application.ieltsspeaking.utils.manageVisibility

class StartLearningFragment : BaseFragment<FragmentStartLearningBinding>(FragmentStartLearningBinding::inflate), OnClickListener {

    private var currentPosition = 1
    private lateinit var wordList: ArrayList<ModelStartLearning>
    private lateinit var bindingFinishLearning: DialogStartLearningBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setLearningWords()
    }

    private fun setLearningWords() {

        wordList = when (globalTopicId) {
            1 -> LearningWordsCollection.getWorkWords()
            2 -> LearningWordsCollection.getTravelWords()
            3 -> LearningWordsCollection.getTechnologyWords()
            4 -> LearningWordsCollection.getSportWords()
            5 -> LearningWordsCollection.getScienceWords()
            6 -> LearningWordsCollection.getRelationshipWords()
            7 -> LearningWordsCollection.getAccommodationWords()
            8 -> LearningWordsCollection.getEducationWords()
            9 -> LearningWordsCollection.getHobbyWords()
            10 -> LearningWordsCollection.getMixedWords()
            else -> LearningWordsCollection.getTravelWords()

        }
        binding.btnLearnedStartLearning.setOnClickListener(this)
        setWords()
        rotateFlipCard()
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnLearnedStartLearning -> {
                currentPosition++
                if (currentPosition <= wordList.size) {
                    setWords()
                } else {
                    alertDialog()
                }
            }
        }
    }

    private fun setWords(
    ) {
        val word = wordList[currentPosition - 1]
        binding.tvFlipCardFront.text = word.word
        binding.tvFlipCardDefinition.text = word.definition
        binding.tvFlipCardExample.text = word.example
        binding.pbProgressBarStartLearning.progress = currentPosition
        binding.pbProgressBarStartLearning.max = wordList.size
        binding.tvProgressBarCounterStartLearning.text = "$currentPosition/${wordList.size}"
    }

    private fun rotateFlipCard() {

        var isFront = true

        val scale = requireActivity().applicationContext.resources.displayMetrics.density
        binding.tvFlipCardFront.cameraDistance = 8000 * scale
        binding.llFlipCardBack.cameraDistance = 8000 * scale

        val frontAnim = AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.flip_card_front_animation
        ) as AnimatorSet
        val backAnim = AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.flip_card_back_animation
        ) as AnimatorSet

        binding.tvFlipCardFront.setOnClickListener {
            if (isFront) {
                frontAnim.setTarget(binding.tvFlipCardFront)
                backAnim.setTarget(binding.llFlipCardBack)
                frontAnim.start()
                backAnim.start()
                isFront = false
                binding.llFlipCardBack.manageVisibility(true)
            } else {
                frontAnim.setTarget(binding.llFlipCardBack)
                backAnim.setTarget(binding.tvFlipCardFront)
                backAnim.start()
                frontAnim.start()
                isFront = true
                binding.tvFlipCardFront.manageVisibility(true)
            }
        }
    }

    private fun alertDialog() {

        bindingFinishLearning = DialogStartLearningBinding.inflate(
            LayoutInflater.from(requireContext()),
            binding.root,
            false
        )
        val mBuilder = AlertDialog.Builder(requireContext())
            .setView(bindingFinishLearning.root)
        val mAlertDialog = mBuilder.show()

        bindingFinishLearning.btnFinish.setOnClickListener {
            val action =
                StartLearningFragmentDirections.actionVocabularyStartLearningFragmentToVocabularyCategoriesFragment()
            findNavController().navigate(action)
            mAlertDialog.dismiss()
        }
    }
}