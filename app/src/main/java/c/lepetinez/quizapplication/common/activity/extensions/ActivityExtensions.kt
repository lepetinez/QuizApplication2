package c.lepetinez.quizapplication.common.activity.extensions

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

inline fun <reified VM : ViewModel, F : ViewModelProvider.Factory> AppCompatActivity.viewModel(crossinline f: () -> F): Lazy<VM> =
        lazy { ViewModelProvider(this, f.invoke()).get(VM::class.java) }

inline fun <reified VM : ViewModel> AppCompatActivity.getViewModel(viewModel: VM): VM =
        ViewModelProvider(this, factoryWith(viewModel)).get(VM::class.java)

inline fun <reified T : ViewModel> factoryWith(viewModel: T): ViewModelProvider.Factory {
    return object : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return viewModel as T
        }
    }
}