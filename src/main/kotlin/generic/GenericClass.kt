package main.kotlin.generic

fun main() {
    notGenericFunction()
    genericFunction()
}

fun notGenericFunction() {
    val dataString = DataX("Taufik")
    val valueString = dataString.data as String
    println(valueString)

    val dataInt = DataX(10)
    val valueInt = dataInt.data as Int
    println(valueInt)
}

fun genericFunction() {
    val dataString = DataY<String>("Taufik")
    val valueString = dataString.data
    println(valueString)

    val dataInt = DataY<Int>(10)
    val valueInt = dataInt.data
    println(valueInt)
}

class DataX(val data: Any)
class DataY<T>(val data: T)