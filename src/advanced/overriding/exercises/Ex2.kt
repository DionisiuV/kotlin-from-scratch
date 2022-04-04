package advanced.overriding.exercises

/*
Create a super-class called Vehicle with a single field called color. Add the
corresponding constructor.
● Create a class called Car that extends Vehicle. Add a single field called
brandName. What is mandatory to be done?
● Create the toString() method inside the super-class and provide a
proper implementation.
● How to print the value of brandName together with the value of color?
*/

fun main() {
    val car: Vehicle = Car("Ferrari", "Green")

    println(car)
}

open class Vehicle(open val color: String = "Red") {
    override fun toString() = "Vehicle color $color"
}

class Car(val brandName: String, override val color: String): Vehicle(color) {
    override fun toString() = "Car brand: $brandName color ${super.color}"
}