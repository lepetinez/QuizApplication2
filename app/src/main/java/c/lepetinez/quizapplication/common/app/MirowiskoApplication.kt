package c.lepetinez.quizapplication.common.app

import android.app.Application
import c.lepetinez.quizapplication.common.di.AppModule
import org.koin.core.context.startKoin

class MirowiskoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { modules(listOf(AppModule.getModule())) }
    }
}