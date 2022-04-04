package fundamentals.variables

//created only as global variable
const val PI = 3.14

fun main() {
    println(PI)
    println(Math.PI)
}

//Almost the same as static in Java
class Math {
    companion object {
        //or inside a companion object
        const val PI = 3.14
    }
}

