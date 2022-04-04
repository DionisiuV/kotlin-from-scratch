package fundamentals.variables.exercises

/*
How to create a constant variable in Kotlin? In how many places can be the
declaration added? How to print it into the console?
*/

const val X: Int = 5

fun main() {
    println(Ex2.X)
    println(X)
}

class Ex2 {
    companion object {
        const val X = 2
    }
}