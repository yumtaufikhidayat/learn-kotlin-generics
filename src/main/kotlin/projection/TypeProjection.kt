package main.kotlin.projection

fun main() {
    typeProjection()
}

fun typeProjection() {
    val data1 = Container("Data 1")
    val data2: Container<Any> = Container("Data 2")
    println(copy(data1, data2))
}

fun copy(from: Container<out Any>, to: Container<Any>) {
    to.data = from.data
}

class Container<T>(var data: T)