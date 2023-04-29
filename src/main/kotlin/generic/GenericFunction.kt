package main.kotlin.generic

fun main() {
    genericFunctions()
}

fun genericFunctions() {
    val function = Function("Taufik")
    function.sayHello<String>("Zharfan")
    function.sayHello("Wafiq")

    function.sayHello<Int>(10)
    function.sayHello(10)
}

class Function(private val name: String) {
    fun <T> sayHello(param: T) {
        println("Hello $param, my name is $name")
    }
}