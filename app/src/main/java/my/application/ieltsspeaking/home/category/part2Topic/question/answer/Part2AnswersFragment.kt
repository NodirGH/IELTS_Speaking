package my.application.ieltsspeaking.home.category.part2Topic.question.answer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2AnswersBinding
import my.application.ieltsspeaking.utils.UtilsForApp

private const val QUESTION = "question"

class Part2AnswersFragment : Fragment() {

    private lateinit var binding: FragmentPart2AnswersBinding
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
        binding = FragmentPart2AnswersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        binding.tvPart2Question.text = this.question

        setPart2Answers()
    }

    private fun setPart2Answers() {
        binding.tvPart1Answer.text = when (this.question) {
            getString(R.string.part2ActivityQ01) -> getString(R.string.part2ActivityA01)
            getString(R.string.part2ActivityQ02) -> getString(R.string.part2ActivityA02)
            getString(R.string.part2ActivityQ03) -> getString(R.string.part2ActivityA03)
            getString(R.string.part2ActivityQ04) -> getString(R.string.part2ActivityA04)
            getString(R.string.part2ActivityQ05) -> getString(R.string.part2ActivityA05)
            getString(R.string.part2ActivityQ06) -> getString(R.string.part2ActivityA06)
            getString(R.string.part2ActivityQ07) -> getString(R.string.part2ActivityA07)
            getString(R.string.part2ActivityQ08) -> getString(R.string.part2ActivityA08)
            getString(R.string.part2ActivityQ09) -> getString(R.string.part2ActivityA09)
            getString(R.string.part2ActivityQ10) -> getString(R.string.part2ActivityA10)

            getString(R.string.part2AdvertisementQ01) -> getString(R.string.part2AdvertisementA01)
            getString(R.string.part2AdvertisementQ02) -> getString(R.string.part2AdvertisementA02)
            getString(R.string.part2AdvertisementQ03) -> getString(R.string.part2AdvertisementA03)
            getString(R.string.part2AdvertisementQ04) -> getString(R.string.part2AdvertisementA04)
            getString(R.string.part2AdvertisementQ05) -> getString(R.string.part2AdvertisementA05)
            getString(R.string.part2AdvertisementQ06) -> getString(R.string.part2AdvertisementA06)

            getString(R.string.part2AnimalQ01) -> getString(R.string.part2AnimalA01)
            getString(R.string.part2AnimalQ02) -> getString(R.string.part2AnimalA02)
            getString(R.string.part2AnimalQ03) -> getString(R.string.part2AnimalA03)
            getString(R.string.part2AnimalQ04) -> getString(R.string.part2AnimalA04)
            getString(R.string.part2AnimalQ05) -> getString(R.string.part2AnimalA05)
            getString(R.string.part2AnimalQ06) -> getString(R.string.part2AnimalA06)
            getString(R.string.part2AnimalQ07) -> getString(R.string.part2AnimalA07)
            getString(R.string.part2AnimalQ08) -> getString(R.string.part2AnimalA08)
            getString(R.string.part2AnimalQ09) -> getString(R.string.part2AnimalA09)

            getString(R.string.part2ClothesQ01) -> getString(R.string.part2ClothesA01)
            getString(R.string.part2ClothesQ02) -> getString(R.string.part2ClothesA02)
            getString(R.string.part2ClothesQ03) -> getString(R.string.part2ClothesA03)
            getString(R.string.part2ClothesQ04) -> getString(R.string.part2ClothesA04)
            getString(R.string.part2ClothesQ05) -> getString(R.string.part2ClothesA05)

            getString(R.string.part2ColorsQ01) -> getString(R.string.part2ColorsA01)
            getString(R.string.part2ColorsQ02) -> getString(R.string.part2ColorsA02)
            getString(R.string.part2ColorsQ03) -> getString(R.string.part2ColorsA03)

            getString(R.string.part2CompetitionQ01) -> getString(R.string.part2CompetitionA01)
            getString(R.string.part2CompetitionQ02) -> getString(R.string.part2CompetitionA02)
            getString(R.string.part2CompetitionQ03) -> getString(R.string.part2CompetitionA03)
            getString(R.string.part2CompetitionQ04) -> getString(R.string.part2CompetitionA04)
            getString(R.string.part2CompetitionQ05) -> getString(R.string.part2CompetitionA05)
            getString(R.string.part2CompetitionQ06) -> getString(R.string.part2CompetitionA06)
            getString(R.string.part2CompetitionQ07) -> getString(R.string.part2CompetitionA07)

            getString(R.string.part2EducationQ01) -> getString(R.string.part2EducationA01)
            getString(R.string.part2EducationQ02) -> getString(R.string.part2EducationA02)
            getString(R.string.part2EducationQ03) -> getString(R.string.part2EducationA03)
            getString(R.string.part2EducationQ04) -> getString(R.string.part2EducationA04)


            getString(R.string.part2FoodQ01) -> getString(R.string.part2FoodA01)
            getString(R.string.part2FoodQ02) -> getString(R.string.part2FoodA02)
            getString(R.string.part2FoodQ03) -> getString(R.string.part2FoodA03)
            getString(R.string.part2FoodQ04) -> getString(R.string.part2FoodA04)
            getString(R.string.part2FoodQ05) -> getString(R.string.part2FoodA05)
            getString(R.string.part2FoodQ06) -> getString(R.string.part2FoodA06)

            getString(R.string.part2MusicQ01) -> getString(R.string.part2MusicA01)
            getString(R.string.part2MusicQ02) -> getString(R.string.part2MusicA02)
            getString(R.string.part2MusicQ03) -> getString(R.string.part2MusicA03)
            getString(R.string.part2MusicQ04) -> getString(R.string.part2MusicA04)
            getString(R.string.part2MusicQ05) -> getString(R.string.part2MusicA05)

            getString(R.string.part2MusicQ01) -> getString(R.string.part2MoneyA01)
            getString(R.string.part2MusicQ02) -> getString(R.string.part2MoneyA02)
            getString(R.string.part2MusicQ03) -> getString(R.string.part2MoneyA03)
            getString(R.string.part2MusicQ04) -> getString(R.string.part2MoneyA04)
            getString(R.string.part2MusicQ05) -> getString(R.string.part2MoneyA05)

            getString(R.string.part2MoneyQ01) -> getString(R.string.part2MoneyA01)
            getString(R.string.part2MoneyQ02) -> getString(R.string.part2MoneyA02)
            getString(R.string.part2MoneyQ03) -> getString(R.string.part2MoneyA03)
            getString(R.string.part2MoneyQ04) -> getString(R.string.part2MoneyA04)
            getString(R.string.part2MoneyQ05) -> getString(R.string.part2MoneyA05)

            getString(R.string.part2PlansQ01) -> getString(R.string.part2PlansA01)
            getString(R.string.part2PlansQ02) -> getString(R.string.part2PlansA02)
            getString(R.string.part2PlansQ03) -> getString(R.string.part2PlansA03)
            getString(R.string.part2PlansQ04) -> getString(R.string.part2PlansA04)
            getString(R.string.part2PlansQ05) -> getString(R.string.part2PlansA05)
            getString(R.string.part2PlansQ06) -> getString(R.string.part2PlansA06)
            getString(R.string.part2PlansQ07) -> getString(R.string.part2PlansA07)
            getString(R.string.part2PlansQ08) -> getString(R.string.part2PlansA08)
            getString(R.string.part2PlansQ09) -> getString(R.string.part2PlansA09)
            getString(R.string.part2PlansQ10) -> getString(R.string.part2PlansA10)

            getString(R.string.part2PollutionQ01) -> getString(R.string.part2PollutionA01)
            getString(R.string.part2PollutionQ02) -> getString(R.string.part2PollutionA02)
            getString(R.string.part2PollutionQ03) -> getString(R.string.part2PollutionA03)
            getString(R.string.part2PollutionQ04) -> getString(R.string.part2PollutionA04)
            getString(R.string.part2PollutionQ05) -> getString(R.string.part2PollutionA05)

            getString(R.string.part2ServiceQ01) -> getString(R.string.part2ServiceA01)
            getString(R.string.part2ServiceQ02) -> getString(R.string.part2ServiceA02)

            getString(R.string.part2WeatherQ01) -> getString(R.string.part2WeatherA01)
            getString(R.string.part2WeatherQ02) -> getString(R.string.part2WeatherA02)
            getString(R.string.part2WeatherQ03) -> getString(R.string.part2WeatherA03)
            getString(R.string.part2WeatherQ04) -> getString(R.string.part2WeatherA04)
            getString(R.string.part2WeatherQ05) -> getString(R.string.part2WeatherA05)
            getString(R.string.part2WeatherQ06) -> getString(R.string.part2WeatherA06)
            getString(R.string.part2WeatherQ07) -> getString(R.string.part2WeatherA07)

            getString(R.string.part2TechnologyQ01) -> getString(R.string.part2TechnologyA01)
            getString(R.string.part2TechnologyQ02) -> getString(R.string.part2TechnologyA02)
            getString(R.string.part2TechnologyQ03) -> getString(R.string.part2TechnologyA03)
            getString(R.string.part2TechnologyQ04) -> getString(R.string.part2TechnologyA04)
            getString(R.string.part2TechnologyQ05) -> getString(R.string.part2TechnologyA05)
            getString(R.string.part2TechnologyQ06) -> getString(R.string.part2TechnologyA06)
            getString(R.string.part2TechnologyQ07) -> getString(R.string.part2TechnologyA07)
            getString(R.string.part2TechnologyQ08) -> getString(R.string.part2TechnologyA08)

            else -> "Not found"
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(question: String) =
            Part2AnswersFragment().apply {
                arguments = Bundle().apply {
                    putString(QUESTION, question)
                }
            }
    }
}