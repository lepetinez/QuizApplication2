package c.lepetinez.quizapplication.splash.viewmodel

import c.lepetinez.quizapplication.common.lifecycle.LifecycleViewModel

class SplashScreenViewmodel: LifecycleViewModel() {



    override fun onCreate() {
        super.onCreate()
        navigateToMainActivity()
    }

    private fun navigateToMainActivity(){

    }
}