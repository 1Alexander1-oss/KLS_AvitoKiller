package com.ephemerayne.kls_avitokiller.model

interface Product {
    val name: String
    val price: Double
    val address: String
    val description: String
}

class Food(
    override val address: String,
    override val name: String,
    override val price: Double,
    override val description: String,
) : Product

class Animal(
    override val name: String,
    override val price: Double,
    override val address: String,
    override val description: String,
) : Product