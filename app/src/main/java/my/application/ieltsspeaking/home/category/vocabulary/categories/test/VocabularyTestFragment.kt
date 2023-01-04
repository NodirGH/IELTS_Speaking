package my.application.ieltsspeaking.home.category.vocabulary.categories.test

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyTestBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.result.VocabularyResultFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.data.Constants
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.model.Question
import my.application.ieltsspeaking.utils.UtilsForVocabulary

class WorkTestFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentVocabularyTestBinding
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var isCheckPressed: Boolean = false
    private var isOptionSelected: Boolean = false
    var correctAnswers: Int = 0
    var incorrectAnswers: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mQuestionsList = Constants.getWorkQuestions()

        UtilsForVocabulary.setQuestionTest(
            binding.btnCheck,
            binding.pbProgressBar,
            binding.tvProgressBarCounter,
            binding.tvQuestion,
            binding.tvOptionOne,
            binding.tvOptionTwo,
            binding.tvOptionThree,
            binding.tvOptionFour,
            mQuestionsList,
            mCurrentPosition,
            binding.laCorrect,
            binding.laIncorrect
        )

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnCheck.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.tvOptionOne -> {
                UtilsForVocabulary.defaultOptionsView(
                    binding.tvOptionOne,
                    binding.tvOptionTwo,
                    binding.tvOptionThree,
                    binding.tvOptionFour,
                    requireContext(),
                    binding.btnCheck
                )
                selectedOptionView(binding.tvOptionOne, 1)
            }

            R.id.tvOptionTwo -> {
                UtilsForVocabulary.defaultOptionsView(
                    binding.tvOptionOne,
                    binding.tvOptionTwo,
                    binding.tvOptionThree,
                    binding.tvOptionFour,
                    requireContext(),
                    binding.btnCheck
                )
                selectedOptionView(binding.tvOptionTwo, 2)

            }

            R.id.tvOptionThree -> {
                UtilsForVocabulary.defaultOptionsView(
                    binding.tvOptionOne,
                    binding.tvOptionTwo,
                    binding.tvOptionThree,
                    binding.tvOptionFour,
                    requireContext(),
                    binding.btnCheck
                )
                selectedOptionView(binding.tvOptionThree, 3)
                isOptionSelected = true

            }

            R.id.tvOptionFour -> {
                UtilsForVocabulary.defaultOptionsView(
                    binding.tvOptionOne,
                    binding.tvOptionTwo,
                    binding.tvOptionThree,
                    binding.tvOptionFour,
                    requireContext(),
                    binding.btnCheck
                )
                selectedOptionView(binding.tvOptionFour, 4)
                isOptionSelected = true

            }

            R.id.btnCheck -> {

                UtilsForVocabulary.btnCheckFunction(
                    isOptionSelected,
                    isCheckPressed,
                    mQuestionsList,
                    mCurrentPosition,
                    mSelectedOptionPosition,
                    binding.tvOptionOne,
                    binding.tvOptionTwo,
                    binding.tvOptionThree,
                    binding.tvOptionFour,
                    requireContext(),
                    binding.laCorrect,
                    binding.laIncorrect,
                    binding.btnCheck,
                    binding.pbProgressBar,
                    binding.tvProgressBarCounter,
                    binding.tvQuestion,
                    correctAnswers,
                    incorrectAnswers
                )

                val vocabularyBtnCheck = UtilsForVocabulary.btnCheckFunction(
                    isOptionSelected,
                    isCheckPressed,
                    mQuestionsList,
                    mCurrentPosition,
                    mSelectedOptionPosition,
                    binding.tvOptionOne,
                    binding.tvOptionTwo,
                    binding.tvOptionThree,
                    binding.tvOptionFour,
                    requireContext(),
                    binding.laCorrect,
                    binding.laIncorrect,
                    binding.btnCheck,
                    binding.pbProgressBar,
                    binding.tvProgressBarCounter,
                    binding.tvQuestion,
                    correctAnswers,
                    incorrectAnswers
                )
                correctAnswers = vocabularyBtnCheck.correctA
                incorrectAnswers = vocabularyBtnCheck.incorrectA
                mSelectedOptionPosition = vocabularyBtnCheck.mySelectedPosition
                isCheckPressed = vocabularyBtnCheck.isCheckPressed
                mCurrentPosition = vocabularyBtnCheck.currentPosition
                isOptionSelected = vocabularyBtnCheck.isOptionSelected

                //                if (isOptionSelected) {
//
//                    if (!isCheckPressed) {
//                        val question = mQuestionsList?.get(mCurrentPosition - 1)
//                        if (question!!.correctAnswer != mSelectedOptionPosition) {
//                            UtilsForVocabulary.answerView(mSelectedOptionPosition, R.drawable.bg_incorrect_option_border, binding.tvOptionOne, binding.tvOptionTwo, binding.tvOptionThree, binding.tvOptionFour, requireContext())
//                            incorrectAnswers++
//                            binding.laIncorrect.manageVisibility(true)
//                            binding.laIncorrect.playAnimation()
//
//                        } else {
//                            correctAnswers++
//                            binding.laCorrect.manageVisibility(true)
//                            binding.laCorrect.playAnimation()
//                        }
//
//                        UtilsForVocabulary.answerView(question.correctAnswer, R.drawable.bg_correct_option_border, binding.tvOptionOne, binding.tvOptionTwo, binding.tvOptionThree, binding.tvOptionFour, requireContext())
//
//                        if (mCurrentPosition == mQuestionsList!!.size) {
//                            if (question.correctAnswer != mSelectedOptionPosition) {
//                                UtilsForVocabulary.answerView(mSelectedOptionPosition, R.drawable.bg_incorrect_option_border, binding.tvOptionOne, binding.tvOptionTwo, binding.tvOptionThree, binding.tvOptionFour, requireContext())
//                            }
//                            UtilsForVocabulary.answerView(question.correctAnswer, R.drawable.bg_correct_option_border, binding.tvOptionOne, binding.tvOptionTwo, binding.tvOptionThree, binding.tvOptionFour, requireContext())
//                            binding.btnCheck.text = getString(R.string.show_result)
//                            requireContext().toast("You have successfully completed the Quiz")
//
//                            binding.btnCheck.setBackgroundResource(R.drawable.bg_fnish_button_enabled)
//                            binding.btnCheck.setOnClickListener {
//                                navigateToResultFragment()
//                            }
//                        } else {
//                            binding.btnCheck.text = getString(R.string.next)
//                            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
//                        }
//                        mSelectedOptionPosition = 0
//                        isCheckPressed = true
//                    } else {
//                        mCurrentPosition++
//                        UtilsForVocabulary.defaultOptionsView(binding.tvOptionOne, binding.tvOptionTwo, binding.tvOptionThree, binding.tvOptionFour, requireContext(), binding.btnCheck)
//                        UtilsForVocabulary.setQuestionTest(binding.btnCheck, binding.pbProgressBar, binding.tvProgressBarCounter, binding.tvQuestion, binding.tvOptionOne, binding.tvOptionTwo, binding.tvOptionThree, binding.tvOptionFour, mQuestionsList, mCurrentPosition, binding.laCorrect, binding.laIncorrect)
//                        isOptionSelected = false
//                        isCheckPressed = false
//                    }
//
//                } else requireContext().toast("Please choose your option!")
            }
        }
    }

    private fun navigateToResultFragment() {
        val fragment = VocabularyResultFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        val bundle = Bundle()
        bundle.apply {
            putInt("questionSize", mQuestionsList!!.size)
            putInt("correctAnswer", correctAnswers)
            putInt("incorrectAnswer", incorrectAnswers)
        }
        setFragmentResult("Size", bundle)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int) {

        if (!isCheckPressed) {
            mSelectedOptionPosition = selectedOptionNumber

            tv.setTextColor(Color.parseColor("#021B59"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_selected_option_border)
            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
        }
        isOptionSelected = true
    }
}