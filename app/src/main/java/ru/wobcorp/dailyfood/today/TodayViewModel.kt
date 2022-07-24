package ru.wobcorp.dailyfood.today

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.wobcorp.dailyfood.domain.ProductsRepository

class TodayViewModel(
    private val productsRepository: ProductsRepository,
) {

    private val foo = 1

    companion object {
        fun provideFactory(
            postsRepository: ProductsRepository,
        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return TodayViewModel(postsRepository) as T
            }
        }
    }
}