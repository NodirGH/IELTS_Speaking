package my.application.ieltsspeaking.utils

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.airbnb.lottie.LottieAnimationView
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.model.ModelStartLearning
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.model.Question

class UtilsForVocabulary {
    companion object {
        lateinit var context: Context
        lateinit var optionOne: TextView
        lateinit var optionTwo: TextView
        lateinit var optionThree: TextView
        lateinit var optionFour: TextView
        lateinit var btnCheck: Button
//         var mSelectedPosition: Int = 0
//        var selectedView: Int = 0
//        private val myFragment: Fragment = VocabularyFragment()
//        lateinit var fragmentManager: FragmentManager
//        private lateinit var fragmentActivity: FragmentActivity
//        lateinit var frontCard: TextView
//        lateinit var backCard: LinearLayout
//        var wordList: ArrayList<ModelStartLearning>? = null
//        var currentPosition: Int = 0
//        lateinit var definition: TextView
//        lateinit var example: TextView
//        lateinit var progressBar: ProgressBar
//        var wordCount: Int = 0
//        lateinit var pbCounter: TextView
//        lateinit var progressBarCounter: TextView
//        lateinit var tvQuestion: TextView
//        var mQuestionList: ArrayList<Question>? = null
//        var position: Int = 0
//        lateinit var correct: LottieAnimationView
//        lateinit var incorrect: LottieAnimationView
//        lateinit var tv: TextView
//        var selectedOptionNumber: Int = 0
//        var isCheckPressed: Boolean = false






        fun defaultOptionsView() {
            val options = ArrayList<TextView>()
            options.add(0, optionOne)
            options.add(1, optionTwo)
            options.add(2, optionThree)
            options.add(3, optionFour)

            for (option in options) {
                option.setTextColor(Color.parseColor("#7A8089"))
                option.typeface = Typeface.DEFAULT
                option.background =
                    ContextCompat.getDrawable(context, R.drawable.bg_default_option_border)

                btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
            }
        }

        fun answerView(
            mSelectedPosition: Int,
            selectedView: Int,
//            optionOne: TextView,
//            optionTwo: TextView,
//            optionThree: TextView,
//            optionFour: TextView,
        ) {
            when (mSelectedPosition) {
                1 -> {
                    optionOne.background =
                        ContextCompat.getDrawable(context, selectedView)
                }
                2 -> {
                    optionTwo.background =
                        ContextCompat.getDrawable(context, selectedView)
                }
                3 -> {
                    optionThree.background =
                        ContextCompat.getDrawable(context, selectedView)
                }
                4 -> {
                    optionFour.background =
                        ContextCompat.getDrawable(context, selectedView)
                }
            }
        }

        fun navigateFragment(
            myFragment: Fragment, fragmentManager: FragmentManager
        ) {
            val transaction = fragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                R.anim.from_right,
                R.anim.to_left,
                R.anim.from_left,
                R.anim.to_right
            )
            transaction.replace(R.id.fragmentContainerView, myFragment)
            transaction.addToBackStack(null).commit()
        }

        fun rotateFlipCard(
            fragmentActivity: FragmentActivity,
            frontCard: TextView,
            backCard: LinearLayout,
            context: Context
        ) {

            var isFront = true

            val scale = fragmentActivity.applicationContext.resources.displayMetrics.density
            frontCard.cameraDistance = 8000 * scale
            backCard.cameraDistance = 8000 * scale

            val frontAnim = AnimatorInflater.loadAnimator(
                context.applicationContext,
                R.animator.flip_card_front_animation
            ) as AnimatorSet
            val backAnim = AnimatorInflater.loadAnimator(
                context.applicationContext,
                R.animator.flip_card_back_animation
            ) as AnimatorSet

            frontCard.setOnClickListener {
                if (isFront) {
                    frontAnim.setTarget(frontCard)
                    backAnim.setTarget(backCard)
                    frontAnim.start()
                    backAnim.start()
                    isFront = false
                    backCard.manageVisibility(true)
                } else {
                    frontAnim.setTarget(backCard)
                    backAnim.setTarget(frontCard)
                    backAnim.start()
                    frontAnim.start()
                    isFront = true
                    frontCard.manageVisibility(true)
                }
            }
        }

        fun setWords(
            wordList: ArrayList<ModelStartLearning>?,
            currentPosition: Int,
            frontCard: TextView,
            definition: TextView,
            example: TextView,
            progressBar: ProgressBar,
            wordCount: Int,
            pbCounter: TextView
        ) {
            val word = wordList!![currentPosition - 1]
            frontCard.text = word.word
            definition.text = word.definition
            example.text = word.example
            progressBar.progress = currentPosition
            progressBar.max = wordCount
            pbCounter.text = "$currentPosition/$wordCount"
        }

        fun alertDialog(
            fragment: Fragment, fragmentManager: FragmentManager
        ) {
            val builder: AlertDialog.Builder = AlertDialog.Builder(context)
            builder.setTitle("GREAT")
                .setMessage("Keep learning. Just keep in mind: Practice makes perfect")
                .setCancelable(false)
                .setPositiveButton("Finish") { _, _ ->
                    navigateFragment(
                        fragment, fragmentManager
                    )
                }.show()
        }

        fun setQuestionTest(
//            btnCheck: Button,
            progressBar: ProgressBar,
            progressBarCounter: TextView,
            tvQuestion: TextView,
//            optionOne: TextView,
//            optionTwo: TextView,
//            optionThree: TextView,
//            optionFour: TextView,
            mQuestionList: ArrayList<Question>?,
            position: Int,
            correct: LottieAnimationView,
            incorrect: LottieAnimationView
        ) {
            val question = mQuestionList!![position - 1]
            btnCheck.text = "Check"
            progressBar.progress = position
            progressBar.max = mQuestionList!!.size
            progressBarCounter.text = "$position" + "/" + progressBar.max
            tvQuestion.text = question.question
            optionOne.text = question.optionOne
            optionTwo.text = question.optionTwo
            optionThree.text = question.optionThree
            optionFour.text = question.optionFour
            correct.manageVisibility(false)
            incorrect.manageVisibility(false)
        }


        fun selectedOptionView(
            tv: TextView,
            selectedOptionNumber: Int,
//            context: Context,
            isCheckPressed: Boolean,
//            btnCheck: Button
        ): Int {
            val mSelectedOptionPosition = selectedOptionNumber

            if (!isCheckPressed) {

                tv.setTextColor(Color.parseColor("#021B59"))
                tv.setTypeface(tv.typeface, Typeface.BOLD)
                tv.background =
                    ContextCompat.getDrawable(context, R.drawable.bg_selected_option_border)
                btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
            }
            return mSelectedOptionPosition
        }

//        fun btnCheckFunction(
//            isOptionSelected: Boolean,
//            isCheckPressed: Boolean,
//            mQuestionList: ArrayList<Question>?,
//            mCurrentPosition: Int,
//            mSelectedOptionPosition: Int,
//            optionOne: TextView,
//            optionTwo: TextView,
//            optionThree: TextView,
//            optionFour: TextView,
//            context: Context,
//            correct: LottieAnimationView,
//            incorrect: LottieAnimationView,
//            btnCheck: Button,
//            progressBar: ProgressBar,
//            progressBarCounter: TextView,
//            tvQuestion: TextView,
//            correctAnswers: Int,
//            incorrectAnswers: Int
//        ): CustomReturn<Int, Int, Int, Boolean, Int, Boolean> {
//
//            var isCheckClicked = false
//            var isOptionReallySelected = false
//            var correctAnswer: Int = correctAnswers
//            var incorrectAnswer: Int = incorrectAnswers
//            var mySelectedOptionPosition = 0
//            var myCurrentPosition = 0
//
//            if (isOptionSelected) {
//
//                if (!isCheckPressed) {
//                    val question = mQuestionList?.get(mCurrentPosition - 1)
//                    if (question!!.correctAnswer != mSelectedOptionPosition) {
//                        answerView(
//                            mSelectedOptionPosition,
//                            R.drawable.bg_incorrect_option_border,
//                            optionOne,
//                            optionTwo,
//                            optionThree,
//                            optionFour,
//                            context
//                        )
//                        incorrectAnswer++
//                        incorrect.manageVisibility(true)
//                        incorrect.playAnimation()
//
//                    } else {
//                        correctAnswer++
//                        correct.manageVisibility(true)
//                        correct.playAnimation()
//                    }
//
//                    answerView(
//                        question.correctAnswer,
//                        R.drawable.bg_correct_option_border,
//                        optionOne,
//                        optionTwo,
//                        optionThree,
//                        optionFour,
//                        context
//                    )
//
//                    if (mCurrentPosition == mQuestionList!!.size) {
//                        if (question.correctAnswer != mSelectedOptionPosition) {
//                            UtilsForVocabulary.answerView(
//                                mSelectedOptionPosition,
//                                R.drawable.bg_incorrect_option_border,
//                                optionOne,
//                                optionTwo,
//                                optionThree,
//                                optionFour,
//                                context
//                            )
//                        }
//                        UtilsForVocabulary.answerView(
//                            question.correctAnswer,
//                            R.drawable.bg_correct_option_border,
//                            optionOne,
//                            optionTwo,
//                            optionThree,
//                            optionFour,
//                            context
//                        )
//                        btnCheck.text = "Show result"
//                        context.toast("You have successfully completed the Quiz")
//
//                        btnCheck.setBackgroundResource(R.drawable.bg_fnish_button_enabled)
//                        btnCheck.setOnClickListener {
////                            navigateToResultFragment()
//                            context.toast("Navigated to result")
//                        }
//                    } else {
//                        btnCheck.text = "Next"
//                        btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
//                    }
//                    mySelectedOptionPosition = mSelectedOptionPosition  // Should be overviewed
//                    isCheckClicked = true
//                } else {
//                    myCurrentPosition = mCurrentPosition
//                    myCurrentPosition++
//                    UtilsForVocabulary.defaultOptionsView(
//                        optionOne,
//                        optionTwo,
//                        optionThree,
//                        optionFour,
//                        context,
//                        btnCheck
//                    )
//                    UtilsForVocabulary.setQuestionTest(
//                        btnCheck,
//                        progressBar,
//                        progressBarCounter,
//                        tvQuestion,
//                        optionOne,
//                        optionTwo,
//                        optionThree,
//                        optionFour,
//                        mQuestionList,
//                        mCurrentPosition,
//                        correct,
//                        incorrect
//                    )
//                    isOptionReallySelected = false
//                    isCheckClicked = false
//                }
//
//            } else context.toast("Please choose your option!")
//            return CustomReturn(
//                correctAnswer,
//                incorrectAnswer,
//                mySelectedOptionPosition,
//                isCheckClicked,
//                myCurrentPosition,
//                isOptionReallySelected
//            )
//        }


    }
}

data class CustomReturn<A, B, C, D, E, F>(
    val correctA: A,
    val incorrectA: B,
    val mySelectedPosition: C,
    val isCheckPressed: D,
    val currentPosition: E,
    val isOptionSelected: F
)