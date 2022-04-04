package advanced.nestedInner

fun main() {
    val inner = OuterClass.Inner()
    println(inner.printInner())
}

class OuterClass {
    fun printOuter() = println("Outer class")

    class Inner {
        fun printInner() = println("Inner...")
    }
}

class OuterClasss {
    class InnerClass

    interface InnerInterface
}

interface OuterInterface {
    class InnerClass

    interface InnerInterface
}