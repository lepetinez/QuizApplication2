package c.lepetinez.mirowisko.splash.navigation

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import c.lepetinez.mirowisko.common.navigation.Navigator
import c.lepetinez.mirowisko.main.view.MainActivity

class SplashScreenNavigator(private val activity: Activity) : Navigator<SplashScreenNavigation>() {

    init{
        get()
    }

    @SuppressLint("CheckResult")
    fun get() {
        observe().subscribe {
            when (it) {
                is SplashScreenNavigation.ShowMainActivityScreen -> navigateToMainActivity()
            }
        }
    }

    private fun navigateToMainActivity() {
        activity.run {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}