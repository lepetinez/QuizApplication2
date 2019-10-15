package c.lepetinez.quizapplication.splash.navigation

import android.annotation.SuppressLint
import c.lepetinez.quizapplication.common.navigation.Navigator

class SplashScreenNavigator : Navigator<SplashScreenNavigation>() {

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