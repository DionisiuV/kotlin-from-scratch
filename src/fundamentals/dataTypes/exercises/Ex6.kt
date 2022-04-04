package fundamentals.dataTypes.exercises

/*How to create a two-dimensional array with the following values using a
function:*/

fun main() {
    var counter = 0
    val arr: Array<Array<Int>> = Array(3){Array(3){counter++ * 10} }

    printBiArray(arr)

}

fun printBiArray(arr: Array<Array<Int>>) {
    arr.forEach {  ar ->
        ar.forEach { number ->
            print("$number ")
        }
        println()
    }
}