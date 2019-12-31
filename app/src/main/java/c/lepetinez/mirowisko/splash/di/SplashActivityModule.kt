package c.lepetinez.mirowisko.splash.di

import c.lepetinez.mirowisko.splash.navigation.SplashScreenNavigator
import c.lepetinez.mirowisko.splash.view.SplashScreenActivity
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    @PerActivity
    fun provideSplashNavigator(activity: SplashScreenActivity): SplashScreenNavigator =
            SplashScreenNavigator(activity)
}