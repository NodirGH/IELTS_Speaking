package my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Toast
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentStartLearningBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.data.WordConstants
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.model.ModelStartLearning
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.data.Constants
import my.application.ieltsspeaking.utils.manageVisibility

//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

class StartLearningFragment : Fragment(), OnClickListener {

    private lateinit var binding: FragmentStartLearningBinding
    private lateinit var frontAnim: AnimatorSet
    private lateinit var backAnim: AnimatorSet
    var isFront: Boolean = true
    private var currentPosition = 1
    private var wordList: ArrayList<ModelStartLearning>? = null
    private val wordCount = Constants.getWorkQuestions().size

//    private var param1: String? = null
//    private var param2: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartLearningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        wordList = WordConstants.getWorkWords()

        binding.btnLearnedStartLearning.setOnClickListener(this)

        setWords()


        val scale: Float = requireActivity().applicationContext.resources.displayMetrics.density
        binding.tvFlipCardFront.cameraDistance = 8000 * scale
        binding.llFlipCardBack.cameraDistance = 8000 * scale

        frontAnim = AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.flip_card_front_animation
        ) as AnimatorSet
        backAnim = AnimatorInflater.loadAnimator(
            requireContext().applicationContext,
            R.animator.flip_card_back_animation
        ) as AnimatorSet

        binding.tvFlipCardFront.setOnClickListener {
            if (isFront) {
                frontAnim.setTarget(binding.tvFlipCardFront)
                backAnim.setTarget(binding.llFlipCardBack)
                frontAnim.start()
                backAnim.start()
                isFront = false
                binding.llFlipCardBack.manageVisibility(true)
            } else {
                frontAnim.setTarget(binding.llFlipCardBack)
                backAnim.setTarget(binding.tvFlipCardFront)
                backAnim.start()
                frontAnim.start()
                isFront = true
                binding.tvFlipCardFront.manageVisibility(true)
            }
        }
    }

    private fun setWords() {

        val word = wordList!![currentPosition-1 ]

        binding.tvFlipCardFront.text = word.word
        binding.tvFlipCardDefinition.text = word.definition
        binding.tvFlipCardExample.text = word.example
        binding.pbProgressBarStartLearning.progress = currentPosition

        binding.pbProgressBarStartLearning.max = wordCount
        binding.tvProgressBarCounterStartLearning.text = "$currentPosition/$wordCount"


    }

//    companion object {
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            StartLearningFragment().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.btnLearnedStartLearning -> {
                if (currentPosition <= wordList!!.size) {
                    currentPosition++
                    showNextWord()
                } else{
                    Toast.makeText(
                        requireContext(),
                        "alert dialog is shown here",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    private fun showNextWord() {
        when {
            currentPosition <= wordList!!.size -> {
                setWords()
            }
            else -> {
                Toast.makeText(requireContext(), "alert dialog shown", Toast.LENGTH_SHORT).show()
            }
        }
    }
}