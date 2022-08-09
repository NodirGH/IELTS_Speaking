package com.example.ieltsspeaking.home.band_score

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentBandCalculationBinding

class BandCalculationFragment : Fragment() {
    private var _binding: FragmentBandCalculationBinding? = null
    private val binding get() = _binding!!

    private var readingScore: Double = 0.0
    private var speakingScore: Double = 0.0
    private var writingScore: Double = 0.0
    private var listeningScore: Double = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBandCalculationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val scoreList: MutableList<Double> = mutableListOf(
            1.0,
            1.5,
            2.0,
            2.5,
            3.0,
            3.5,
            4.0,
            4.5,
            5.0,
            5.5,
            6.0,
            6.5,
            7.0,
            7.5,
            8.0,
            8.5,
            9.0
        )

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.spinner_front_color,
            scoreList
        )
        adapter.setDropDownViewResource(R.layout.spinner_word_color)
        binding.spListening.adapter = adapter

        binding.spListening.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    adapterView: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val listen: Double =
                        adapterView?.getItemAtPosition(position).toString().toDouble()
                    listeningScore = listen
                    findAverage()
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {

                }
            }

        binding.spReading.adapter = adapter
        binding.spReading.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val read = adapterView?.getItemAtPosition(position).toString().toDouble()
                readingScore = read
                findAverage()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        binding.spSpeaking.adapter = adapter
        binding.spSpeaking.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val speak = adapterView?.getItemAtPosition(position).toString().toDouble()
                speakingScore = speak
                findAverage()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }

        binding.spWriting.adapter = adapter
        binding.spWriting.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val write = adapterView?.getItemAtPosition(position).toString().toDouble()
                writingScore = write
                findAverage()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }

    private fun findAverage() {

        when ((speakingScore + readingScore + listeningScore + writingScore) / 4) {
            1.0 -> binding.tvBandScore.text = "1"
            1.125 -> binding.tvBandScore.text = "1"
            1.25 -> binding.tvBandScore.text = "1.5"
            1.375 -> binding.tvBandScore.text = "1.5"
            1.5 -> binding.tvBandScore.text = "1.5"
            1.625 -> binding.tvBandScore.text = "1.5"
            1.75 -> binding.tvBandScore.text = "2"
            1.875 -> binding.tvBandScore.text = "2"
            2.0 -> binding.tvBandScore.text = "2"
            2.125 -> binding.tvBandScore.text = "2"
            2.25 -> binding.tvBandScore.text = "2.5"
            2.375 -> binding.tvBandScore.text = "2.5"
            2.5 -> binding.tvBandScore.text = "2.5"
            2.625 -> binding.tvBandScore.text = "2.5"
            2.75 -> binding.tvBandScore.text = "3"
            2.875 -> binding.tvBandScore.text = "3"
            3.0 -> binding.tvBandScore.text = "3"
            3.125 -> binding.tvBandScore.text = "3"
            3.25 -> binding.tvBandScore.text = "3.5"
            3.375 -> binding.tvBandScore.text = "3.5"
            3.5 -> binding.tvBandScore.text = "3.5"
            3.625 -> binding.tvBandScore.text = "3.5"
            3.75 -> binding.tvBandScore.text = "4"
            3.875 -> binding.tvBandScore.text = "4"
            4.0 -> binding.tvBandScore.text = "4"
            4.125 -> binding.tvBandScore.text = "4"
            4.25 -> binding.tvBandScore.text = "4.5"
            4.375 -> binding.tvBandScore.text = "4.5"
            4.5 -> binding.tvBandScore.text = "4.5"
            4.625 -> binding.tvBandScore.text = "4.5"
            4.75 -> binding.tvBandScore.text = "5"
            4.875 -> binding.tvBandScore.text = "5"
            5.0 -> binding.tvBandScore.text = "5"
            5.125 -> binding.tvBandScore.text = "5"
            5.25 -> binding.tvBandScore.text = "5.5"
            5.375 -> binding.tvBandScore.text = "5.5"
            5.5 -> binding.tvBandScore.text = "5.5"
            5.625 -> binding.tvBandScore.text = "5.5"
            5.75 -> binding.tvBandScore.text = "6"
            5.875 -> binding.tvBandScore.text = "6"
            6.0 -> binding.tvBandScore.text = "6"
            6.125 -> binding.tvBandScore.text = "6"
            6.25 -> binding.tvBandScore.text = "6.5"
            6.375 -> binding.tvBandScore.text = "6.5"
            6.5 -> binding.tvBandScore.text = "6.5"
            6.625 -> binding.tvBandScore.text = "6.5"
            6.75 -> binding.tvBandScore.text = "7"
            6.875 -> binding.tvBandScore.text = "7"
            7.0 -> binding.tvBandScore.text = "7"
            7.125 -> binding.tvBandScore.text = "7"
            7.25 -> binding.tvBandScore.text = "7.5"
            7.375 -> binding.tvBandScore.text = "7.5"
            7.5 -> binding.tvBandScore.text = "7.5"
            7.625 -> binding.tvBandScore.text = "7.5"
            7.75 -> binding.tvBandScore.text = "8"
            7.875 -> binding.tvBandScore.text = "8"
            8.0 -> binding.tvBandScore.text = "8"
            8.125 -> binding.tvBandScore.text = "8"
            8.25 -> binding.tvBandScore.text = "8.5"
            8.375 -> binding.tvBandScore.text = "8.5"
            8.5 -> binding.tvBandScore.text = "8.5"
            8.625 -> binding.tvBandScore.text = "8.5"
            8.75 -> binding.tvBandScore.text = "9"
            8.875 -> binding.tvBandScore.text = "9"
            9.0 -> binding.tvBandScore.text = "9"
        }
    }
}