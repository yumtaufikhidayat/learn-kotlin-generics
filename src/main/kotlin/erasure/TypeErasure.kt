package main.kotlin.erasure

fun main() {
    typeErasure()
}

fun typeErasure() {
    val data = TypeErasure("Taufik")
    val name = data.getData()
    println(name)

    val taufik = data as TypeErasure<Int>
    val number = data.getData() // runtime error: ClassCastException
}

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}