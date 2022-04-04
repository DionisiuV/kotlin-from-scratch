package fundamentals.dataTypes

fun main() {
    val b: Byte = 1
//    val i: Int = b //Error
    val i = b.toInt()
//    println(i)

    //Arithmetical operations
    val l = 5_000_000_000_000 + 5 //long + int = long

    val c = 'c' + 2
    println(c)
}