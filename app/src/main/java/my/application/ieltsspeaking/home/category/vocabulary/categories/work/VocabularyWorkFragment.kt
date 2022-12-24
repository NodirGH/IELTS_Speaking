package my.application.ieltsspeaking.home.category.vocabulary.categories.work

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyWorkBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.adapter.VocabularyWordsAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.StartLearningFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.WorkTestFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.work.data.DataVocabulary

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
            navigateToStartLearningFragment()
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

    private fun navigateToStartLearningFragment(){
        val fragment = StartLearningFragment()
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