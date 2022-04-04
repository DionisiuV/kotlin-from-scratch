package advanced.nestedInner

fun main() {
    val inner = Outer().Inner()
    inner.printInner()
}

class Outer {
    private val inner = "Inner"

    inner class Inner {
        fun printInner() = println(inner)
    }
}