package my.application.ieltsspeaking.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.TestFirebaseFragment
import my.application.ieltsspeaking.databinding.FragmentHomeBinding
import my.application.ieltsspeaking.home.adapter.HomeAdapter
import my.application.ieltsspeaking.home.category.about.AboutFragment
import my.application.ieltsspeaking.home.category.band_score.BandCalculationFragment
import my.application.ieltsspeaking.home.category.info.InfoFragment
import my.application.ieltsspeaking.home.category.part1Topic.Part1TopicFragment
import my.application.ieltsspeaking.home.category.part2Topic.Part2TopicFragment
import my.application.ieltsspeaking.home.category.part3Topic.Part3TopicFragment
import my.application.ieltsspeaking.home.category.pronunciation.PronunciationFragment
import my.application.ieltsspeaking.home.category.test_yourself.TestYourselfFragment
import my.application.ieltsspeaking.home.category.video_answer.VideoAnswerBandsFragment
import my.application.ieltsspeaking.home.category.vocabulary.VocabularyFragment
import my.application.ieltsspeaking.home.data.HomeData
import my.application.ieltsspeaking.utils.UtilsForVocabulary
import my.application.ieltsspeaking.utils.toast

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var adapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setStatusBarColor(R.color.status_bar_home_fragment)
        setRecyclerView()
        setDrawerLayout()

        adapter.setOnItemClickListener(object : HomeAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                when (position + 1) {
                    1 -> UtilsForVocabulary.navigateFragment(
                        TestYourselfFragment(),
                        parentFragmentManager
                    )
                    2 -> UtilsForVocabulary.navigateFragment(
                        PronunciationFragment(),
                        parentFragmentManager
                    )
                    3 -> UtilsForVocabulary.navigateFragment(
                        Part1TopicFragment(),
                        parentFragmentManager
                    )
                    4 -> UtilsForVocabulary.navigateFragment(
                        Part2TopicFragment(),
                        parentFragmentManager
                    )
                    5 -> UtilsForVocabulary.navigateFragment(
                        Part3TopicFragment(),
                        parentFragmentManager
                    )
                    6 -> UtilsForVocabulary.navigateFragment(
                        VocabularyFragment(),
                        parentFragmentManager
                    )
                    7 -> UtilsForVocabulary.navigateFragment(
                        VideoAnswerBandsFragment(),
                        parentFragmentManager
                    )
                    8 -> UtilsForVocabulary.navigateFragment(
                        BandCalculationFragment(),
                        parentFragmentManager
                    )
                    9 -> UtilsForVocabulary.navigateFragment(InfoFragment(), parentFragmentManager)
                    10 -> UtilsForVocabulary.navigateFragment(
                        AboutFragment(),
                        parentFragmentManager
                    )
                }
            }
        })

        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navRate -> UtilsForVocabulary.navigateFragment(
                    TestFirebaseFragment(),
                    parentFragmentManager
                )
                R.id.navContact -> requireContext().toast("Contact")
                R.id.navShare -> requireContext().toast("Share it")
                R.id.navSuggestions -> requireContext().toast("Give your suggestions")
                R.id.navReportBugs -> requireContext().toast("Report Bug")
            }
            true
        }
    }

    private fun setDrawerLayout() {
        toggle = ActionBarDrawerToggle(
            requireActivity(),
            binding.drawerLayoutHome,
            R.string.open,
            R.string.close
        )
        binding.drawerLayoutHome.addDrawerListener(toggle)
        toggle.syncState()

        binding.ibMenu.setOnClickListener {
            if (!binding.drawerLayoutHome.isOpen) {
                binding.drawerLayoutHome.open()
            }
        }
    }

    private fun setRecyclerView() {
        binding.rvHome.layoutManager = GridLayoutManager(requireContext(), 2)
        val homeData = HomeData.getHomeData()
        adapter = HomeAdapter(homeData)
        binding.rvHome.adapter = adapter
    }

    private fun setStatusBarColor(color: Int) {
        activity?.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        activity?.window?.statusBarColor = color
    }
}