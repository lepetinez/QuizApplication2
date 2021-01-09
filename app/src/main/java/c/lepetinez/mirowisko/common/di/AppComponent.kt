package c.lepetinez.mirowisko.common.di

import android.app.Application
import c.lepetinez.mirowisko.common.app.MirowiskoApplication
import c.lepetinez.mirowisko.splash.di.SplashActivityBinder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        SplashActivityBinder::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(mirowiskoApplication: MirowiskoApplication)
}