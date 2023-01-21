package my.application.ieltsspeaking.home

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.viewbinding.ViewBinding
import my.application.ieltsspeaking.MainActivity


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<VB : ViewBinding>(
    private val inflate: Inflate<VB>
) : Fragment() {
    private var _binding: VB? = null
    val binding get() = _binding!!
    val bindingSafe get() = _binding
    var isSavedState = true


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (isSavedState && _binding != null)
            return binding.root
        _binding = inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    fun updateStatusBarColor(
        @ColorRes colorId: Int,
        isStatusBarFontDark: Boolean = true,
        isTranslucent: Boolean = false
    ) {

        val window = requireActivity().window
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = ContextCompat.getColor(requireContext(), colorId)
            setSystemBarTheme(isStatusBarFontDark)
        } else {
            window.statusBarColor = ContextCompat.getColor(requireContext(), colorId)
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private fun setSystemBarTheme(isStatusBarFontDark: Boolean) {
        val lFlags = requireActivity().window.decorView.systemUiVisibility
        requireActivity().window.decorView.systemUiVisibility =
            if (isStatusBarFontDark) lFlags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv() else lFlags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        requireActivity().window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }




    open fun replaceFragment(
        containerId: Int,
        destination: Fragment,
        backStack: Boolean = false,
        transition: Int = FragmentTransaction.TRANSIT_NONE
    ) {
        if (requireActivity() !is MainActivity)
            return

        val fragment = childFragmentManager.findFragmentByTag(destination::class.java.name)

        if (fragment == null || !fragment.isAdded || !fragment.isVisible) {
            val transaction = childFragmentManager.beginTransaction()
            if (transition != FragmentTransaction.TRANSIT_NONE)
                transaction.setTransition(transition)
            transaction.replace(containerId, destination, tag)
            if (backStack)
                transaction.addToBackStack(null)
            transaction.commit()
        }
    }


    open fun openSettings(code: Int) {
        val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
        val uri = Uri.fromParts("package", requireContext().applicationContext.packageName, null)
        intent.data = uri
        startActivityForResult(intent, code)
    }





}