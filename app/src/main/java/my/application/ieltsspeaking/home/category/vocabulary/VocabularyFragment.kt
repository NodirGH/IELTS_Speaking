package my.application.ieltsspeaking.home.category.vocabulary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyBinding
import my.application.ieltsspeaking.home.category.vocabulary.adapter.VocabularyAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.model.ModelVocabularyWordlist
import my.application.ieltsspeaking.home.category.vocabulary.categories.work.VocabularyWorkFragment
import my.application.ieltsspeaking.home.category.vocabulary.data.VocabularyData
import my.application.ieltsspeaking.home.category.vocabulary.model.VocabularyModel

class VocabularyFragment : Fragment() {
    private lateinit var binding: FragmentVocabularyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVocabularyBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvVocabulary.layoutManager = LinearLayoutManager(requireContext())
        val data = VocabularyData.getVocabularyData()
        val adapter = VocabularyAdapter(data)
        binding.rvVocabulary.adapter = adapter

        adapter.setOnWordClickListener(object : VocabularyAdapter.OnVocabularyWordCLickListener {
            override fun onItemClick(position: Int) {
                when (position + 1) {
                    1 -> navigateToVocabularyWorkFragment()
                    2 -> Toast.makeText(requireContext(), "clicked 2", Toast.LENGTH_SHORT).show()
                    3 -> Toast.makeText(requireContext(), "clicked 3", Toast.LENGTH_SHORT).show()
                    4 -> Toast.makeText(requireContext(), "clicked 4", Toast.LENGTH_SHORT).show()
                    5 -> Toast.makeText(requireContext(), "clicked 5", Toast.LENGTH_SHORT).show()
                    6 -> Toast.makeText(requireContext(), "clicked 6", Toast.LENGTH_SHORT).show()
                    7 -> Toast.makeText(requireContext(), "clicked 7", Toast.LENGTH_SHORT).show()
                    8 -> Toast.makeText(requireContext(), "clicked 8", Toast.LENGTH_SHORT).show()
                    9 -> Toast.makeText(requireContext(), "clicked 9", Toast.LENGTH_SHORT).show()
                    10 -> Toast.makeText(requireContext(), "clicked 10", Toast.LENGTH_SHORT).show()
                    else -> Toast.makeText(requireContext(), "Error occurred", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })
    }

    private fun navigateToVocabularyWorkFragment(){
        val fragment = VocabularyWorkFragment()
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