package fundamentals.dataTypes

fun main() {
    val kotlin = "Kotlin"
    println(kotlin)

    for (c in kotlin) {
        print(c)
    }

    println(kotlin.get(2))
    println(kotlin.length)
    println(kotlin.uppercase()) //creates a new String object

    //Concatenations
    val language = "language"
    println(kotlin + " " + language) //java style
    println("$kotlin $language") //kotlin style

    val str = "abc" + 1
    println(str + "def")

    //Escaped strings
    println("FirstLine\nSecondLine")


    //Raw strings
    val lines = """
        First Line
            Second Line
                Third Line
    """

    println(lines)
    println(lines.trimIndent())

    //Template expressions
    println("kotlin.length: ${kotlin.length}")
    println("kotlin.reversed(): ${kotlin.reversed()}")

    val price = """
        ${'$'}9.99
    """
    println(price)

    val newPrice = """
        ${'$'}11.99
            ${'$'}11.99
    """.trimIndent()

    println(newPrice)

    //The default character to trim is |
    val lastPrice = """
        #${'$'}11.99
            ${'$'}11.99
    """.trimMargin("#")

    println(lastPrice)
}