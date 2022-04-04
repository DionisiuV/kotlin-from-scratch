package advanced.overriding

fun main() {
    val animal = Animal()
    animal.eat()

    val dog = Dog()
    dog.eat()

    val a: Animal = Dog()
    a.eat()


}

open class Animal {
    open fun eat() {
        println("Eating..")
    }
}

class Dog : Animal() {
    override fun eat() {
        println("Eating bones..")
    }
}