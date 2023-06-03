package main.kotlin.generic

fun main() {
    genericExtensionFunction()
}

fun genericExtensionFunction() {
    val data1: Data<Int> = Data(1)
    val data2: Data<String> = Data("Taufik")
    val data3: Data<Int> = Data(0)
    data1.data
    data2.print()
    data3.printResult("sum", 1, 2)
    data3.printResult("divided", 1, 2)
    data3.printResult("times", 1, 2)
}

fun Data<String>.print() {
    val string = this.data
    println("String value is $string")
}

fun Data<Int>.printResult(type: String, valueA: Int, valueB: Int): Int {
    var printData = this.data
    when (type) {
        "sum" -> printData = valueA + valueB
        "divided" -> printData = valueA / valueB
        "times" -> printData = valueA * valueB
    }
    println(printData)
    return printData
}

class Data<T>(val data: T)