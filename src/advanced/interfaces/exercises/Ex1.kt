package advanced.interfaces.exercises

/*
Create an interface class Crypto with a method that returns the current value.
Create two classes that inherit from this class.
● What is mandatory to be done?
● How to call the classes that have implemented the methods and how
print the actual values?
● How to print the actual values using the toString() method?
*/

fun main() {
    val movie: Crypto = Movie()
    val eth: Crypto = Eth()
    println(movie)
    println(eth)
}

interface Crypto {
    fun getCurrentValue(): Double
    override fun toString(): String
}

class Movie : Crypto {
    override fun getCurrentValue() = 50.0

    override fun toString(): String = "Movie value: ${getCurrentValue()}"
}

class Eth : Crypto {
    override fun getCurrentValue() = 5000.0

    override fun toString(): String = "Eth value: ${getCurrentValue()}"
}