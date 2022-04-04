package advanced.extension

fun main() {
    val names = mutableListOf(
            "Rafael",
            "Alex",
            "Valentin",
            "Gabriel",
            "Razvan"
    )

    println(names)
    names.swapElements(1, 3)
    println(names)

    val operation = Operation()
    operation.doIt()
    operation.makeIt()
    operation.doIt("Test")

}

fun MutableList<String>.swapElements(source: Int, destination: Int) {
    val temp = this[source]
    this[source] = this[destination]
    this[destination] = temp
}

//We need to declare generic type parameter before the function name, to make it available in the receiver type expression
fun <T>MutableList<T>.genericSwap(source: Int, destination: Int) {
    val temp = this[source]
    this[source] = this[destination]
    this[destination] = temp
}

class Operation {
    fun doIt() = println("Doing it...")
}

fun Operation.makeIt() = println("Make it...")

fun Operation.doIt() = println("Doing it2...")

//Method overloaded
fun Operation.doIt(arg: String) = println("Doing it $arg...")