package main.kotlin.variant

fun main() {
    val data1: Covariant<String> = Covariant("Taufik")
    val data2: Covariant<Any> = data1
    println(data2.data)
}

class Covariant<out T>(val data: T) {
    fun data(): T {
        return data
    }
}