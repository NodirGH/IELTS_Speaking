package my.application.ieltsspeaking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import my.application.ieltsspeaking.databinding.FragmentSplashBinding
import my.application.ieltsspeaking.utils.navigateSafe

class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivGmail.alpha = 0f
        binding.ivGmail.animate().setDuration(2000).alpha(1f).withEndAction{
            val action = SplashFragmentDirections.actionSplashFragmentToHomeFragment()
            findNavController().navigate(action)
        }

    }

}