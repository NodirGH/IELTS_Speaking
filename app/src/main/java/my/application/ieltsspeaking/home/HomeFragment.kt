package my.application.ieltsspeaking.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentHomeBinding
import my.application.ieltsspeaking.home.adapter.HomeAdapter
import my.application.ieltsspeaking.home.category.about.AboutFragment
import my.application.ieltsspeaking.home.category.band_score.BandCalculationFragment
import my.application.ieltsspeaking.home.category.info.InfoFragment
import my.application.ieltsspeaking.home.category.part3Topic.Part3TopicFragment
import my.application.ieltsspeaking.home.category.pronunciation.PronunciationFragment
import my.application.ieltsspeaking.home.category.video_answer.VideoAnswerBandsFragment
import my.application.ieltsspeaking.home.category.vocabulary.VocabularyFragment
import my.application.ieltsspeaking.home.data.HomeData
import my.application.ieltsspeaking.home.drawer_layout.give_suggestion.GiveSuggestionsActivity
import my.application.ieltsspeaking.home.drawer_layout.report_bugs.ReportBugActivity
import my.application.ieltsspeaking.utils.*

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

        binding.navView.setupWithNavController(findNavController())

        UtilsForApp.updateStatusBarColor(
            R.color.background_light_green,
            requireContext(),
            requireActivity()
        )
        setRecyclerView()
        setDrawerLayout()

        adapter.setOnItemClickListener(object : HomeAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {
                when (position + 1) {
                    1 -> findNavController().navigateSafe(R.id.pronunciationFragment)
                    2 -> findNavController().navigateSafe(R.id.part1TopicFragment)
                    3 -> findNavController().navigateSafe(R.id.part2TopicFragment)
                    4 -> findNavController().navigateSafe(R.id.part3TopicFragment)
                    5 -> findNavController().navigateSafe(R.id.vocabularyFragment)
                    6 -> findNavController().navigateSafe(R.id.videoAnswerBandsFragment)
                    7 -> findNavController().navigateSafe(R.id.bandCalculationFragment)
                    8 -> findNavController().navigateSafe(R.id.infoFragment)
                    9 -> findNavController().navigateSafe(R.id.aboutFragment)
                    10 -> requireContext().snackBar(binding.root, "UNDER DEVELOPMENT")
                }
            }
        })

        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navRate -> requireContext().toast("")
                R.id.contactUsFragment -> {
                    findNavController().navigateSafe(R.id.contactUsFragment)
                    binding.drawerLayoutHome.close()
                }
                R.id.navShare -> requireContext().toast("Share it")
                R.id.navSuggestions -> navigateToGiveSuggestion()
                R.id.navReportBugs -> navigateToReportBug()
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

    private fun navigateToGiveSuggestion() {
        val intent = Intent(requireContext(), GiveSuggestionsActivity::class.java)
        startActivity(intent)
        binding.drawerLayoutHome.close()
    }

    private fun navigateToReportBug() {
        val intent = Intent(requireContext(), ReportBugActivity::class.java)
        startActivity(intent)
        binding.drawerLayoutHome.close()
    }
}