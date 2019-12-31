package c.lepetinez.mirowisko.splash.di

import c.lepetinez.mirowisko.splash.view.SplashScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SplashActivityBinder {

    @ContributesAndroidInjector(modules = [SplashActivityModule::class])
    @PerActivity
    abstract fun bindSplashActivity(): SplashScreenActivity
}