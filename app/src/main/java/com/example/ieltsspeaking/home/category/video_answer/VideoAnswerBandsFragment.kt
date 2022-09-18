package com.example.ieltsspeaking.home.category.video_answer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentVideoAnswerBandsBinding
import com.example.ieltsspeaking.home.category.video_answer.band_6.Band6AnswerFragment
import com.example.ieltsspeaking.home.category.video_answer.band_7.Band7AnswerFragment
import com.example.ieltsspeaking.home.category.video_answer.band_8.Band8AnswerFragment
import com.example.ieltsspeaking.home.category.video_answer.band_9.Band9AnswerFragment

class VideoAnswerBandsFragment : Fragment() {
    lateinit var binding: FragmentVideoAnswerBandsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVideoAnswerBandsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBand6.setOnClickListener {
            navigateToBand6Answer()
        }

        binding.btnBand7.setOnClickListener {
            navigateToBand7Answer()
        }

        binding.btnBand8.setOnClickListener {
            navigateToBand8Answer()
        }

        binding.btnBand9.setOnClickListener {
            navigateToBand9Answer()
        }
    }

    private fun navigateToBand6Answer(){
        val fragment = Band6AnswerFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToBand7Answer(){
        val fragment = Band7AnswerFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToBand8Answer(){
        val fragment = Band8AnswerFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToBand9Answer(){
        val fragment = Band9AnswerFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.addToBackStack(null).commit()
    }
}