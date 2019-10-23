package c.lepetinez.quizapplication.common.di

import android.app.Application
import android.content.Context
import c.lepetinez.quizapplication.common.rx.RxSchedulers
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