package my.application.ieltsspeaking.home.category.part2Topic.question

import android.os.Bundle
import android.view.View
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentPart2QuestionsBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.part1Topic.questions.adapter.PartsQuestionsAdapter
import my.application.ieltsspeaking.home.category.part1Topic.questions.model.ModelPartsQuestions
import my.application.ieltsspeaking.home.category.part2Topic.question.answer.Part2AnswersFragment
import my.application.ieltsspeaking.utils.UtilsForApp
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.toast

class Part2QuestionsFragment : BaseFragment<FragmentPart2QuestionsBinding>(FragmentPart2QuestionsBinding::inflate) {

    private var database = FirebaseFirestore.getInstance()
    private lateinit var adapter: PartsQuestionsAdapter
    private val args: Part2QuestionsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = PartsQuestionsAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.background_light_blue, requireContext(), requireActivity())

        binding.rvPart2Questions.layoutManager = LinearLayoutManager(requireContext())
        binding.rvPart2Questions.adapter = adapter

        adapter.setClickListener(object : PartsQuestionsAdapter.PartsQuestionClickListener{
            override fun onQuestionClick(question: ModelPartsQuestions) {
                val action = Part2QuestionsFragmentDirections.actionPart2QuestionsFragmentToPart2AnswersFragment(question)
                findNavController().navigate(action.actionId, action.arguments)
            }
        })

       val databaseCollection : Query = database.collection("Part2Topics").document(args.topic.hashId).collection("${args.topic.heading}Question").orderBy("id")
        databaseCollection.get().addOnSuccessListener {

            val userQuestionList = ArrayList<ModelPartsQuestions>()

            if (!it.isEmpty){
                for (document in it.documents){
                    val question = document.toObject(ModelPartsQuestions::class.java)
                    if (question != null){
                        userQuestionList.add(question)
                        binding.pbPart2Question.manageVisibility(false)
                    }
                }

                if (adapter.itemCount == 0) adapter.submitList(userQuestionList)
            } else {
                requireContext().toast("It is empty")
            }
        }
            .addOnFailureListener { requireContext().toast(it.toString()) }

        binding.tvHeadingPart2Questions.text = args.topic.heading

    }
}