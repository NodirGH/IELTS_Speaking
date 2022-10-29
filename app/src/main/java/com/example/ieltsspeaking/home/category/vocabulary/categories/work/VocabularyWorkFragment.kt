package com.example.ieltsspeaking.home.category.vocabulary.categories.work

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentVocabularyWorkBinding
import com.example.ieltsspeaking.home.category.vocabulary.VocabularyFragment
import com.example.ieltsspeaking.home.category.vocabulary.categories.adapter.VocabularyWordsAdapter
import com.example.ieltsspeaking.home.category.vocabulary.categories.test.WorkTestFragment
import com.example.ieltsspeaking.home.category.vocabulary.categories.work.data.DataVocabulary

class VocabularyWorkFragment : Fragment() {
    private lateinit var binding: FragmentVocabularyWorkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyWorkBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = DataVocabulary.getWorkWords()
        val adapter = VocabularyWordsAdapter(data)
        binding.rvVocabularyWork.layoutManager = LinearLayoutManager(requireContext())
        binding.rvVocabularyWork.adapter = adapter

        binding.btnWorkTest.setOnClickListener{
            navigateToWorkTestFragment()
        }

        binding.btnWorkStartLearning.setOnClickListener {
            Toast.makeText(requireContext(), "Learning started", Toast.LENGTH_SHORT).show()
        }
    }

    private fun navigateToWorkTestFragment(){
        val fragment = WorkTestFragment()
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