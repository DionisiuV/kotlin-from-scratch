package advanced.genericObjects

fun main() {
    println(fullName)
}

//Anonymous object
val fullName = object {
    val firstName = "John"
    val lastName = "Smith"

    override fun toString() = "$firstName $lastName"
}