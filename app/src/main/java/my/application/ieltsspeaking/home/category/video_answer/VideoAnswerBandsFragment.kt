package my.application.ieltsspeaking.home.category.video_answer

import android.content.Intent
import android.os.Bundle
import android.view.View
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVideoAnswerBandsBinding
import my.application.ieltsspeaking.home.BaseFragment
import my.application.ieltsspeaking.home.category.video_answer.band_6.Band6VideoAnswerActivity
import my.application.ieltsspeaking.home.category.video_answer.band_7.Band7VideoAnswerActivity
import my.application.ieltsspeaking.home.category.video_answer.band_8.Band8VideoAnswerActivity
import my.application.ieltsspeaking.home.category.video_answer.band_9.Band9VideoAnswerActivity
import my.application.ieltsspeaking.utils.UtilsForApp

class VideoAnswerBandsFragment : BaseFragment<FragmentVideoAnswerBandsBinding>(FragmentVideoAnswerBandsBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        UtilsForApp.updateStatusBarColor(R.color.bg_video_answer_bands, requireContext(), requireActivity())

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
        val intent = Intent(requireContext(), Band6VideoAnswerActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBand7Answer(){
        val intent = Intent(requireContext(), Band7VideoAnswerActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBand8Answer(){
        val intent = Intent(requireContext(), Band8VideoAnswerActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToBand9Answer(){
        val intent = Intent(requireContext(), Band9VideoAnswerActivity::class.java)
        startActivity(intent)
    }
}