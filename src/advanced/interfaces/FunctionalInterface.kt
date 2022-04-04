package advanced.interfaces

fun main() {
    //Anonymous class
    val isEven = object : IntPredicate {
        override fun accept(i: Int): Boolean = i % 2 == 0
    }
    println(isEven.accept(5))

    //
    val isOdd = IntPredicate {
        it % 2 != 0
    }
    println(isOdd.accept(5))

}

//Functional interface
fun interface Readable {
    fun read()
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}