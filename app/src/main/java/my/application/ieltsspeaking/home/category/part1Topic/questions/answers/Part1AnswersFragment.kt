package my.application.ieltsspeaking.home.category.part1Topic.questions.answers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart1AnswersBinding

private const val QUESTION = "question"

class Part1AnswersFragment : Fragment() {

    var buttonEnabled = false
    private lateinit var binding: FragmentPart1AnswersBinding
    private var question: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            question = it.getString(QUESTION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart1AnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvPart1Question.text = this.question

        setPart1Answers()


//        loadLearnedButton()
//        binding.btnPart1LearnedInside.setOnClickListener {
//            buttonEnabled = if (!buttonEnabled) {
//                val one = true
//                saveLearnedButton(one)
//                loadLearnedButton()
//                true
//            } else {
//                binding.btnPart1LearnedInside.setBackgroundResource(R.drawable.rectangle_learned_button_disabled)
//                val two = false
//                saveLearnedButton(two)
//                loadLearnedButton()
//                false
//            }
//        }
    }

//    private fun loadLearnedButton() {
//        val sharedPreferences: SharedPreferences = this.requireActivity()
//            .getSharedPreferences("Learned button enabled", Context.MODE_PRIVATE)
//        val argumentQues = sharedPreferences.getString("ques", this.question)
//        val enabledButton = when (sharedPreferences.getBoolean("Learned", false)) {
//            true-> binding.btnPart1LearnedInside.setBackgroundResource(R.drawable.rectangle_learned_button_enabled)
//            else -> binding.btnPart1LearnedInside.setBackgroundResource(R.drawable.rectangle_learned_button_disabled)
//        }
//    }

//    private fun saveLearnedButton(enabled: Boolean) {
//
//        val argumentQuestion = this.question
//
//        val sharedPreferences: SharedPreferences = this.requireActivity()
//            .getSharedPreferences("Learned button enabled", Context.MODE_PRIVATE)
//        val editor = sharedPreferences.edit()
//        editor.apply {
//            putBoolean("Learned", enabled)
//            putString("ques", argumentQuestion)
//        }.apply()
//    }

    private fun setPart1Answers() {
        binding.tvPart1Answer.text = when (this.question) {
            //work
            getString(R.string.workQ1) -> getString(R.string.workA1)
            getString(R.string.workQ2) -> getString(R.string.workA2)
            getString(R.string.workQ3) -> getString(R.string.workA3)
            getString(R.string.workQ4) -> getString(R.string.workA4)
            getString(R.string.workQ5) -> getString(R.string.workA5)
            getString(R.string.workQ6) -> getString(R.string.workA6)
            getString(R.string.workQ7) -> getString(R.string.workA7)
            getString(R.string.workQ8) -> getString(R.string.workA8)

//            //study
            getString(R.string.studyQ1) -> getString(R.string.studyA1)
            getString(R.string.studyQ2) -> getString(R.string.studyA2)
            getString(R.string.studyQ3) -> getString(R.string.studyA3)
            getString(R.string.studyQ4) -> getString(R.string.studyA4)
            getString(R.string.studyQ5) -> getString(R.string.studyA5)
            getString(R.string.studyQ6) -> getString(R.string.studyA6)
            getString(R.string.studyQ7) -> getString(R.string.studyA7)
            getString(R.string.studyQ8) -> getString(R.string.studyA8)
            getString(R.string.studyQ9) -> getString(R.string.studyA9)
            getString(R.string.studyQ10) -> getString(R.string.studyA10)
            getString(R.string.studyQ11) -> getString(R.string.studyA11)
            getString(R.string.studyQ12) -> getString(R.string.studyA12)
            getString(R.string.studyQ13) -> getString(R.string.studyA13)
            getString(R.string.studyQ14) -> getString(R.string.studyA14)
            getString(R.string.studyQ15) -> getString(R.string.studyA15)
            getString(R.string.studyQ16) -> getString(R.string.studyA16)
            getString(R.string.studyQ17) -> getString(R.string.studyA17)

            //hometown
            getString(R.string.hometownQ1) -> getString(R.string.hometownA1)
            getString(R.string.hometownQ2) -> getString(R.string.hometownA2)
            getString(R.string.hometownQ3) -> getString(R.string.hometownA3)
            getString(R.string.hometownQ4) -> getString(R.string.hometownA4)
            getString(R.string.hometownQ5) -> getString(R.string.hometownA5)
            getString(R.string.hometownQ6) -> getString(R.string.hometownA6)
            getString(R.string.hometownQ7) -> getString(R.string.hometownA7)
            getString(R.string.hometownQ8) -> getString(R.string.hometownA8)
            getString(R.string.hometownQ9) -> getString(R.string.hometownA9)
            getString(R.string.hometownQ10) -> getString(R.string.hometownA10)

            //home
            getString(R.string.homeQ1) -> getString(R.string.homeA1)
            getString(R.string.homeQ2) -> getString(R.string.homeA2)
            getString(R.string.homeQ3) -> getString(R.string.homeA3)
            getString(R.string.homeQ4) -> getString(R.string.homeA4)
            getString(R.string.homeQ5) -> getString(R.string.homeA5)
            getString(R.string.homeQ6) -> getString(R.string.homeA6)
            getString(R.string.homeQ7) -> getString(R.string.homeA7)
            getString(R.string.homeQ8) -> getString(R.string.homeA8)

            //art
            getString(R.string.artQ1) -> getString(R.string.artA1)
            getString(R.string.artQ2) -> getString(R.string.artA2)
            getString(R.string.artQ3) -> getString(R.string.artA3)
            getString(R.string.artQ4) -> getString(R.string.artA4)
            getString(R.string.artQ5) -> getString(R.string.artA5)
            getString(R.string.artQ6) -> getString(R.string.artA6)
            getString(R.string.artQ7) -> getString(R.string.artA7)
            getString(R.string.artQ8) -> getString(R.string.artA8)

            //birthday
            getString(R.string.birthdayQ1) -> getString(R.string.birthdayA1)
            getString(R.string.birthdayQ2) -> getString(R.string.birthdayA2)
            getString(R.string.birthdayQ3) -> getString(R.string.birthdayA3)
            getString(R.string.birthdayQ4) -> getString(R.string.birthdayA4)
            getString(R.string.birthdayQ5) -> getString(R.string.birthdayA5)
            getString(R.string.birthdayQ6) -> getString(R.string.birthdayA6)
            getString(R.string.birthdayQ7) -> getString(R.string.birthdayA7)

            //childhood
            getString(R.string.childhoodQ1) -> getString(R.string.childhoodA1)
            getString(R.string.childhoodQ2) -> getString(R.string.childhoodA2)
            getString(R.string.childhoodQ3) -> getString(R.string.childhoodA3)
            getString(R.string.childhoodQ4) -> getString(R.string.childhoodA4)
            getString(R.string.childhoodQ5) -> getString(R.string.childhoodA5)
            getString(R.string.childhoodQ6) -> getString(R.string.childhoodA6)
            getString(R.string.childhoodQ7) -> getString(R.string.childhoodA7)
            getString(R.string.childhoodQ8) -> getString(R.string.childhoodA8)
            getString(R.string.childhoodQ9) -> getString(R.string.childhoodA9)
            getString(R.string.childhoodQ10) -> getString(R.string.childhoodA10)
            getString(R.string.childhoodQ11) -> getString(R.string.childhoodA11)
            getString(R.string.childhoodQ12) -> getString(R.string.childhoodA12)
            getString(R.string.childhoodQ13) -> getString(R.string.childhoodA13)
            getString(R.string.childhoodQ14) -> getString(R.string.childhoodA14)
            getString(R.string.childhoodQ15) -> getString(R.string.childhoodA15)

            //clothes
            getString(R.string.clothesQ1) -> getString(R.string.clothesA1)
            getString(R.string.clothesQ2) -> getString(R.string.clothesA2)
            getString(R.string.clothesQ3) -> getString(R.string.clothesA3)
            getString(R.string.clothesQ4) -> getString(R.string.clothesA4)
            getString(R.string.clothesQ5) -> getString(R.string.clothesA5)
            getString(R.string.clothesQ6) -> getString(R.string.clothesA6)
            getString(R.string.clothesQ7) -> getString(R.string.clothesA7)
            getString(R.string.clothesQ8) -> getString(R.string.clothesA8)

            //daily routine
            getString(R.string.daily_routineQ1) -> getString(R.string.daily_routineA1)
            getString(R.string.daily_routineQ2) -> getString(R.string.daily_routineA2)
            getString(R.string.daily_routineQ3) -> getString(R.string.daily_routineA3)
            getString(R.string.daily_routineQ4) -> getString(R.string.daily_routineA4)
            getString(R.string.daily_routineQ5) -> getString(R.string.daily_routineA5)
            getString(R.string.daily_routineQ6) -> getString(R.string.daily_routineA6)
            getString(R.string.daily_routineQ7) -> getString(R.string.daily_routineA7)
            getString(R.string.daily_routineQ8) -> getString(R.string.daily_routineA8)
            getString(R.string.daily_routineQ9) -> getString(R.string.daily_routineA9)
            getString(R.string.daily_routineQ10) -> getString(R.string.daily_routineA10)
            getString(R.string.daily_routineQ11) -> getString(R.string.daily_routineA11)
            getString(R.string.daily_routineQ12) -> getString(R.string.daily_routineA12)

//            food
            getString(R.string.foodQ1) -> getString(R.string.foodA1)
            getString(R.string.foodQ2) -> getString(R.string.foodA2)
            getString(R.string.foodQ3) -> getString(R.string.foodA3)
            getString(R.string.foodQ4) -> getString(R.string.foodA4)
            getString(R.string.foodQ5) -> getString(R.string.foodA5)
            getString(R.string.foodQ6) -> getString(R.string.foodA6)
            getString(R.string.foodQ7) -> getString(R.string.foodA7)
            getString(R.string.foodQ8) -> getString(R.string.foodA8)
            getString(R.string.foodQ9) -> getString(R.string.foodA9)
            getString(R.string.foodQ10) -> getString(R.string.foodA10)
            getString(R.string.foodQ11) -> getString(R.string.foodA11)
            getString(R.string.foodQ12) -> getString(R.string.foodA12)

            //hobbies
            getString(R.string.hobbyQ1) -> getString(R.string.hobbyA1)
            getString(R.string.hobbyQ2) -> getString(R.string.hobbyA2)
            getString(R.string.hobbyQ3) -> getString(R.string.hobbyA3)
            getString(R.string.hobbyQ4) -> getString(R.string.hobbyA4)
            getString(R.string.hobbyQ5) -> getString(R.string.hobbyA5)
            getString(R.string.hobbyQ6) -> getString(R.string.hobbyA6)
            getString(R.string.hobbyQ7) -> getString(R.string.hobbyA7)
            getString(R.string.hobbyQ8) -> getString(R.string.hobbyA8)
            getString(R.string.hobbyQ9) -> getString(R.string.hobbyA9)
            getString(R.string.hobbyQ10) -> getString(R.string.hobbyA10)

            //internet
            getString(R.string.internetQ1) -> getString(R.string.internetA1)
            getString(R.string.internetQ2) -> getString(R.string.internetA2)
            getString(R.string.internetQ3) -> getString(R.string.internetA3)
            getString(R.string.internetQ4) -> getString(R.string.internetA4)
            getString(R.string.internetQ5) -> getString(R.string.internetA5)
            getString(R.string.internetQ6) -> getString(R.string.internetA6)
            getString(R.string.internetQ7) -> getString(R.string.internetA7)
            getString(R.string.internetQ8) -> getString(R.string.internetA8)
            getString(R.string.internetQ9) -> getString(R.string.internetA9)
            getString(R.string.internetQ10) -> getString(R.string.internetA10)
            getString(R.string.internetQ11) -> getString(R.string.internetA11)

            //leisure time
            getString(R.string.leisure_timeQ1) -> getString(R.string.leisure_timeA1)
            getString(R.string.leisure_timeQ2) -> getString(R.string.leisure_timeA2)
            getString(R.string.leisure_timeQ3) -> getString(R.string.leisure_timeA3)
            getString(R.string.leisure_timeQ4) -> getString(R.string.leisure_timeA4)
            getString(R.string.leisure_timeQ5) -> getString(R.string.leisure_timeA5)
            getString(R.string.leisure_timeQ6) -> getString(R.string.leisure_timeA6)
            getString(R.string.leisure_timeQ7) -> getString(R.string.leisure_timeA7)
            getString(R.string.leisure_timeQ8) -> getString(R.string.leisure_timeA8)
            getString(R.string.leisure_timeQ9) -> getString(R.string.leisure_timeA9)
            getString(R.string.leisure_timeQ10) -> getString(R.string.leisure_timeA10)
            getString(R.string.leisure_timeQ11) -> getString(R.string.leisure_timeA11)
            getString(R.string.leisure_timeQ12) -> getString(R.string.leisure_timeA12)
            getString(R.string.leisure_timeQ13) -> getString(R.string.leisure_timeA13)
            getString(R.string.leisure_timeQ14) -> getString(R.string.leisure_timeA14)
            getString(R.string.leisure_timeQ15) -> getString(R.string.leisure_timeA15)
            getString(R.string.leisure_timeQ16) -> getString(R.string.leisure_timeA16)
            getString(R.string.leisure_timeQ17) -> getString(R.string.leisure_timeA17)
            getString(R.string.leisure_timeQ18) -> getString(R.string.leisure_timeA18)
            getString(R.string.leisure_timeQ19) -> getString(R.string.leisure_timeA19)

//            music
            getString(R.string.musicQ1) -> getString(R.string.musicA1)
            getString(R.string.musicQ2) -> getString(R.string.musicA2)
            getString(R.string.musicQ3) -> getString(R.string.musicA3)
            getString(R.string.musicQ4) -> getString(R.string.musicA4)
            getString(R.string.musicQ5) -> getString(R.string.musicA5)
            getString(R.string.musicQ6) -> getString(R.string.musicA6)
            getString(R.string.musicQ7) -> getString(R.string.musicA7)
            getString(R.string.musicQ8) -> getString(R.string.musicA8)
            getString(R.string.musicQ9) -> getString(R.string.musicA9)
            getString(R.string.musicQ10) -> getString(R.string.musicA10)
            getString(R.string.musicQ11) -> getString(R.string.musicA11)
            getString(R.string.musicQ12) -> getString(R.string.musicA12)
            getString(R.string.musicQ13) -> getString(R.string.musicA13)
            getString(R.string.musicQ14) -> getString(R.string.musicA14)

//            shopping
            getString(R.string.shoppingQ1) -> getString(R.string.shoppingA1)
            getString(R.string.shoppingQ2) -> getString(R.string.shoppingA2)
            getString(R.string.shoppingQ3) -> getString(R.string.shoppingA3)
            getString(R.string.shoppingQ4) -> getString(R.string.shoppingA4)
            getString(R.string.shoppingQ5) -> getString(R.string.shoppingA5)
            getString(R.string.shoppingQ6) -> getString(R.string.shoppingA6)
            getString(R.string.shoppingQ7) -> getString(R.string.shoppingA7)
            getString(R.string.shoppingQ8) -> getString(R.string.shoppingA8)
            getString(R.string.shoppingQ9) -> getString(R.string.shoppingA9)

            else -> getString(R.string.sample_answer_part1)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(question: String) =
            Part1AnswersFragment().apply {
                arguments = Bundle().apply {
                    putString(QUESTION, question)
                }
            }
    }
}