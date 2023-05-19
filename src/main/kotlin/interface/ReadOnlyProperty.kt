package main.kotlin.`interface`

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun main() {
    readOnlyProperty()
}

fun readOnlyProperty() {
    val personName = NameWithLog("Zharfan")
    println(personName.name)
}

class NameWithLog(param: String) {
    val name by LogReadOnlyProperty(param)
}

class LogReadOnlyProperty(val data: String): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.toUpperCase()
    }
}