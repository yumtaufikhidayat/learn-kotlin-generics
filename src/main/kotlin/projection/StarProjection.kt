package main.kotlin.projection

fun main() {
    starProjection()
}

fun starProjection() {
    val arrayInt = arrayOf(1, 2, 3, 4, 5, 6)
    val arrayStr = arrayOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    displayLength(arrayInt)
    displayLength(arrayStr)
}

fun displayLength(array: Array<*>) {
    println("Length of array is ${array.size}")
}