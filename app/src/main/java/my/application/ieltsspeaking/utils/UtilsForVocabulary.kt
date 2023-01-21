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

//        fun defaultOptionsView() {
//            val options = ArrayList<TextView>()
//            options.add(0, optionOne)
//            options.add(1, optionTwo)
//            options.add(2, optionThree)
//            options.add(3, optionFour)
//
//            for (option in options) {
//                option.setTextColor(Color.parseColor("#7A8089"))
//                option.typeface = Typeface.DEFAULT
//                option.textSize = 16f
//                option.background =
//                    ContextCompat.getDrawable(context, R.drawable.bg_default_option_border)
//
//                btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_disabled)
//            }
//        }

        fun answerView(
            mSelectedPosition: Int,
            selectedView: Int,
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

        fun navigateFragmentWithoutBackStack(
            myFragment: Fragment, fragmentManager: FragmentManager
        ) {
            val transaction = fragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                R.anim.from_right,
                R.anim.to_left,
                R.anim.from_left,
                R.anim.to_right
            )
            transaction.replace(R.id.fragmentContainerView, myFragment).commit()
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
            progressBar: ProgressBar,
            progressBarCounter: TextView,
            tvQuestion: TextView,
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


//        fun selectedOptionView(
//            tv: TextView,
//            selectedOptionNumber: Int,
//            isCheckPressed: Boolean,
//        ): Int {
//            val mSelectedOptionPosition = selectedOptionNumber
//
//            if (!isCheckPressed) {
//
//                tv.setTextColor(Color.parseColor("#021B59"))
//                tv.setTypeface(tv.typeface, Typeface.BOLD)
//                tv.background =
//                    ContextCompat.getDrawable(context, R.drawable.bg_selected_option_border)
//                btnCheck.setBackgroundResource(R.drawable.bg_light_blue_button_enabled)
//            }
//            return mSelectedOptionPosition
//        }
    }
}

//data class CustomReturn<A, B, C, D, E, F>(
//    val correctA: A,
//    val incorrectA: B,
//    val mySelectedPosition: C,
//    val isCheckPressed: D,
//    val currentPosition: E,
//    val isOptionSelected: F
//)