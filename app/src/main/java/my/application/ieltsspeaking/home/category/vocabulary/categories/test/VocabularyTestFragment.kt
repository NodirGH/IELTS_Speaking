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
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.AdError
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.FullScreenContentCallback
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyTestBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.data.Constants
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.model.Question
import my.application.ieltsspeaking.home.category.vocabulary.globalTopicId
import my.application.ieltsspeaking.utils.*

class VocabularyTestFragment : BaseFragment<FragmentVocabularyTestBinding>(FragmentVocabularyTestBinding::inflate), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var isCheckPressed: Boolean = false
    private var isOptionSelected: Boolean = false
    var correctAnswers: Int = 0
    var incorrectAnswers: Int = 0
    var questionsSize: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.bg_vocabulary_test, requireContext(), requireActivity())

        mQuestionsList = when(globalTopicId){
            1-> Constants.quizForWork()
            2-> Constants.quizForTravel()
            3-> Constants.quizForTechnology()
            4-> Constants.quizForSport()
            5-> Constants.quizForScience()
            6-> Constants.quizForRelationship()
            7-> Constants.quizForAccommodation()
            8-> Constants.quizForEducation()
            9-> Constants.quizForHobby()
            10-> Constants.quizForMixed()

            else -> Constants.quizForWork()
        }

        setQuestionTest()

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnCheck.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.tvOptionOne -> {
                defaultOptionsView()
                selectedOptionView(binding.tvOptionOne, 1)
            }

            R.id.tvOptionTwo -> {
                defaultOptionsView()
                selectedOptionView(binding.tvOptionTwo, 2)
            }

            R.id.tvOptionThree -> {
                defaultOptionsView()
                selectedOptionView(binding.tvOptionThree, 3)
            }

            R.id.tvOptionFour -> {
                defaultOptionsView()
                selectedOptionView(binding.tvOptionFour, 4)
            }

            R.id.btnCheck -> {

                if (isOptionSelected) {

                    if (!isCheckPressed) {
                        val question = mQuestionsList?.get(mCurrentPosition - 1)
                        if (question!!.correctAnswer != mSelectedOptionPosition) {
                            answerView(
                                mSelectedOptionPosition,
                                R.drawable.bg_incorrect_option_border,
                            )
                            incorrectAnswers++
                            binding.laIncorrect.manageVisibility(true)
                            binding.laIncorrect.playAnimation()

                        } else {
                            correctAnswers++
                            binding.laCorrect.manageVisibility(true)
                            binding.laCorrect.playAnimation()
                        }

                        answerView(
                            question.correctAnswer,
                            R.drawable.bg_correct_option_border,
                        )

                        if (mCurrentPosition == mQuestionsList!!.size) {
                            if (question.correctAnswer != mSelectedOptionPosition) {
                                answerView(
                                    mSelectedOptionPosition,
                                    R.drawable.bg_incorrect_option_border,
                                )
                            }
                            answerView(
                                question.correctAnswer,
                                R.drawable.bg_correct_option_border,
                            )
                            binding.btnCheck.text = getString(R.string.show_result)
                            requireContext().toast("You have successfully completed the Quiz")

                            binding.btnCheck.setBackgroundResource(R.drawable.bg_fnish_button_enabled)
                            binding.btnCheck.setOnClickListener {

                                questionsSize = mQuestionsList!!.size
                                val sharedViewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]

                                sharedViewModel.sendAnswers(questionsSize, correctAnswers, incorrectAnswers)
                                val action = VocabularyTestFragmentDirections.actionVocabularyTestFragmentToVocabularyResultFragment()
                                findNavController().navigate(action)
                            }
                        } else {
                            binding.btnCheck.text = getString(R.string.next)
                            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
                        }
                        mSelectedOptionPosition = 0
                        isCheckPressed = true
                    } else {
                        mCurrentPosition++
                        defaultOptionsView()
                        setQuestionTest()
                        isOptionSelected = false
                        isCheckPressed = false
                    }

                } else requireContext().toast("Please choose your option!")
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int) {

        if (!isCheckPressed) {
            mSelectedOptionPosition = selectedOptionNumber

            tv.setTextColor(Color.parseColor("#021B59"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.textSize = 16f
            tv.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_selected_option_border)
            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
        }
        isOptionSelected = true
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
            option.textSize = 16f
            option.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.bg_default_option_border)

            binding.btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
        }
    }


    private fun setQuestionTest() {
        val question = mQuestionsList!![mCurrentPosition - 1]
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

   private fun answerView(
        mSelectedPosition: Int,
        selectedView: Int,
    ) {
        when (mSelectedPosition) {
            1 -> {
                binding.tvOptionOne.background =
                    ContextCompat.getDrawable(requireContext(), selectedView)
            }
            2 -> {
                binding.tvOptionTwo.background =
                    ContextCompat.getDrawable(requireContext(), selectedView)
            }
            3 -> {
                binding.tvOptionThree.background =
                    ContextCompat.getDrawable(requireContext(), selectedView)
            }
            4 -> {
                binding.tvOptionFour.background =
                    ContextCompat.getDrawable(requireContext(), selectedView)
            }
        }
    }
}