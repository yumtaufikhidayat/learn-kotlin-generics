package main.kotlin.generic

fun main() {
    val data1 = Company(Manager())
    val data2 = Company(VicePresident())
}

open class Employee

class Manager: Employee()

class VicePresident: Employee()

class Company<T: Employee>(val employee: T)