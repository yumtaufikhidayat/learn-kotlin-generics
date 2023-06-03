package main.kotlin.generic

fun main() {
    genericExtensionFunction()
}

fun genericExtensionFunction() {
    val data1: Data<Int> = Data(1)
    val data2: Data<String> = Data("Taufik")
    data1.data
    data2.print()
}

fun Data<String>.print() {
    val string = this.data
    println("String value is $string")
}

class Data<T>(val data: T)