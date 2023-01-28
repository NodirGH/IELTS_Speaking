package my.application.ieltsspeaking.home

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import my.application.ieltsspeaking.R
import my.application.ieltsspeaking.databinding.FragmentHomeBinding
import my.application.ieltsspeaking.home.adapter.HomeAdapter
import my.application.ieltsspeaking.home.data.HomeData
import my.application.ieltsspeaking.home.drawer_layout.give_suggestion.GiveSuggestionsActivity
import my.application.ieltsspeaking.home.drawer_layout.report_bugs.ReportBugActivity
import my.application.ieltsspeaking.utils.*

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var adapter: HomeAdapter
    private var database = FirebaseFirestore.getInstance()
    private lateinit var linkDetail: String
    private lateinit var linkAddress: String

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
                R.id.navRate -> rateUs()
                R.id.contactUsFragment -> {
                    findNavController().navigateSafe(R.id.contactUsFragment)
                    binding.drawerLayoutHome.close()
                }
                R.id.navShare -> shareApp()
                R.id.navSuggestions -> navigateToGiveSuggestion()
                R.id.navReportBugs -> navigateToReportBug()
            }
            true
        }
        getLinks()
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

    private fun rateUs(){
        val uri: Uri = Uri.parse(linkDetail)
        val goToMarket = Intent(Intent.ACTION_VIEW, uri)

        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY or
                                Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                                Intent.FLAG_ACTIVITY_MULTIPLE_TASK)

        try {
            startActivity(goToMarket)
        } catch (e: ActivityNotFoundException){
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(linkAddress)))
        }
        binding.drawerLayoutHome.close()
    }

    private fun shareApp(){
        val shareBody = "Download IELTS SPEAKING Master on Play Store : $linkAddress"
        val shareSubject = "IELTS Speaking Master helps improve your speaking skills"

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"

        shareIntent.apply {
            putExtra(Intent.EXTRA_SUBJECT, shareSubject)
            putExtra(Intent.EXTRA_TEXT, shareBody)

            startActivity(shareIntent)
            binding.drawerLayoutHome.close()
        }
    }

    private fun getLinks(){
        val fireStoreDatabase = database.collection("AppLink").document("mvWPdC9BfLibgIYbYU0Q")
            fireStoreDatabase.get().addOnSuccessListener {

            if (it != null){
                linkDetail = it.data?.get("linkAfterDetails").toString()
                linkAddress = it.data?.get("link").toString()
            }

        }.addOnFailureListener { requireContext().toast("Failed. Try again") }
    }
}