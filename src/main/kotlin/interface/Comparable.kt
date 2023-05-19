package main.kotlin.`interface`

fun main() {
    comparable()
}

fun comparable() {
    val fruit1 = Fruit("Mangga", 10)
    val fruit2 = Fruit("Apel", 100)
    println(fruit1 > fruit2)
    println(fruit1 < fruit2)

    println(fruit1.quantity > fruit2.quantity) // other method
    println(fruit1.quantity < fruit2.quantity) // other method
}

class Fruit(val name: String, val quantity: Int): Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int = quantity.compareTo(other.quantity)
}