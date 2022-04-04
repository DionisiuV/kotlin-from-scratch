package fundamentals.variables.exercises

/*
How to declare a lateinit variable? In how many places can be the declaration
added? How to initialize each variable? How to check if it initialized or not?
*/

lateinit var globalStudent: Student

fun main() {
    globalStudent = Student()
    if(::globalStudent.isInitialized) {

    }

    val student: Student = Student()
    student.setName()

    if(student.isNameInit) {
        println(student.name)
    }

    lateinit var student1: Student
    student1 = Student()
//    if(::student1.isInitialized) {
//
//    }

}

class Student {
    lateinit var name: String

    fun setName() {
        name = "Dorel"
    }

    val isNameInit get() = ::name.isInitialized
}
