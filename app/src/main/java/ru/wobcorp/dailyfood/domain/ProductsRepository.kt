package ru.wobcorp.dailyfood.domain

interface ProductsRepository {
    fun createProduct(product: Product)
    fun getProduct(name: String)
}