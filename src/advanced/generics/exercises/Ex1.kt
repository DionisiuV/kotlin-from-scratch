package advanced.generics.exercises

/*
Create a Car class that implements Comparable<Car>, with two fields, brand
and maxSpeed. Create the constructor.
● What is mandatory to be done now?
● What should we return?
● Create two car objects with the brand and the maxSpeed of your
choice.
● How to compare the two Car objects? How can the Car class be
named?
● Save the result of compareTo() into a result variable. What is the type
of result? Print the result. How about an if statement to see which car
is faster?
*/

fun main() {
    val car1 = Car(250, "Audi")
    val car2 = Car(300, "Bmw")

    if(car1.compareTo(car2) > 0) {
        println("${car1} faster")
        return
    }

    println("${car2} faster")
    return
}

class Car(val maxSpeed: Int,
          val brand: String
) : Comparable<Car> {
    override fun compareTo(other: Car) : Int = this.maxSpeed - other.maxSpeed

    override fun toString() = this.brand


}