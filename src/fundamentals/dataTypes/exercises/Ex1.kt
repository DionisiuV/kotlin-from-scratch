package fundamentals.dataTypes.exercises
/*
Create an array of type String that contains three names of your choice.
a. What is the simplest way to print the first character of the first name?
b. How to calculate the total number of characters of all names?
*/

fun main() {
    val names = arrayOf("Test", "Test1")


    println(names[0][0])
    println(names[0].substring(0, 1))
    println(names.first().first())

    print(names[0].length + names[1].length)

    var sum = 0
    for(name in names) {
//        sum += name.length
    }

    println(sum)

//    names.forEach { name -> sum += name.length }
    names.forEach {
        name -> name.forEach {
        c -> sum++
        }
    }
    println(sum)

    print(names.joinToString("").length)
}