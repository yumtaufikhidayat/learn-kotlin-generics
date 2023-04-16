package main.kotlin.generic

fun main() {
    val data1: MyData<String> = MyData<String>("Taufik")
    data1.printData()

    val data2: MyData<String> = MyData("Taufik")
    data2.printData()

    val data3 = MyData("Taufik")
    data3.printData()
    data3.getData()

    val data4 = MyDataMultipleParameterType("Taufik", 25)
    data4.printData()

    val data5 = MyDataMultipleParameterType(26, "Wafiq")
    data5.printData()
    data5.getSecond()
}

class MyData<T>(private val firstData: T) {
    fun printData() {
        return println("Data is $firstData")
    }

    fun getData(): T {
        return firstData
    }
}

class MyDataMultipleParameterType<T, U>(
        private val firstData: T,
        private val secondData: U
) {
    fun printData() {
        return println("Data is $firstData and $secondData")
    }

    fun getData(): T {
        return firstData
    }

    fun getSecond(): U {
        return secondData
    }
}

