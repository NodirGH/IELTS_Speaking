package com.example.ieltsspeaking.home.band_score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentBandCalculationBinding
import com.example.ieltsspeaking.databinding.FragmentHomeBinding

class BandCalculationFragment : Fragment() {
    private var _binding: FragmentBandCalculationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBandCalculationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val scoreIELTS = listOf(
            "9",
            "8,5",
            "8",
            "7,5",
            "7",
            "6,5",
            "6",
            "5,5",
            "5",
            "4,5",
            "4",
            "3,5",
            "3",
            "2,5",
            "2",
            "1,5",
            "1"
        )
        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_front_color,
            scoreIELTS
        )
        adapter.setDropDownViewResource(R.layout.spinner_word_color)
        binding.spListening.adapter = adapter

        binding.spListening.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }

        binding.spReading.adapter = adapter
        binding.spReading.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        binding.spSpeaking.adapter = adapter
        binding.spSpeaking.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        binding.spWriting.adapter = adapter
        binding.spWriting.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

    }

}