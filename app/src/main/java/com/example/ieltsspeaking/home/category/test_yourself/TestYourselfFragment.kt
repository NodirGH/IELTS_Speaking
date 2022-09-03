package com.example.ieltsspeaking.home.category.test_yourself

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentTestYourselfBinding
import com.example.ieltsspeaking.home.category.test_yourself.part1.TestYourselfPart1Fragment
import com.example.ieltsspeaking.home.category.test_yourself.part2.TestYourselfPart2Fragment
import com.example.ieltsspeaking.home.category.test_yourself.part3.TestYourselfPart3Fragment

class TestYourselfFragment : Fragment() {

    private lateinit var binding: FragmentTestYourselfBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestYourselfBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPart1.setOnClickListener { navigateToPart1() }

        binding.btnPart2.setOnClickListener { navigateToPart2() }

        binding.btnPart3.setOnClickListener { navigateToPart3() }
    }

    private fun navigateToPart1() {
        val part1Fragment = TestYourselfPart1Fragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part1Fragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToPart2() {
        val part2Fragment = TestYourselfPart2Fragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part2Fragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToPart3() {
        val part3Fragment = TestYourselfPart3Fragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, part3Fragment)
        transaction.addToBackStack(null).commit()
    }
}