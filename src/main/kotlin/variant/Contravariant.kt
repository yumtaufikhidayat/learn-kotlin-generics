package main.kotlin.variant

fun main() {
    contraVariant()
}

fun contraVariant() {
    val data1: Contravariant<Any> = Contravariant()
    val data2: Contravariant<String> = data1
    data2.sayHello("Taufik")
}

class Contravariant<in T> {
    fun sayHello(name: T) = println("Hello $name")
}