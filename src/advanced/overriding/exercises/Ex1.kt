package advanced.overriding.exercises

/*
Create a super-class called Employee and two sub-classes called Programmer
and Economist. Create a common method that returns a value in the
super-class and override it in both sub-classes. Provide a different
implementation for each one of them, by calling super class method.
● Call the methods from the super-class, as well from the sub-classes.
● Override toString() method in both sub-classes and provide a proper
implementation.
● Create an array of Employee objects and print some details.
* */

fun main() {
    val employee = Employee()
//    println(employee)

    val programmer = Programmer()
//    println(programmer)

    val economist = Economist()
//    println(economist)

    val programmer1: Employee = Programmer()
//    println(programmer1)

    val employees: Array<Employee> = arrayOf(employee, programmer, economist, programmer1)

    employees.forEach {
        println(it)
    }
}

open class Employee {
    open fun getSalary() = 1500

    override fun toString() = "Basic salary -> ${this.getSalary()}"

}

class Programmer : Employee() {
    override fun getSalary() = super.getSalary().plus(5000)

    override fun toString() = "Programmer salary -> ${this.getSalary()}"
}

class Economist : Employee() {
    override fun getSalary() = super.getSalary().plus(2000)

    override fun toString() = "Economist salary -> ${this.getSalary()}"
}