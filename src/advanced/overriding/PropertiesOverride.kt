package advanced.overriding

fun main() {
    val person = Person()
    print(person.name)

    val student = Student()
    println(student.name)

    val p: Person = Student()
    println(p.name)
}

open class Person(open val name: String = "PersonName")

class Student : Person() {
    override val name: String = "StudentName"
}

interface Planet {
    val name: String
}

class Mars(override val name: String = "Mars") : Planet

class Saturn(override var name: String = "Saturn") : Planet