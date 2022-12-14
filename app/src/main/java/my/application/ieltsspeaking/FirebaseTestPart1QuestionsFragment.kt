package my.application.ieltsspeaking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import my.application.ieltsspeaking.databinding.FragmentFirebaseTestPart1QuestionsBinding

private const val POSITION = "position"
private const val HEADING = "heading"

class FirebaseTestPart1QuestionsFragment : Fragment() {
    private lateinit var binding: FragmentFirebaseTestPart1QuestionsBinding

    private var position: Int? = null
    private var heading: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            position = it.getInt(POSITION)
//            heading = it.getString(HEADING)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirebaseTestPart1QuestionsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTestFirebasePart1Question.text = this.position.toString()

    }

    companion object {
        @JvmStatic
        fun newPositionInstance(position: Int) =
            FirebaseTestPart1QuestionsFragment().apply {
                arguments = Bundle().apply {
                    putInt(POSITION, position)
//                    putString(HEADING, heading)
                }
            }
    }
}