package fundamentals.accessModifiers

fun main() {

}

class Connection private constructor() {
    fun getInstance() = Connection()
}