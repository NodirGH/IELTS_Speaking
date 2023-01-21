package my.application.ieltsspeaking.home.category.part3Topic.question

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart3QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.adapter.PartsQuestionsAdapter
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions
import my.application.ieltsspeaking.home.category.part2Topic.question.answer.Part2AnswersFragment
import my.application.ieltsspeaking.home.category.part3Topic.question.answer.Part3AnswersFragment
import my.application.ieltsspeaking.home.category.part3Topic.question.data.Part3QuestionsData
import my.application.ieltsspeaking.utils.UtilsForApp
import my.application.ieltsspeaking.utils.toast


class Part3QuestionsFragment : Fragment(), PartsQuestionsAdapter.OnItemClickListener {

    private lateinit var binding: FragmentPart3QuestionsBinding
    private var db = FirebaseFirestore.getInstance()
    private lateinit var userQuestionList: ArrayList<ModelPartsQuestions>
    private var topicId: Int? = null
    private lateinit var whichQuestion: String
    private var questionId = 0
    private var addBackStack = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPart3QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        arguments?.getInt("topic_position_part3").let {
            topicId = it
        }

        whichQuestion = when(topicId){
            1 -> "WeatherQuestion"
            2 -> "TravelQuestion"
            3 -> "TechnologyQuestion"
            4 -> "SleepQuestion"
            5 -> "ShoppingQuestion"
            6 -> "ServiceQuestion"
            7 -> "PollutionQuestion"
            8 -> "PolitenessQuestion"
            9 -> "PlansQuestion"
            10 -> "PeopleQuestion"
            else -> "WeatherQuestion"
        }

        setPart3RecyclerView()
        userQuestionList = arrayListOf()

    }

    private fun setPart3RecyclerView() {

        binding.rvPart3Questions.layoutManager = LinearLayoutManager(requireContext())

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

                binding.rvPart3Questions.adapter = adapter

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
        val part3AnswerFragment = Part3AnswersFragment.newInstance(modelPartsQuestions.question)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, part3AnswerFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun returnDocumentationPATH(position: Int, whichQuestion: String): Query{

        return db.collection("Part3Topics").document(
            when(position){
                1 -> "6zqJizH6JK7HQgWLoD6I"
                2 -> "qE6pLlwD75IzvwYOUXVN"
                3 -> "kUY6x0VJoV0sx3DJGizB"
                4 -> "IFcff47GmdHXHuDhKrKO"
                5 -> "QoCpmkok06KEGXaM2TYC"
                6 -> "ydPxF2hF5opy9iyCN5x3"
                7 -> "Tf97crJP0IJGwo8avw0a"
                8 -> "XNbLQorGC1X0kKtW9TmH"
                9 -> "14GIQT215I1RiDpR4Y1G"
                10 -> "5sDagrGFgltcvcLMNJTA"
                    else -> "6zqJizH6JK7HQgWLoD6I"
            }
        ).collection(whichQuestion).orderBy("id")
    }

    private fun navigateToAnswer(position: Int) {
        val fragment = Part3AnswersFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        val bundle = Bundle()
        bundle.apply {
            putInt("question position part3", position)
        }
        setFragmentResult("QUESTION PART3", bundle)
        transaction.addToBackStack(null)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }
}