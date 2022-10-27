package com.example.ieltsspeaking.home.category.vocabulary.categories.work

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentWorkTestBinding

class WorkTestFragment : Fragment(), View.OnClickListener {
    private lateinit var binding: FragmentWorkTestBinding
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWorkTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnCheck.setOnClickListener(this)
        binding.btnNext.setOnClickListener(this)

    }

    private fun setQuestion() {

        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        binding.btnCheck.text = "Check"
        binding.pbProgressBar.progress = mCurrentPosition
        binding.tvProgressBarCounter.text = "$mCurrentPosition" + "/" + binding.pbProgressBar.max
        binding.tvQuestion.text = question.question
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour
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

            binding.btnNext.visibility = View.GONE
            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tvOptionOne -> {
                selectedOptionView(binding.tvOptionOne, 1)
                binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
            }

            R.id.tvOptionTwo -> {
                selectedOptionView(binding.tvOptionTwo, 2)
                binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
            }

            R.id.tvOptionThree -> {
                selectedOptionView(binding.tvOptionThree, 3)
                binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
            }

            R.id.tvOptionFour -> {
                selectedOptionView(binding.tvOptionFour, 4)
                binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
            }

            R.id.btnCheck -> {
                val question = mQuestionsList?.get(mCurrentPosition - 1)
                if (question!!.correctAnswer != mSelectedOptionPosition) {
                    answerView(mSelectedOptionPosition, R.drawable.bg_incorrect_option_border)
                }
                answerView(question.correctAnswer, R.drawable.bg_correct_option_border)

                if (mCurrentPosition == mQuestionsList!!.size) {
                    if (question.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.bg_incorrect_option_border)
                    }
                    answerView(question.correctAnswer, R.drawable.bg_correct_option_border)
                    binding.btnCheck.text = "FINISH"
                    binding.btnNext.visibility = View.GONE
                    Toast.makeText(
                        requireContext(),
                        "You have successfully completed the Quiz",
                        Toast.LENGTH_LONG
                    ).show()

                    binding.btnCheck.setBackgroundResource(R.drawable.bg_fnish_button_enabled)
                    binding.btnCheck.setOnClickListener {
                        Toast.makeText(
                            requireContext(),
                            "Navigated to result fragment",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    binding.btnNext.visibility = View.VISIBLE
                    binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
                }
                mSelectedOptionPosition = 0


            }

            R.id.btnNext -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++
                    showNextQuestion()
                }
            }
        }
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
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#021B59"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background =
            ContextCompat.getDrawable(requireContext(), R.drawable.bg_selected_option_border)

    }
}