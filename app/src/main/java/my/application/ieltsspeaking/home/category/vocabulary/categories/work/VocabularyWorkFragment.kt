package my.application.ieltsspeaking.home.category.vocabulary.categories.work

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.databinding.FragmentVocabularyWorkBinding
import my.application.ieltsspeaking.home.category.vocabulary.categories.adapter.VocabularyWordsAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.start_learning.StartLearningFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.test.WorkTestFragment
import my.application.ieltsspeaking.home.category.vocabulary.categories.work.data.DataVocabulary
import my.application.ieltsspeaking.utils.UtilsForVocabulary

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

        setRecyclerView()

        binding.btnWorkTest.setOnClickListener{
            UtilsForVocabulary.navigateFragment(WorkTestFragment(), parentFragmentManager)
        }

        binding.btnWorkStartLearning.setOnClickListener {
            UtilsForVocabulary.navigateFragment(StartLearningFragment(), parentFragmentManager)
        }
    }

    private fun setRecyclerView() {
        val data = DataVocabulary.getWorkWords()
        val adapter = VocabularyWordsAdapter(data)
        binding.rvVocabularyWork.layoutManager = LinearLayoutManager(requireContext())
        binding.rvVocabularyWork.adapter = adapter
    }
}