package fundamentals.dataTypes

fun main() {
    val five = 5 //by default it's an Int
//    println(five)

    //if we need a byte, we need to specity that type
    val seven: Byte = 7

    //if we need a long value, we have three solutions
    val fiveBillion = 5_000_000_000_000 //init with a long value and the conversion is done automatically
    val oneLong = 1L
    val twoLong: Long = 2

    val twoFifty = 2.50 //by default its a double
    //val one: Double = 1 //Error

    val randomFloat = 2.71717171715365 //2.7171717
    //println(randomFloat)

    val d = 1.0
    printDouble(d) //Works fine
    val i = 1
//    printDouble(i) //Type mismatch
    val f = 1F
//    printDouble(f) //Type mismatch
}

fun printDouble(d: Double) = print(d)