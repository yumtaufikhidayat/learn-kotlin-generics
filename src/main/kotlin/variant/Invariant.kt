package main.kotlin.variant

fun main() {
    invariant()
}

fun invariant() {
    val data1: Invariant<String> = Invariant("Taufik")
    // val data2: Invariant<Any> = data1 // error
}

class Invariant<T>(data: T)
