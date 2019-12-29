package c.lepetinez.quizapplication.splash.navigation

import android.annotation.SuppressLint
import android.app.Activity
import c.lepetinez.quizapplication.common.navigation.Navigator

class SplashScreenNavigator(activity: Activity) : Navigator<SplashScreenNavigation>() {

    @SuppressLint("CheckResult")
    fun get() {
        observe().subscribe {
            when (it) {
                is SplashScreenNavigation.ShowMainActivityScreen -> navigateToMainActivity()
            }
        }
    }

    private fun navigateToMainActivity() {}
}