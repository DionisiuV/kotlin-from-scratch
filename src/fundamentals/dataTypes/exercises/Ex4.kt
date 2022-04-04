package fundamentals.dataTypes.exercises

/*Assuming we have three variables, two Strings and a Number, how to make a
concatenation in Kotlin? How to print the length of both String variables?*/

fun main() {
    val firstString = "Valentin"
    val secondString = "Dionisiu"
    val age = 24
    println(firstString + " "  +secondString + " " +age)

    val template = """
        $firstString $secondString are $age ani
    """.trimIndent()

    println(template)
}