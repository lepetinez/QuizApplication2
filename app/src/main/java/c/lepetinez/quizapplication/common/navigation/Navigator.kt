package c.lepetinez.quizapplication.common.navigation

import io.reactivex.subjects.BehaviorSubject

abstract class Navigator<T> {

    private val navigatorEvent: BehaviorSubject<T> = BehaviorSubject.create()

    fun observe() = navigatorEvent

    fun call(event: T) {
        navigatorEvent.onNext(event)
    }
}