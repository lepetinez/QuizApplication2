package c.lepetinez.quizapplication.splash.viewmodel

import c.lepetinez.quizapplication.common.lifecycle.LifecycleViewModel
import c.lepetinez.quizapplication.splash.navigation.SplashScreenNavigation

class SplashScreenViewmodel(
        private val splashScreenNavigation: SplashScreenNavigation
) : LifecycleViewModel() {

    override fun onCreate() {
        super.onCreate()
        navigateToMainActivity()
    }

    private fun navigateToMainActivity() {

    }
}