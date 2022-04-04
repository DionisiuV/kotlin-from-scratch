package advanced.genericObjects.exercises

/*
Create a Writable interface with a single abstract function called write().
Create an object of the interface type using an anonymous class. How about a
Java interface?
*/

fun main() {
    val writable = Writable { println("Writing...") }

    val writablee = Writablee { println("Writing from java interface") }
}

fun interface Writable {
    fun write()
}