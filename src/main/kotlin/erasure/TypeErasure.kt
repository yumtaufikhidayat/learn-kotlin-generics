package main.kotlin.erasure

fun main() {
    typeErasure()
}

fun typeErasure() {
    val data = TypeErasure("Taufik")
    val name = data.getData()
    println(name)
}

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}