package c.lepetinez.mirowisko.splash.di

import c.lepetinez.mirowisko.common.activity.extensions.getViewModel
import c.lepetinez.mirowisko.common.di.scopes.PerActivity
import c.lepetinez.mirowisko.common.rx.RxSchedulers
import c.lepetinez.mirowisko.splash.navigation.SplashScreenNavigator
import c.lepetinez.mirowisko.splash.view.SplashScreenActivity
import c.lepetinez.mirowisko.splash.viewmodel.SplashScreenViewModel
import dagger.Module
import dagger.Provides

@Module
class SplashActivityModule {

    @Provides
    @PerActivity
    fun provideSplashNavigator(activity: SplashScreenActivity): SplashScreenNavigator =
            SplashScreenNavigator(activity)

    @Provides
    @PerActivity
    fun provideSplashScreenViewModel(
            activity: SplashScreenActivity,
            navigator: SplashScreenNavigator,
            schedulers: RxSchedulers
    ): SplashScreenViewModel =
            activity.getViewModel(
                    SplashScreenViewModel(
                            navigator,
                            schedulers
                    )
            )
}