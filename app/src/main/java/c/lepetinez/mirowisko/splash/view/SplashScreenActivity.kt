package c.lepetinez.mirowisko.splash.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleObserver
import c.lepetinez.mirowisko.R
import c.lepetinez.mirowisko.splash.viewmodel.SplashScreenViewModel
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class SplashScreenActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var splashScreenViewModel: SplashScreenViewModel

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        lifecycle.addObserver(splashScreenViewModel)
        setContentView(R.layout.activity_splash)
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = fragmentInjector
}