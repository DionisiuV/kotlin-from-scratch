package fundamentals.classes

fun main() {
    val john = Student("John", 30)
    println(john)

    var paul = Person("Paul")
    println(paul) //only the name prop will be inside toString()

    val olderJohn = john.copy(
            age = 31
    )

    println(olderJohn)

    val jane = Student("Jane", 25)
    val (name, age) = jane
    println("$name: $age")
}

data class Student(val name: String, var age: Int)

data class Person(val name: String) {
    var age: Int = 0 //Excluded from the generated implementations
}