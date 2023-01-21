package my.application.ieltsspeaking.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.annotation.IdRes
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import com.google.android.material.snackbar.Snackbar
import com.google.android.youtube.player.YouTubeBaseActivity
import my.application.ieltsspeaking.R

const val googleApi = "AIzaSyBnuAg9uZBe0lUnj16_sdRprdrbvDe0bII"


fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, length).show()
}

fun Context.snackBar(view: View, message: String) {
    Snackbar.make(view, message, Snackbar.LENGTH_LONG).show()
}

fun View.manageVisibility(isVisible: Boolean) {
    if (isVisible)
        this.visibility = View.VISIBLE
    else
        this.visibility = View.GONE
}

class UtilsForApp{
    companion object{

        fun updateStatusBarColor(
            @ColorRes colorId: Int,
            context: Context,
            activity: Activity
        ) {
            val window = activity.window
            window.statusBarColor = ContextCompat.getColor(context, colorId)
        }

    }
}

fun NavController.navigateSafeAction(
    @IdRes resId: Int,
    args: Bundle? = null,
    navOptions: NavOptions? = null,
    navExtras: Navigator.Extras? = null
) {
    var navOptionsRef = navOptions
    if(navOptions == null){
        navOptionsRef = NavOptions
            .Builder()
            .setEnterAnim(R.anim.from_right)
            .setExitAnim(R.anim.to_left)
            .setPopEnterAnim(R.anim.from_left)
            .setPopExitAnim(R.anim.to_right)
            .build()
    }
    val action = currentDestination?.getAction(resId) ?: graph.getAction(resId)
    if (action != null && currentDestination?.id != action.destinationId) {
        navigate(resId, args, navOptionsRef, navExtras)
    }
}

fun NavController.navigateSafe(
    @IdRes resId: Int,
    args: Bundle? = null,
    navOptions: NavOptions? = null,
    navExtras: Navigator.Extras? = null
) {
    var navOptionsRef = navOptions
    if(navOptions == null){
        navOptionsRef = NavOptions
            .Builder()
            .setEnterAnim(R.anim.from_right)
            .setExitAnim(R.anim.to_left)
            .setPopEnterAnim(R.anim.from_left)
            .setPopExitAnim(R.anim.to_right)
            .build()
    }
    if (currentDestination?.id != resId) {
        navigate(resId, args, navOptionsRef, navExtras)
    }
}