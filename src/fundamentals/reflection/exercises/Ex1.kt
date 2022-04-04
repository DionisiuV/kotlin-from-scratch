package fundamentals.reflection.exercises

/*
Create a function that takes as an argument a function, which takes a String as
an argument and returns the same String but reversed. Print the reversed
String. Use reflexions. Find one solution that does the job.
*/

fun main() {
    val randomString: String = "Java"

    stringPrint(::reverseString, "test")
    stringPrint(::upperString, "test")
}

fun stringPrint(reverse: (str: String) -> String, string: String) = println(reverse(string))

fun reverseString(str: String): String = str.reversed()
fun upperString(str: String): String = str.uppercase()