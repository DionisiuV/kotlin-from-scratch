package advanced.overriding

fun main() {
    Car().move()
}

open class Vehicle {
    open fun move() = println("Vehicle moving..")
    val color: String get() = "Red"
}

class Car : Vehicle() {
    override fun move() {

        //It's mandatory to be added iff we inherit a function with the same signature that exist in a class or an interface
        super<Vehicle>.move()
        println("$carColor Car moving...")
    }

    private val carColor: String get() = super.color
}