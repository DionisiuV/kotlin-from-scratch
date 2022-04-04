package fundamentals.dataTypes.exercises

/*How to create an array of five consecutive square numbers starting from zero,
using a function? How about the simplified version?*/

fun main() {
    val square = fun(it: Int): Int {
        return it * it
    }

    val arrayOfSquares = IntArray(5, Math.square)
    val arrayOfSquares2 = IntArray(5){square2(it)}
    val arrayOfSquares3 = IntArray(5){it * it}

    arrayOfSquares.forEach { print("$it ") }
    arrayOfSquares2.forEach { print("$it ") }
}

fun square2(a: Int): Int = a * a

class Math {
    companion object {
        val square = fun(it: Int): Int {
            return it * it
        }
    }
}