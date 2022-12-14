package my.application.ieltsspeaking.home.category.test_yourself.part1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentTestYourselfPart1Binding
import my.application.ieltsspeaking.home.category.test_yourself.local.RecordingViewModel
import my.application.ieltsspeaking.home.category.test_yourself.model.TestYourselfModel
import my.application.ieltsspeaking.home.category.test_yourself.part1.adapter.TestYourselfPart1Adapter
import my.application.ieltsspeaking.home.category.test_yourself.part1.data.TestYourselfPart1Data

class TestYourselfPart1Fragment : Fragment(),
    TestYourselfPart1Adapter.OnItemTestYourselfPart1ClickListener {

    private lateinit var binding: FragmentTestYourselfPart1Binding
    private lateinit var questionList: ArrayList<TestYourselfModel>
    private val db = FirebaseFirestore.getInstance()
    private val viewModel: RecordingViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestYourselfPart1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.rvTestYourselfPart1.layoutManager =LinearLayoutManager(requireContext())
//
//        questionList = arrayListOf()
//        db.collection("TestYourself").document("LPZApSE6vXRSDHKHHjev").collection("part1Questions").orderBy("id").get().addOnSuccessListener {
//            if (!it.isEmpty){
//                for (data in it.documents){
//                    val questions: TestYourselfModel? = data.toObject(TestYourselfModel::class.java)
//                    if (questions != null){
//                        questionList.add(questions)
//                    }
//                }
//                val adapter = TestYourselfPart1Adapter(questionList, this)
//                binding.rvTestYourselfPart1.adapter = adapter
//
//            }
//        }.addOnFailureListener {
//            Toast.makeText(
//                requireContext(),
//                it.toString(),
//                Toast.LENGTH_LONG
//            ).show()
//        }

        viewModel.insertInitialQuestions()

        binding.rvTestYourselfPart1.layoutManager = LinearLayoutManager(requireContext())
        val testYourselfPart1Data = TestYourselfPart1Data.getTestYourselfPart1Data()
        val adapter = TestYourselfPart1Adapter(testYourselfPart1Data, this)
        binding.rvTestYourselfPart1.adapter = adapter
    }

    override fun onItemClick(modelTestYourselfPart1: TestYourselfModel) {
        val fragment = TestYourselfPart1RecordingFragment.newInstance(modelTestYourselfPart1.question, modelTestYourselfPart1.answer)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}