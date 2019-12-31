package c.lepetinez.mirowisko.splash.viewmodel

import c.lepetinez.mirowisko.common.lifecycle.LifecycleViewModel
import c.lepetinez.mirowisko.common.rx.RxSchedulers
import c.lepetinez.mirowisko.splash.navigation.SplashScreenNavigation.ShowMainActivityScreen
import c.lepetinez.mirowisko.splash.navigation.SplashScreenNavigator
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import java.util.concurrent.TimeUnit

private const val SPLASH_SCREEN_DELAY_SECONDS = 2L

// TODO: tests will be added
class SplashScreenViewModel(
        private val splashScreenNavigator: SplashScreenNavigator,
        private val rxSchedulers: RxSchedulers
) : LifecycleViewModel() {

    private val disposables = CompositeDisposable()

    override fun onCreate() {
        super.onCreate()
        navigateToMainActivity()
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }

    private fun navigateToMainActivity() {
        // TODO: temporary solution, timer will be replaced by a logged-in check.
        disposables += Single.timer(SPLASH_SCREEN_DELAY_SECONDS, TimeUnit.SECONDS)
                .subscribeOn(rxSchedulers.io())
                .observeOn(rxSchedulers.mainThread())
                .subscribeBy(onSuccess = {
                    splashScreenNavigator.call(ShowMainActivityScreen)
                })
    }
}