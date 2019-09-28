package c.lepetinez.quizapplication.common.di

import c.lepetinez.quizapplication.common.rx.RxSchedulers
import org.koin.dsl.module

object AppModule {

    fun getModule() = module {
        single { RxSchedulers() }
    }
}