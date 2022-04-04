package fundamentals.dataTypes

fun main() {
    val emptyIntArray = IntArray(3) //It's a mandatory to set size to IntArray Constructor
//    printIntArray(emptyIntArray)
    emptyIntArray[0] = 55

//    println(emptyIntArray[0])

    val numbers = arrayOf<Int>(11,22,33)
//    println(numbers)
    numbers[2] = 44
//    printArrayOfInt(numbers)

    val names: Array<String?> = arrayOfNulls(3)
    names[1] = "Alex"
//    printArrayOfString(names)

    //We can also use an initializer as a second parameter
    val arrayOfThreeZeros = Array(3){2} //array of size 3 with default values of '2'
//    printArrayOfInt(arrayOfThreeZeros)

    val arrayOfIndexes = Array(5){it}
//    printArrayOfInt(arrayOfIndexes)

    //we can save a function in a variable
    val indexFun = fun(it: Int): Int {
        return it
    }

    //when we pass a function to constructor, it initializes at each position index as value
    val arrayOfIndexes2 = Array(5, indexFun)
//    printArrayOfInt(arrayOfIndexes2)

    val biArray = Array(2){Array(4){it * 2} }
    val biArray2 = arrayOf(
            arrayOf(11, 22, 33),
            arrayOf(11, 23),
            arrayOf(1)
    )
    printBiArray(biArray)

    println(biArray2 !is Array)
}

fun printIntArray(arr: IntArray) = arr.forEach { print(it) }

fun printArrayOfInt(arr: Array<Int>) = arr.forEach { print(it) }

fun printArrayOfString(arr: Array<String?>) = arr.forEach { print(it) }

fun printBiArray(biArray: Array<Array<Int>>) {
    biArray.forEach { intArray ->
        intArray.forEach { int ->
            print("$int ")
        }
        println()
    }
}