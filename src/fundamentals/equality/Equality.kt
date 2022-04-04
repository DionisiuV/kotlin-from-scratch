package fundamentals.equality

fun main() {
    val a = 3
    val b = 3
//    println(a == b)

    val x = "Ion"
    val y = "Ion"

//    println(x == y) //true
//    println(x.equals(y)) //true

    //compile error, String class in Kotlin doesn't take a String argument
//    String("John")

    val student = Student("Rafa")
    val newStudent = Student("Rafa")

//    println(student == newStudent) //false
//    println(student === newStudent) //false
//    println(student.equals(newStudent)) //false

    val lastStudent = student
    println(student === lastStudent) //true
}

class Student(name: String)