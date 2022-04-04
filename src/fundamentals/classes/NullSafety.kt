package fundamentals.classes

fun main() {
    val name: String? = null

    //? -> Safe call
    //Prints the length of name if the name is not null, else print null
    //We can use it when there is no problem to display null
//    println("length: ${name?.length}")

    //?.let -> Safe call
    //The block of code will be executed only if name is not null
    name?.let {
        println(it.length)
    } ?: println("Optional part")

    //Traditional way
    val len = if (name != null)
        name.length
    else
        -1

    println("len: $len")

    //Elvis operator -> ?:
    val length = name?.length ?: -1
    println(length)

    //Non-null assertions operator -> !!
    //We can use when we are absolutely sure that the name is not null, otherwise NullPointerException will be thrown
    println("length: ${name!!.length}")


}