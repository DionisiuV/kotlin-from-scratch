//default one
fun main() {
    print("Hello World") //it's calling System.out.println()
}

fun main(message: String) {
    println(message)
}

//became default one
fun main(args: Array<String>) {
    println("%s: %f".format("message", 0.5))
}