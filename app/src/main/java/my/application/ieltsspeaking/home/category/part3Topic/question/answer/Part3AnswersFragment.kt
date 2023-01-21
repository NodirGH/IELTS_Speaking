package my.application.ieltsspeaking.home.category.part3Topic.question.answer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart3AnswersBinding
import my.application.ieltsspeaking.utils.UtilsForApp

private const val QUESTION = "question"

class Part3AnswersFragment : Fragment() {

    private lateinit var binding: FragmentPart3AnswersBinding
    private var questions: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            questions = it.getString(QUESTION)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart3AnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        binding.tvPart3Question.text = this.questions
        setPart3Answers()
    }

    private fun setPart3Answers() {
        binding.tvPart3Answer.text = when(this.questions){
           getString(R.string.part3WeatherQ01) -> getString(R.string.part3WeatherA01)
           getString(R.string.part3WeatherQ02) -> getString(R.string.part3WeatherA02)
           getString(R.string.part3WeatherQ03) -> getString(R.string.part3WeatherA03)
           getString(R.string.part3WeatherQ04) -> getString(R.string.part3WeatherA04)
           getString(R.string.part3WeatherQ05) -> getString(R.string.part3WeatherA05)
           getString(R.string.part3WeatherQ06) -> getString(R.string.part3WeatherA06)
           getString(R.string.part3WeatherQ07) -> getString(R.string.part3WeatherA07)
           getString(R.string.part3WeatherQ08) -> getString(R.string.part3WeatherA08)

            getString(R.string.part3TravelQ01) -> getString(R.string.part3TravelA01)
            getString(R.string.part3TravelQ02) -> getString(R.string.part3TravelA02)
            getString(R.string.part3TravelQ03) -> getString(R.string.part3TravelA03)
            getString(R.string.part3TravelQ04) -> getString(R.string.part3TravelA04)
            getString(R.string.part3TravelQ05) -> getString(R.string.part3TravelA05)
            getString(R.string.part3TravelQ06) -> getString(R.string.part3TravelA06)
            getString(R.string.part3TravelQ07) -> getString(R.string.part3TravelA07)
            getString(R.string.part3TravelQ08) -> getString(R.string.part3TravelA08)
            getString(R.string.part3TravelQ09) -> getString(R.string.part3TravelA09)
            getString(R.string.part3TravelQ10) -> getString(R.string.part3TravelA10)
            getString(R.string.part3TravelQ11) -> getString(R.string.part3TravelA11)
            getString(R.string.part3TravelQ12) -> getString(R.string.part3TravelA12)
            getString(R.string.part3TravelQ13) -> getString(R.string.part3TravelA13)
            getString(R.string.part3TravelQ14) -> getString(R.string.part3TravelA14)
            getString(R.string.part3TravelQ15) -> getString(R.string.part3TravelA15)

            getString(R.string.part3TechnologyQ01) -> getString(R.string.part3TechnologyA01)
            getString(R.string.part3TechnologyQ02) -> getString(R.string.part3TechnologyA02)
            getString(R.string.part3TechnologyQ03) -> getString(R.string.part3TechnologyA03)
            getString(R.string.part3TechnologyQ04) -> getString(R.string.part3TechnologyA04)
            getString(R.string.part3TechnologyQ05) -> getString(R.string.part3TechnologyA05)
            getString(R.string.part3TechnologyQ06) -> getString(R.string.part3TechnologyA06)
            getString(R.string.part3TechnologyQ07) -> getString(R.string.part3TechnologyA07)
            getString(R.string.part3TechnologyQ08) -> getString(R.string.part3TechnologyA08)
            getString(R.string.part3TechnologyQ09) -> getString(R.string.part3TechnologyA09)

            getString(R.string.part3SleepQ01) -> getString(R.string.part3SleepA01)
            getString(R.string.part3SleepQ02) -> getString(R.string.part3SleepA02)
            getString(R.string.part3SleepQ03) -> getString(R.string.part3SleepA03)
            getString(R.string.part3SleepQ04) -> getString(R.string.part3SleepA04)
            getString(R.string.part3SleepQ05) -> getString(R.string.part3SleepA05)
            getString(R.string.part3SleepQ06) -> getString(R.string.part3SleepA06)
            getString(R.string.part3SleepQ07) -> getString(R.string.part3SleepA07)
            getString(R.string.part3SleepQ08) -> getString(R.string.part3SleepA08)
            getString(R.string.part3SleepQ09) -> getString(R.string.part3SleepA09)
            getString(R.string.part3SleepQ10) -> getString(R.string.part3SleepA10)
            getString(R.string.part3SleepQ11) -> getString(R.string.part3SleepA11)
            getString(R.string.part3SleepQ12) -> getString(R.string.part3SleepA12)

            getString(R.string.part3ShoppingQ01) -> getString(R.string.part3ShoppingA01)
            getString(R.string.part3ShoppingQ02) -> getString(R.string.part3ShoppingA02)
            getString(R.string.part3ShoppingQ03) -> getString(R.string.part3ShoppingA03)
            getString(R.string.part3ShoppingQ04) -> getString(R.string.part3ShoppingA04)
            getString(R.string.part3ShoppingQ05) -> getString(R.string.part3ShoppingA05)
            getString(R.string.part3ShoppingQ06) -> getString(R.string.part3ShoppingA06)
            getString(R.string.part3ShoppingQ07) -> getString(R.string.part3ShoppingA07)
            getString(R.string.part3ShoppingQ08) -> getString(R.string.part3ShoppingA08)
            getString(R.string.part3ShoppingQ09) -> getString(R.string.part3ShoppingA09)
            getString(R.string.part3ShoppingQ10) -> getString(R.string.part3ShoppingA10)
            getString(R.string.part3ShoppingQ11) -> getString(R.string.part3ShoppingA11)
            getString(R.string.part3ShoppingQ12) -> getString(R.string.part3ShoppingA12)

            getString(R.string.part3ServiceQ01) -> getString(R.string.part3ServiceA01)
            getString(R.string.part3ServiceQ02) -> getString(R.string.part3ServiceA02)
            getString(R.string.part3ServiceQ03) -> getString(R.string.part3ServiceA03)
            getString(R.string.part3ServiceQ04) -> getString(R.string.part3ServiceA04)
            getString(R.string.part3ServiceQ05) -> getString(R.string.part3ServiceA05)
            getString(R.string.part3ServiceQ06) -> getString(R.string.part3ServiceA06)

            getString(R.string.part3PollutionQ01) -> getString(R.string.part3PollutionA01)
            getString(R.string.part3PollutionQ02) -> getString(R.string.part3PollutionA02)
            getString(R.string.part3PollutionQ03) -> getString(R.string.part3PollutionA03)
            getString(R.string.part3PollutionQ04) -> getString(R.string.part3PollutionA04)
            getString(R.string.part3PollutionQ05) -> getString(R.string.part3PollutionA05)
            getString(R.string.part3PollutionQ06) -> getString(R.string.part3PollutionA06)
            getString(R.string.part3PollutionQ07) -> getString(R.string.part3PollutionA07)
            getString(R.string.part3PollutionQ08) -> getString(R.string.part3PollutionA08)
            getString(R.string.part3PollutionQ09) -> getString(R.string.part3PollutionA09)
            getString(R.string.part3PollutionQ10) -> getString(R.string.part3PollutionA10)
            getString(R.string.part3PollutionQ11) -> getString(R.string.part3PollutionA11)
            getString(R.string.part3PollutionQ12) -> getString(R.string.part3PollutionA12)
            getString(R.string.part3PollutionQ13) -> getString(R.string.part3PollutionA13)
            getString(R.string.part3PollutionQ14) -> getString(R.string.part3PollutionA14)
            getString(R.string.part3PollutionQ15) -> getString(R.string.part3PollutionA15)

            getString(R.string.part3PolitenessQ01) -> getString(R.string.part3PolitenessA01)
            getString(R.string.part3PolitenessQ02) -> getString(R.string.part3PolitenessA02)
            getString(R.string.part3PolitenessQ03) -> getString(R.string.part3PolitenessA03)
            getString(R.string.part3PolitenessQ04) -> getString(R.string.part3PolitenessA04)
            getString(R.string.part3PolitenessQ05) -> getString(R.string.part3PolitenessA05)
            getString(R.string.part3PolitenessQ06) -> getString(R.string.part3PolitenessA06)
            getString(R.string.part3PolitenessQ07) -> getString(R.string.part3PolitenessA07)
            getString(R.string.part3PolitenessQ08) -> getString(R.string.part3PolitenessA08)
            getString(R.string.part3PolitenessQ09) -> getString(R.string.part3PolitenessA09)

            getString(R.string.part3PlansQ01) -> getString(R.string.part3PlansA01)
            getString(R.string.part3PlansQ02) -> getString(R.string.part3PlansA02)
            getString(R.string.part3PlansQ03) -> getString(R.string.part3PlansA03)
            getString(R.string.part3PlansQ04) -> getString(R.string.part3PlansA04)
            getString(R.string.part3PlansQ05) -> getString(R.string.part3PlansA05)
            getString(R.string.part3PlansQ06) -> getString(R.string.part3PlansA06)
            getString(R.string.part3PlansQ07) -> getString(R.string.part3PlansA07)
            getString(R.string.part3PlansQ08) -> getString(R.string.part3PlansA08)

            getString(R.string.part3PeopleQ01) -> getString(R.string.part3PeopleA01)
            getString(R.string.part3PeopleQ02) -> getString(R.string.part3PeopleA02)
            getString(R.string.part3PeopleQ03) -> getString(R.string.part3PeopleA03)
            getString(R.string.part3PeopleQ04) -> getString(R.string.part3PeopleA04)
            getString(R.string.part3PeopleQ05) -> getString(R.string.part3PeopleA05)
            getString(R.string.part3PeopleQ06) -> getString(R.string.part3PeopleA06)
            getString(R.string.part3PeopleQ07) -> getString(R.string.part3PeopleA07)
            getString(R.string.part3PeopleQ08) -> getString(R.string.part3PeopleA08)
            getString(R.string.part3PeopleQ09) -> getString(R.string.part3PeopleA09)
            getString(R.string.part3PeopleQ10) -> getString(R.string.part3PeopleA10)
            getString(R.string.part3PeopleQ11) -> getString(R.string.part3PeopleA11)
            getString(R.string.part3PeopleQ12) -> getString(R.string.part3PeopleA12)
            getString(R.string.part3PeopleQ13) -> getString(R.string.part3PeopleA13)
            getString(R.string.part3PeopleQ14) -> getString(R.string.part3PeopleA14)
            getString(R.string.part3PeopleQ15) -> getString(R.string.part3PeopleA15)
            getString(R.string.part3PeopleQ16) -> getString(R.string.part3PeopleA16)
            getString(R.string.part3PeopleQ17) -> getString(R.string.part3PeopleA17)
            getString(R.string.part3PeopleQ18) -> getString(R.string.part3PeopleA18)
            getString(R.string.part3PeopleQ19) -> getString(R.string.part3PeopleA19)
            getString(R.string.part3PeopleQ20) -> getString(R.string.part3PeopleA20)
            getString(R.string.part3PeopleQ21) -> getString(R.string.part3PeopleA21)
            getString(R.string.part3PeopleQ22) -> getString(R.string.part3PeopleA22)
            getString(R.string.part3PeopleQ23) -> getString(R.string.part3PeopleA23)
            getString(R.string.part3PeopleQ24) -> getString(R.string.part3PeopleA24)
            getString(R.string.part3PeopleQ25) -> getString(R.string.part3PeopleA25)
            getString(R.string.part3PeopleQ26) -> getString(R.string.part3PeopleA26)
            getString(R.string.part3PeopleQ27) -> getString(R.string.part3PeopleA27)
            getString(R.string.part3PeopleQ28) -> getString(R.string.part3PeopleA28)

            else -> "Word is not found"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(question: String) =
            Part3AnswersFragment().apply {
                arguments = Bundle().apply {
                    putString(QUESTION, question)
                }
            }
    }
}