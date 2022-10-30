package com.example.ieltsspeaking.home.category.vocabulary.categories.start_learning

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentStartLearningBinding
import com.example.ieltsspeaking.utils.manageVisibility

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [StartLearningFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StartLearningFragment : Fragment() {

    private lateinit var binding: FragmentStartLearningBinding
    lateinit var front_anim: AnimatorSet
    lateinit var back_anim: AnimatorSet
    var isFront: Boolean = true

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStartLearningBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val scale: Float = requireActivity().applicationContext.resources.displayMetrics.density
        binding.tvFlipCardFront.cameraDistance = 8000 * scale
        binding.llFlipCardBack.cameraDistance = 8000 * scale

        front_anim = AnimatorInflater.loadAnimator(requireContext().applicationContext, R.animator.flip_card_front_animation) as AnimatorSet
        back_anim = AnimatorInflater.loadAnimator(requireContext().applicationContext, R.animator.flip_card_back_animation) as AnimatorSet

        binding.tvFlipCardFront.setOnClickListener {
            if (isFront){
                front_anim.setTarget(binding.tvFlipCardFront)
                back_anim.setTarget(binding.llFlipCardBack)
                front_anim.start()
                back_anim.start()
                isFront = false
                binding.llFlipCardBack.manageVisibility(true)
            } else{
                front_anim.setTarget(binding.llFlipCardBack)
                back_anim.setTarget(binding.tvFlipCardFront)
                back_anim.start()
                front_anim.start()
                isFront = true
                binding.tvFlipCardFront.manageVisibility(true)
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment StartLearningFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StartLearningFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}