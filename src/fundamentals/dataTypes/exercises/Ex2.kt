package fundamentals.dataTypes.exercises

import java.text.DecimalFormat

/*
How to convert a String that contains a 4 decimal number into a Double with
only two? Find three solutions
*/

fun main() {
    val number = "3.1234"
    val d: Double = number.toDouble()

    val decF = DecimalFormat("#.##")
//    println(decF.format(d))

//    println("%.2f".format(d))

//    val i: Int = (d * 100).toInt()
//    val t: Double = 100.0
//    val dd: Double = i / t

//    println

    val i = (number.toDouble() * 100).toInt()

    println(i.toDouble()/100)


}