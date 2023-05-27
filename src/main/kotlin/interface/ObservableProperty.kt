package main.kotlin.`interface`

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

fun main() {
    observableProperty()
}

fun observableProperty() {
    val car = Car("Audi")
    car.brand = "Volkswagen (VW)"
    println(car.brand)
}

class Car(brand: String) {
    var brand: String by LogObservableProperty(brand)
}

class LogObservableProperty<T>(data: T): ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change value from $oldValue to $newValue")
    }
}