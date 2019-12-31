package c.lepetinez.mirowisko.splash.viewmodel

import c.lepetinez.mirowisko.common.lifecycle.LifecycleViewModel
import c.lepetinez.mirowisko.splash.navigation.SplashScreenNavigation

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