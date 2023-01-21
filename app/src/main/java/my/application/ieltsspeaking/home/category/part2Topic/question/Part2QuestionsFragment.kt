package my.application.ieltsspeaking.home.category.part2Topic.question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.adapter.PartsQuestionsAdapter
import my.application.ieltsspeaking.home.category.part1Topic.questions.answers.Part1AnswersFragment
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions
import my.application.ieltsspeaking.home.category.part2Topic.question.answer.Part2AnswersFragment
import my.application.ieltsspeaking.utils.UtilsForApp
import my.application.ieltsspeaking.utils.toast

class Part2QuestionsFragment : Fragment(), PartsQuestionsAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart2QuestionsBinding
    private var db = FirebaseFirestore.getInstance()
    private lateinit var userQuestionList: ArrayList<ModelPartsQuestions>
    private var topicId: Int? = null
    private lateinit var whichQuestion: String
    private var questionId = 0
    private var addBackStack = false
    private var heading: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart2QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        arguments?.getInt("topic_position_part2").let {
            topicId = it
        }

        whichQuestion = when(topicId){
            1 -> "ActivityQuestion"
            2 -> "AdvertisementsQuestion"
            3 -> "AnimalQuestion"
            4 -> "ClothesQuestion"
            5 -> "ColorsQuestion"
            6 -> "CompetitionQuestion"
            7 -> "EducationQuestion"
            8 -> "FoodQuestion"
            9 -> "MusicQuestion"
            10 -> "MoneyQuestion"
            11 -> "PlansQuestion"
            12 -> "PollutionQuestion"
            13 -> "ServiceQuestion"
            14 -> "WeatherQuestion"
            15 -> "TechnologyQuestion"
            else -> "ActivityQuestion"
        }

        setPart2RecyclerView()
        userQuestionList = arrayListOf()

    }

    private fun setPart2RecyclerView() {

        binding.rvPart2Questions.layoutManager = LinearLayoutManager(requireContext())

        val dbCollection: Query = returnDocumentationPATH(topicId!!, whichQuestion)
        dbCollection.get().addOnSuccessListener {

            if (!it.isEmpty) {
                for (question in it.documents) {
                    val questions: ModelPartsQuestions? =
                        question.toObject(ModelPartsQuestions::class.java)
                    if (questions != null) {
                        userQuestionList.add(questions)
                    }
                }

                val adapter = PartsQuestionsAdapter(userQuestionList)

                binding.rvPart2Questions.adapter = adapter

                //TODO
//                adapter.setOnPart1QuestionClickListener(object :
//                    PartsQuestionsAdapter.PartsQuestionClickListener {
//                    override fun onQuestionClick(position: Int) {
//                        requireContext().toast("${position + 1} is clicked ")
//                        questionId = position+1
//                        navigateToAnswer(questionId)
//                    }
//                })
            } else { requireContext().toast("It is empty") }
        }
            .addOnFailureListener { requireContext().toast(it.toString()) }

        addBackStack = true
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

    private fun returnDocumentationPATH(position: Int, whichQuestion: String): Query{

        return db.collection("Part2Topics").document(
            when(position){
                1 -> "HIrbfA269rwoSihr2jwH"
                2 -> "jPYF23a2BMv2GMSSLC7J"
                3 -> "5PdLfk1DwA7suthx0mW8"
                4 -> "bArXoRiwPr4cBnALGqEX"
                5 -> "ccPNAjeNZ3p5aRSVtjod"
                6 -> "l7eCcphCiVgC11LNlpm2"
                7 -> "7al8V6jvSTpFbv4N04Vs"
                8 -> "N662vbEzfBu75V2iVtBt"
                9 -> "MRtSCfHJvSU2IKh3qjfq"
                10 -> "9jswuR8mS7o5FKUgWPmQ"
                11 -> "jK3g0a8bca8l996W2gDa"
                12 -> "TkrFy4CY3mQo76JtXZ10"
                13 -> "Q0drvTTqiRcjinlSbRrU"
                14 -> "wqhbg14wVU00ne11RGe"
                15 -> "BPQUYLDOcOdlnQv59VHC"
                else -> "HIrbfA269rwoSihr2jwH"
            }
        ).collection(whichQuestion).orderBy("id")
    }

    private fun navigateToAnswer(position: Int) {
        val fragment = Part2AnswersFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        val bundle = Bundle()
        bundle.apply {
            putInt("question position part2", position)
        }
        setFragmentResult("QUESTION PART2", bundle)
        transaction.addToBackStack(null)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }
}