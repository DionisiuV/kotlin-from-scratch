package advanced.abstractClasses

fun main() {
    val myAppAuth : GoogleAuth = MyApp()
    myAppAuth.signIn()
}

abstract class GoogleAuth {
    abstract fun signIn()
}

class MyApp : GoogleAuth() {
    override fun signIn() = println("MyApp Google SignIn")
}

open class Animal {
    open fun eat() = println("Eating..")
}

abstract class Dog : Animal() {
    abstract override fun eat()
}

abstract class GermanShepard : Dog() {
    override fun eat() = println("German shepard eating much bones")
}