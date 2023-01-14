package my.application.ieltsspeaking.home.category.part1Topic.questions

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
import my.application.ieltsspeaking.databinding.FragmentPart1QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.adapter.Part1QuestionsAdapter
import my.application.ieltsspeaking.home.category.part1Topic.questions.answers.Part1AnswersFragment
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions
import my.application.ieltsspeaking.utils.toast

class Part1QuestionsFragment : Fragment() {

    private lateinit var binding: FragmentPart1QuestionsBinding
    private var heading: String? = null
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
        binding = FragmentPart1QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.getInt("topic_position").let {
            topicId = it
        }
        whichQuestion = when(topicId){
            1 -> "WorkQuestion"
            2 -> "StudyQuestion"
            3 -> "HometownQuestion"
            4 -> "HomeQuestion"
            5 -> "ArtQuestion"
            6 -> "BirthdayQuestion"
            7 -> "ChildhoodQuestion"
            8 -> "ClothesQuestion"
            9 -> "DailyRoutineQuestion"
            10 -> "FoodQuestion"
            11 -> "HobbiesQuestion"
            12 -> "InternetQuestion"
            13 -> "LeisureTimeQuestion"
            14 -> "MusicQuestion"
            15 -> "ShoppingQuestion"
            else -> "WorkQuestion"
        }

        setRecyclerView()
        userQuestionList = arrayListOf()
    }

    private fun setRecyclerView() {
        binding.rvPart1Questions.layoutManager = LinearLayoutManager(requireContext())

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

                val adapter = Part1QuestionsAdapter(userQuestionList)

                binding.rvPart1Questions.adapter = adapter

                adapter.setOnPart1QuestionClickListener(object :
                    Part1QuestionsAdapter.Part1QuestionClickListener {
                    override fun onQuestionClick(position: Int) {
                        requireContext().toast("${position + 1} is clicked ")
                        questionId = position+1
                        navigateToAnswer(questionId)
                    }
                })
            } else { requireContext().toast("It is empty") }
        }
            .addOnFailureListener { requireContext().toast(it.toString()) }

       addBackStack = true
    }

    private fun returnDocumentationPATH(position: Int, whichQuestion: String): Query{

        return db.collection("Part1Topics").document(
        when(position){
            1 -> "Hlek682FDsV7sRgTwoBp"
            2 -> "ZMANxfssFdtWrWb4IkCj"
            3 -> "yonycpnim4ByVmFFh3NV"
            4 -> "z60XMqeco8lCTs4Y5vcZ"
            5 -> "cN9ONutmbq9Wh7RBLQx6"
            6 -> "93GYBNyAjyBBnUY6Had3"
            7 -> "sGGA5WMPOcjrIQcQkLpy"
            8 -> "Wa6yi0ZyT3NOu7gu7zrX"
            9 -> "zgoxZDZFPir7V3RLwIxF"
            10 -> "4poVNB21izcwc9iR4qbk"
            11 -> "UlmdAsmLGyZSqU7e2lwa"
            12 -> "WHsFI1HX4dEckv0c3K2Q"
            13 -> "jb6dTvoKf1gB1eVp8ooy"
            14 -> "vRpIFesXeetT9VB0EWKz"
            15 -> "zoeYoConPsuc5Tm7LZLk"
            else -> "Hlek682FDsV7sRgTwoBp"
        }
        ).collection(whichQuestion).orderBy("id")

    }

    private fun navigateToAnswer(position: Int) {
        val fragment = Part1AnswersFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        val bundle = Bundle()
        bundle.apply {
            putInt("question position", position)
        }
        setFragmentResult("QUESTION", bundle)
        transaction.addToBackStack(null)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }
}