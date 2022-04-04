package fundamentals.reflection

val language: String = "Kotlin"
var company: String = "Oracle"

fun main() {
    //println(language) //print "Kotlin"
    //println(::language.get()) //print value of the language variable -> kotlin
    //println(::language.name) //print variable name
    //The expression ::language evaluates to a KProperty<T> type property object


    //if we declare var, we can change value via setter
    //println(::company.get())
    ::company.set("Test")
    //println(company)


    //To access a property of a class
    val person = Person::name
    //To access it we can use a getter
    println(person.get(Person("Gheorghe")))

    //We can also use the same principle for extension functions
    println(String::lastChar.get("abc"))

}

class Person(val name: String) //it can be also a data class

//Extension property
val String.lastChar: Char get() = this[length - 1] //same as String.get(index)