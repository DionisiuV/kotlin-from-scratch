package fundamentals.classes

fun main() {
    val animal = Animal("Pluto")
    println(animal.name)
    val car = Car("Porche")

    val product = Product("2d", "Laptop")
    println("${product.id}: ${product.name}")

    val user1 = User(
            name = "Dionisiu",
            age = 24
    )

    println(user1.allData)

}

class Animal {
    var name: String? = null

    //can be converted into a primary constructor
    constructor(name: String) {
        this.name = name
    }
}

//if the primary constructor doesen t have a visibility modifiers
/*
class Car constructor(var brand: String) {
//    var brand: String? = brand

}*/

class Car(var brand: String)

class Bus

class Product {
    var id: String? = null
    var name: String? = null

    constructor(id: String) {
        this.id = id
    }

    constructor(id: String, name: String) {
        this.id = id
        this.name = name
    }
}

//If we need only one Constructor to init all variables and also have the body of the class
class User (var name: String, var age: Int) {
    val allData = "${this.name}/${this.age}"
}

