package com.example.ieltsspeaking.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ieltsspeaking.home.category.test_yourself.TestYourselfFragment
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentHomeBinding
import com.example.ieltsspeaking.home.adapter.HomeAdapter
import com.example.ieltsspeaking.home.category.about.AboutFragment
import com.example.ieltsspeaking.home.category.band_score.BandCalculationFragment
import com.example.ieltsspeaking.home.category.info.InfoFragment
import com.example.ieltsspeaking.home.data.HomeData
import com.example.ieltsspeaking.home.category.part1Topic.Part1TopicFragment
import com.example.ieltsspeaking.home.category.video_answer.VideoAnswerBandsFragment
import com.example.ieltsspeaking.home.category.pronunciation.PronunciationFragment

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvHome.layoutManager = GridLayoutManager(requireContext(), 2)
        val homeData = HomeData.getHomeData()
        val adapter = HomeAdapter(homeData)
        binding.rvHome.adapter = adapter

        adapter.setOnItemClickListener(object : HomeAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                when (position + 1) {
                    1 -> navigateToFullTestFragment()
                    2 -> navigateToPronunciationFragment()
                    3 -> navigateToPart1TopicFragment()
                    4 -> Toast.makeText(requireContext(), "You clicked #4", Toast.LENGTH_SHORT)
                        .show()
                    5 -> Toast.makeText(requireContext(), "You clicked #5", Toast.LENGTH_SHORT)
                        .show()
                    6 -> Toast.makeText(requireContext(), "You clicked #6", Toast.LENGTH_SHORT)
                        .show()
                    7 -> navigateToVideoAnswerFragment()
                    8 -> navigateToBandCalculationFragment()
                    9 -> navigateToInfoFragment()
                    10 -> navigateToAboutFragment()
                }
            }

        })

        toggle = ActionBarDrawerToggle(
            requireActivity(),
            binding.drawerLayoutHome,
            R.string.open,
            R.string.close
        )
        binding.drawerLayoutHome.addDrawerListener(toggle)
        toggle.syncState()

        binding.ibMenu.setOnClickListener {
            if (!binding.drawerLayoutHome.isOpen) {
                binding.drawerLayoutHome.open()
            }
        }

        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navRate -> Toast.makeText(requireContext(), "Rate us", Toast.LENGTH_SHORT)
                    .show()
                R.id.navContact -> Toast.makeText(
                    requireContext(),
                    "Contact us",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.navShare -> Toast.makeText(requireContext(), "Share it", Toast.LENGTH_SHORT)
                    .show()
                R.id.navSuggestions -> Toast.makeText(
                    requireContext(),
                    "Give your suggestions",
                    Toast.LENGTH_SHORT
                ).show()
                R.id.navReportBugs -> Toast.makeText(
                    requireContext(),
                    "Report bugs",
                    Toast.LENGTH_SHORT
                ).show()
            }
            true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun navigateToFullTestFragment() {
        val fullTestFragment = TestYourselfFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, fullTestFragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToPronunciationFragment(){
        val pronunciationFragment = PronunciationFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, pronunciationFragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToPart1TopicFragment() {
        val part1TopicFragment = Part1TopicFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, part1TopicFragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToBandCalculationFragment() {
        val bandCalculationFragment = BandCalculationFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, bandCalculationFragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToAboutFragment() {
        val aboutFragment = AboutFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, aboutFragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToInfoFragment() {
        val infoFragment = InfoFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        transaction.replace(R.id.fragmentContainerView, infoFragment)
        transaction.addToBackStack(null).commit()
    }

    private fun navigateToVideoAnswerFragment() {
        val fragment = VideoAnswerBandsFragment()
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