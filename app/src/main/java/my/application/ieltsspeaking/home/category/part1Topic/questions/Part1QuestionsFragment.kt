package my.application.ieltsspeaking.home.category.part1Topic.questions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart1QuestionsBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.adapter.Part1QuestionsAdapter
import my.application.ieltsspeaking.home.category.part1Topic.questions.answers.Part1AnswersFragment
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions

private const val HEADING = "heading"

class Part1QuestionsFragment : Fragment(){

    private lateinit var binding: FragmentPart1QuestionsBinding
    private var heading: String? = null
    private var db = FirebaseFirestore.getInstance()
    private lateinit var userQuestionList: ArrayList<ModelPartsQuestions>

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
        binding = FragmentPart1QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvHeadingPart1Questions.text = this.heading

        userQuestionList = arrayListOf()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        binding.rvPart1Questions.layoutManager = LinearLayoutManager(requireContext())

        db.collection("Part1Topics").document("Hlek682FDsV7sRgTwoBp"
        ).collection("WorkQuestion").get().addOnSuccessListener {

            if (!it.isEmpty) {
                for (question in it.documents) {
                    val questions: ModelPartsQuestions? =
                        question.toObject(ModelPartsQuestions::class.java)
                    if (questions != null){
                        userQuestionList.add(questions)
                    }
                }

                val adapter = Part1QuestionsAdapter(userQuestionList)

                binding.rvPart1Questions.adapter = adapter

                adapter.setOnPart1QuestionClickListener(object : Part1QuestionsAdapter.Part1QuestionClickListener{
                    override fun onQuestionClick(position: Int) {
                        Toast.makeText(
                            requireContext(),
                            "${position + 1} is clicked",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                })
            } else {
                Toast.makeText(requireContext(), "It is empty", Toast.LENGTH_SHORT).show()}
        }
            .addOnFailureListener { Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_LONG).show() }

    }

    companion object {
        @JvmStatic
        fun newInstance(heading: String) =
            Part1QuestionsFragment().apply {
                arguments = Bundle().apply {
                    putString(HEADING, heading)
                }
            }
    }
}