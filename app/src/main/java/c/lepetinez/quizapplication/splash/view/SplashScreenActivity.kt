package c.lepetinez.quizapplication.splash.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import c.lepetinez.quizapplication.R
import c.lepetinez.quizapplication.splash.viewmodel.SplashScreenViewmodel
import org.koin.android.viewmodel.ext.android.viewModel

class SplashScreenActivity : AppCompatActivity() {

    val splashViewModel: SplashScreenViewmodel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}