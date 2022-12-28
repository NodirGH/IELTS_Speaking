package my.application.ieltsspeaking.home.category.vocabulary.categories.test

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyTestBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.result.VocabularyResultFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.data.Constants
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.model.Question
import my.application.ieltsspeaking.utils.manageVisibility

const val QUESTION_SIZE: String = "question_size"
const val CORRECT_ANSWERS: String = "correct_answers"
const val INCORRECT_ANSWERS: String = "incorrect_answers"

var correctAnswers: Int = 0
var incorrectAnswers: Int = 0

class WorkTestFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentVocabularyTestBinding
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var isCheckPressed: Boolean = false
    private var isOptionSelected: Boolean = false

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

        setQuestion()

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnCheck.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.tvOptionOne -> selectedOptionView(binding.tvOptionOne, 1)

            R.id.tvOptionTwo -> selectedOptionView(binding.tvOptionTwo, 2)

            R.id.tvOptionThree -> selectedOptionView(binding.tvOptionThree, 3)

            R.id.tvOptionFour -> selectedOptionView(binding.tvOptionFour, 4)

            R.id.btnCheck -> {

                if (isOptionSelected) {

                    if (!isCheckPressed) {

                        val question = mQuestionsList?.get(mCurrentPosition - 1)
                        if (question!!.correctAnswer != mSelectedOptionPosition) {
                            answerView(
                                mSelectedOptionPosition,
                                R.drawable.bg_incorrect_option_border
                            )
                            incorrectAnswers++
                            binding.laIncorrect.manageVisibility(true)
                            binding.laIncorrect.playAnimation()

                        } else {
                            correctAnswers++
                            binding.laCorrect.manageVisibility(true)
                            binding.laCorrect.playAnimation()

                        }
                        answerView(question.correctAnswer, R.drawable.bg_correct_option_border)

                        if (mCurrentPosition == mQuestionsList!!.size) {
                            if (question.correctAnswer != mSelectedOptionPosition) {
                                answerView(
                                    mSelectedOptionPosition,
                                    R.drawable.bg_incorrect_option_border
                                )
                            }
                            answerView(question.correctAnswer, R.drawable.bg_correct_option_border)
                            binding.btnCheck.text = "Show result"
                            Toast.makeText(
                                requireContext(),
                                "You have successfully completed the Quiz",
                                Toast.LENGTH_LONG
                            ).show()

                            binding.btnCheck.setBackgroundResource(R.drawable.bg_fnish_button_enabled)
                            binding.btnCheck.setOnClickListener {
                                navigateToResultFragment()
                            }
                        } else {
                            binding.btnCheck.text = "Next"
                            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
                        }
                        mSelectedOptionPosition = 0
                        isCheckPressed = true
                    } else {

                        mCurrentPosition++
                        showNextQuestion()
                        isOptionSelected = false
                        isCheckPressed = false

                    }

                } else {
                    Toast.makeText(
                        requireContext(),
                        "Please choose your option!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private fun setQuestion() {

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        binding.btnCheck.text = "Check"
        binding.pbProgressBar.progress = mCurrentPosition
        binding.pbProgressBar.max = mQuestionsList!!.size
        binding.tvProgressBarCounter.text = "$mCurrentPosition" + "/" + binding.pbProgressBar.max
        binding.tvQuestion.text = question.question
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour

        binding.laCorrect.manageVisibility(false)
        binding.laIncorrect.manageVisibility(false)
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        options.add(0, binding.tvOptionOne)
        options.add(1, binding.tvOptionTwo)
        options.add(2, binding.tvOptionThree)
        options.add(3, binding.tvOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_default_option_border)

            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
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
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }

    private fun showNextQuestion() {
        when {
            mCurrentPosition <= mQuestionsList!!.size -> {
                setQuestion()
            }
            else -> {
                Toast.makeText(
                    requireContext(),
                    "You have successfully completed the Quiz",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                binding.tvOptionOne.background =
                    ContextCompat.getDrawable(requireContext(), drawableView)
            }
            2 -> {
                binding.tvOptionTwo.background =
                    ContextCompat.getDrawable(requireContext(), drawableView)
            }
            3 -> {
                binding.tvOptionThree.background =
                    ContextCompat.getDrawable(requireContext(), drawableView)
            }
            4 -> {
                binding.tvOptionFour.background =
                    ContextCompat.getDrawable(requireContext(), drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int) {

        if (!isCheckPressed) {
            defaultOptionsView()
            mSelectedOptionPosition = selectedOptionNumber

            tv.setTextColor(Color.parseColor("#021B59"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_selected_option_border)
        }
        isOptionSelected = true
        if (!isCheckPressed) binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
    }
}