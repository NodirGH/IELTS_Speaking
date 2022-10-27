package com.example.ieltsspeaking.home.category.vocabulary.categories.work

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ieltsspeaking.R
import com.example.ieltsspeaking.databinding.FragmentVocabularyWorkBinding
import com.example.ieltsspeaking.home.category.vocabulary.VocabularyFragment

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

        binding.btnWorkTest.setOnClickListener{
            navigateToWorkTestFragment()
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