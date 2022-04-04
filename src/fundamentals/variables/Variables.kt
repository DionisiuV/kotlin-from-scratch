package fundamentals.variables

fun main() {
    //Local variables
    val a: Int = 1 //immediate assignment
    //a = 2 //We cannot reassign a new value
    val b = 2 //Int type is iferred as it is seen that 2 is a number

    var x = 3
    println(x)
    x = 5
    println(x)
}

class Variables {
   //Global variables
    val name: String = "Alex"
    val age: Int = 33
}