package fundamentals.reflection

fun main() {
    val widget = Widget::class
    println(widget.constructors)

    //To understand better
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.filter { i -> isOdd(i) })
    println(numbers.filter { isOdd(it) })
    //::isOdd is a value of function of type (Int) -> Boolean. As it takes an argument of type int and returns a Boolean
    println(numbers.filter(::isOdd))
//    println(numbers.forEach(::isOdd)) //nope

    val predicate: (Int) -> Boolean = ::isOdd

    val predicate2: (Int) -> Boolean = { isOdd(it) }

    val names = listOf("John", "Paul")
    println(names.map{it.length})
    println(names.map(String::length))
}

abstract class Widget

fun isOdd(x: Int) = x % 2 != 0