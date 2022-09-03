package com.example.ieltsspeaking.home.category.test_yourself.part1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentTestYourselfPart1Binding
import com.example.ieltsspeaking.home.category.test_yourself.model.TestYourselfModel
import com.example.ieltsspeaking.home.category.test_yourself.part1.adapter.TestYourselfPart1Adapter
import com.example.ieltsspeaking.home.category.test_yourself.part1.data.TestYourselfPart1Data

//private const val QUESTION = "question"

class TestYourselfPart1Fragment : Fragment(), TestYourselfPart1Adapter.OnItemTestYourselfPart1ClickListener {

    private lateinit var binding: FragmentTestYourselfPart1Binding
//    private var question: String? = null

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            question = it.getString(QUESTION)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestYourselfPart1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvTestYourselfPart1.layoutManager = LinearLayoutManager(requireContext())
        val testYourselfPart1Data = TestYourselfPart1Data.getTestYourselfPart1Data()
        val adapter = TestYourselfPart1Adapter(testYourselfPart1Data, this)
        binding.rvTestYourselfPart1.adapter = adapter
    }

    override fun onItemClick(modelTestYourselfPart1: TestYourselfModel) {
        val testYourselfPart1RecordingFragment = TestYourselfPart1RecordingFragment.newInstance(modelTestYourselfPart1.part1Question)
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, testYourselfPart1RecordingFragment)
        transaction.addToBackStack(null).commit()
    }
}