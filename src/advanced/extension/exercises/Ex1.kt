package advanced.extension.exercises

/*
Create an extension function for the String class that can remove the first and
the last character of a String.
*/

fun main() {
    val exString = "John"
    println(exString.removeFirstAndLastChar())
}

fun String.removeFirstAndLastChar(): String = this.substring(1, this.length -1)