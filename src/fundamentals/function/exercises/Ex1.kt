package fundamentals.function.exercises

import kotlin.random.Random

/*
How to create a function that returns a StringBuilder object that contains a
random character from the alphabet (a - z)? How to simplify it into a
single-expression function?
*/

fun main() {
    val randomChar = randomChar()
//    println(randomChar)

//    println(randomCh())
    println(randomChar2())
}

fun randomChar(): StringBuilder {
    val randomNumber = Random.nextInt(97, 122)
    val sb = StringBuilder()
    sb.append(randomNumber.toChar())

    return sb
}

//fun randomCh() = StringBuilder().append(Random.nextInt(97, 122).toChar())

fun randomCh() = StringBuilder(Random.nextInt(97, 122).toChar().toString())

fun randomCharStr() = StringBuilder(('a'..'z').random().toString())

fun randomChar2() = StringBuilder((97..122).random().toChar().toString())