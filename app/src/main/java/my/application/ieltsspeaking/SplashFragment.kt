package my.application.ieltsspeaking

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import my.application.ieltsspeaking.databinding.FragmentSplashBinding
import my.application.ieltsspeaking.utils.manageVisibility
import my.application.ieltsspeaking.utils.navigateSafe

class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding
    private lateinit var backgroundAnimation: Animation
    private lateinit var iconAnimation: Animation
    private lateinit var ieltsAnimation: Animation
    private lateinit var speakingAnimation: Animation
    private lateinit var masterAnimation: Animation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         backgroundAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.zoom_in)
        binding.ivBackground.manageVisibility(true)
        binding.ivBackground.startAnimation(backgroundAnimation)

        Handler().postDelayed({firstView()}, 1000)

//        binding.ivGmail.alpha = 0f
//        binding.ivGmail.animate().setDuration(2000).alpha(1f).withEndAction{
//            val action = SplashFragmentDirections.actionSplashFragmentToHomeFragment()
//            findNavController().navigate(action)
//        }

    }

    private fun firstView() {
        iconAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.middle_splash_anim)
        ieltsAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.top_splash_anim)
        binding.ivIcon.manageVisibility(true)
        binding.ivIelts.manageVisibility(true)


        binding.ivIcon.startAnimation(iconAnimation)
        binding.ivIelts.startAnimation(ieltsAnimation)

        Handler().postDelayed({secondView()}, 1000)

    }

    private fun secondView() {
        speakingAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.middle_splash_anim)
        masterAnimation = AnimationUtils.loadAnimation(requireContext(), R.anim.bottom_splash_anim)
        binding.ivSpeaking.manageVisibility(true)
        binding.ivMaster.manageVisibility(true)


        binding.ivSpeaking.startAnimation(speakingAnimation)
        binding.ivMaster.startAnimation(masterAnimation)

        Handler().postDelayed({thirdView()}, 2000)
    }

    private fun thirdView() {
        val action = SplashFragmentDirections.actionSplashFragmentToHomeFragment()
        findNavController().navigate(action)
    }
}