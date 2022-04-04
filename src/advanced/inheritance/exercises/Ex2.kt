package advanced.inheritance.exercises

/*Create an abstract class Shape containing the no-argument constructor and an
abstract method to calculate the area. Create a Circle class that inherits from
this class. Add a radius field in the child class and create the corresponding
constructor.
● What is mandatory to be done?
● What implementation do we have to provide?
● How to call the implemented method?
● How to call Shape class constructor?
*/

fun main() {
    val circle: Shape = Circle(6)
    println("Circle radius: ${circle.calculateArea()}")
}

abstract class Shape {
    constructor() {
        println("Shape constructor")
    }
    abstract fun calculateArea(): Double
}

class Circle(val radius: Int) : Shape() {
    override fun calculateArea() = kotlin.math.PI * radius * radius
}