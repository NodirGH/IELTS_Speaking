package my.application.ieltsspeaking.home.category.part2Topic.question

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.adapter.Part1QuestionsAdapter
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions
import my.application.ieltsspeaking.home.category.part2Topic.question.answer.Part2AnswersFragment
import my.application.ieltsspeaking.home.category.part2Topic.question.data.Part2QuestionsData

private const val HEADING = "heading"

class Part2QuestionsFragment : Fragment(), Part1QuestionsAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart2QuestionsBinding
    private var heading: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            heading = it.getString(HEADING)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart2QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeadingPart2Questions.text = this.heading

        setPart2RecyclerView()
    }

    private fun setPart2RecyclerView() {
        binding.rvPart2Questions.layoutManager = LinearLayoutManager(requireContext())
        val data: List<ModelPartsQuestions> = when(heading){
            "Activity" -> Part2QuestionsData.getActivityQuestions()
            "Advertisements" -> Part2QuestionsData.getAdvertisementQuestions()
            "Animal" -> Part2QuestionsData.getAnimalQuestions()
            "Clothes" -> Part2QuestionsData.getClothesQuestions()
            "Colors" -> Part2QuestionsData.getColorsQuestions()
            "Competition & Prizes" -> Part2QuestionsData.getCompetitionQuestions()
            "Education" -> Part2QuestionsData.getEducationQuestions()
            "Food & Health" -> Part2QuestionsData.getFoodQuestions()
            "Music" -> Part2QuestionsData.getMusicQuestions()
            "Money" -> Part2QuestionsData.getMoneyQuestions()
            "Plans" -> Part2QuestionsData.getPlansQuestions()
            "Pollution" -> Part2QuestionsData.getPollutionQuestions()
            "Service" -> Part2QuestionsData.getServiceQuestions()
            "Weather" -> Part2QuestionsData.getWeatherQuestions()
            "Technology & Devices" -> Part2QuestionsData.getTechnologyQuestions()

            else -> Part2QuestionsData.getTechnologyQuestions()
        }
        val adapter = Part1QuestionsAdapter(data, this)
        binding.rvPart2Questions.adapter = adapter
    }

    override fun onItemClick(modelPartsQuestions: ModelPartsQuestions) {
        val part2AnswerFragment = Part2AnswersFragment.newInstance(modelPartsQuestions.question)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, part2AnswerFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance(heading: String) =
            Part2QuestionsFragment().apply {
                arguments = Bundle().apply {
                    putString(HEADING, heading)
                }
            }
    }
}