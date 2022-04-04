package advanced.inheritance.exercises

/*
Create an abstract class Crypto with an abstract method that returns the
current value. Create two classes that inherit from this class.
● What is mandatory to be done?
● How to call child class methods and print the actual values?
● How to print the actual values using the toString() method?
*/

fun main() {
    val btc: Crypto = Bitcoin()
    println(btc)

    val egld: Crypto = Egld()
    println(egld)
}

abstract class Crypto {
    abstract fun getCurrentValue(): Double

    abstract override fun toString(): String
}

class Bitcoin : Crypto() {
    override fun getCurrentValue() = 45000.0

    override fun toString()= "Bitcoin value $${getCurrentValue()}"
}

class Egld : Crypto() {
    override fun getCurrentValue() = 150.0

    override fun toString()= "Egld value $${getCurrentValue()}"

}