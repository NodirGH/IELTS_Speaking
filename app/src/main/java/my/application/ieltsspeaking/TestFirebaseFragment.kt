package my.application.ieltsspeaking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.databinding.FragmentTestFirebaseBinding
import my.application.ieltsspeaking.home.category.part1Topic.questions.Part1QuestionsFragment

class TestFirebaseFragment : Fragment() {

    private lateinit var binding: FragmentTestFirebaseBinding
    private lateinit var userList: ArrayList<FirebaseData>
    private val db = FirebaseFirestore.getInstance()
    private lateinit var testAdapter: FirebaseDataAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestFirebaseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvTestFirebase.layoutManager = LinearLayoutManager(requireContext())

        userList = arrayListOf()

        db.collection("Part1Topics").orderBy("id").get().addOnSuccessListener {
            if (!it.isEmpty) {
                for (data in it.documents) {
                    val users: FirebaseData? = data.toObject(FirebaseData::class.java)
                    if (users != null) {
                        userList.add(users)
                    }
                }
                val adapter = FirebaseDataAdapter(userList)
                binding.rvTestFirebase.adapter = adapter

                adapter.setOnPart1TopicClickListener(object : FirebaseDataAdapter.OnPart1TopicClickListener{
                    override fun onPart1TopicClick(position: Int) {
                        Toast.makeText(requireContext(), "${position+1} is clicked", Toast.LENGTH_SHORT)
                            .show()
                        navigateToQuestions()
                    }


                })

            }
        }
            .addOnFailureListener {
                Toast.makeText(
                    requireContext(),
                    it.toString(),
                    Toast.LENGTH_LONG
                ).show()
            }
    }
    private fun navigateToQuestions() {
        val firebaseData = FirebaseData()
        val fragment = Part1QuestionsFragment.newInstance(firebaseData.heading)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}