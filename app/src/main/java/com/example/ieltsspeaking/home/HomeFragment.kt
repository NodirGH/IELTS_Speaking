package com.example.ieltsspeaking.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentHomeBinding
import com.example.ieltsspeaking.home.adapter.HomeAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvHome.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rvHome.adapter = HomeAdapter()

        toggle = ActionBarDrawerToggle(
            requireActivity(),
            binding.drawerLayoutHome,
            R.string.open,
            R.string.close
        )
        binding.drawerLayoutHome.addDrawerListener(toggle)
        toggle.syncState()

        //supportActionBar?.setDisplayHomeAsUpEnabled(true)    unable to implement. Should be found out

        binding.ibMenu.setOnClickListener {
            if (!binding.drawerLayoutHome.isOpen){
                binding.drawerLayoutHome.open()
            }
        }

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navRate -> Toast.makeText(requireContext(), "Rate us", Toast.LENGTH_SHORT).show()
                R.id.navContact -> Toast.makeText(requireContext(), "Contact us", Toast.LENGTH_SHORT).show()
                R.id.navShare -> Toast.makeText(requireContext(), "Share it", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}