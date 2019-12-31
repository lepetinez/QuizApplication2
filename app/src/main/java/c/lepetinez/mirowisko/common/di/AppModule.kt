package c.lepetinez.mirowisko.common.di

import android.app.Application
import android.content.Context
import c.lepetinez.mirowisko.common.rx.RxSchedulers
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(application: Application): Context = application


    @Singleton
    @Provides
    fun provideSchedulers(): RxSchedulers = RxSchedulers()
}