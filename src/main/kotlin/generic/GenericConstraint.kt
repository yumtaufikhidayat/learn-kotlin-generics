package main.kotlin.generic

fun main() {
    // val data1 = Company(Manager()) // error mismatch. Found Manager required CanSayHello
    val data2 = Company(VicePresident())
    data2.employee.sayHello("Wafiq")
    //val data3 = Company("String") // error mismatch. Found String required CanSayHello and Employee
}

open class Employee

class Manager: Employee()

class VicePresident: Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Company<T>(val employee: T) where T: Employee, T: CanSayHello

interface CanSayHello {
    fun sayHello(name: String)
}