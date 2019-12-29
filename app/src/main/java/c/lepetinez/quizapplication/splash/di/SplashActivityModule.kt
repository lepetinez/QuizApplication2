package c.lepetinez.quizapplication.splash.di

import c.lepetinez.quizapplication.splash.navigation.SplashScreenNavigator
import c.lepetinez.quizapplication.splash.view.SplashScreenActivity
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    @PerActivity
    fun provideSplashNavigator(activity: SplashScreenActivity): SplashScreenNavigator =
            SplashScreenNavigator(activity)
}