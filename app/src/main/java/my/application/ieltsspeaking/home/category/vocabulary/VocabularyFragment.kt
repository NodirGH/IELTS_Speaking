package my.application.ieltsspeaking.home.category.vocabulary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.recyclerview.widget.LinearLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentVocabularyBinding
import my.application.ieltsspeaking.home.category.vocabulary.adapter.VocabularyAdapter
import my.application.ieltsspeaking.home.category.vocabulary.categories.work.VocabularyCategoriesFragment
import my.application.ieltsspeaking.home.category.vocabulary.data.VocabularyData
import my.application.ieltsspeaking.utils.UtilsForVocabulary

var globalTopicId = 0
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

                UtilsForVocabulary.navigateFragment(VocabularyCategoriesFragment(), parentFragmentManager)
                globalTopicId = position+1
//                navigateToQuestionFragment(position+1)
//                when (position + 1) {
//                    1 -> UtilsForVocabulary.navigateFragment(VocabularyWorkFragment(), parentFragmentManager)
//                    2 -> UtilsForVocabulary.navigateFragment(VocabularyWorkFragment(), parentFragmentManager)
//                    3 -> requireContext().toast("Clicked 3")
//                    4 -> requireContext().toast("Clicked 4")
//                    5 -> requireContext().toast("Clicked 5")
//                    6 -> requireContext().toast("Clicked 6")
//                    7 -> requireContext().toast("Clicked 7")
//                    8 -> requireContext().toast("Clicked 8")
//                    9 -> requireContext().toast("Clicked 9")
//                    10 -> requireContext().toast("Clicked 10")
//                    else -> requireContext().toast("Error")
//                }
            }
        })
    }

    private fun navigateToQuestionFragment(position: Int) {
        val fragment = VocabularyCategoriesFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.setCustomAnimations(
            R.anim.from_right,
            R.anim.to_left,
            R.anim.from_left,
            R.anim.to_right
        )
        val bundle = Bundle()
        bundle.apply {
            putInt("vocabulary topic position", position)
        }
        setFragmentResult("VOCABULARY TOPIC", bundle)
        transaction.addToBackStack(null)
        transaction.replace(R.id.fragmentContainerView, fragment).commit()
    }
}