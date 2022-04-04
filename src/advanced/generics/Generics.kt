package advanced.generics

fun main() {
    val employee: Employee<Int> = Employee(1)
    val e = Employee(2)
    println(employee.value)
    println(e.value)

    val movies: List<String> = listOf(
            "Star Wars",
            "Titanic"
    )

//    movies.add("Test") // <- consumer
    println(movies[0])

    val newMovies: MutableList<String> = mutableListOf(
            "Star Wars",
            "Titanic"
    )

    println(newMovies[0])
    newMovies.add("Gladius")

    println(newMovies)
}

class Employee<T>(t: T) {
    var value = t
}