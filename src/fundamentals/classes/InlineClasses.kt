package fundamentals.classes

fun main() {
    val auth = Auth("Google")
    println(auth)

    val search = Search("programming")
    println(search.length)
    search.printLength()

    val textView = TextView("Hello")
    textView.display()
}

@JvmInline
value class Auth(private val type: String)

@JvmInline
value class Search(private val term: String) {
    val length: Int get() = term.length

    fun printLength() {
        println(length)
    }

}

@JvmInline
value class TextView(private val text: String) : View {
    override fun display() = println(text)
}

interface View {
    fun display()
}