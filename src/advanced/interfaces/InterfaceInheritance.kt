package advanced.interfaces

fun main() {

}

interface Named {
    val fullNamne: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val fullNamne: String get() = "$firstName $lastName"
}

data class Employee(
        override val firstName: String,
        override val lastName: String
) : Person