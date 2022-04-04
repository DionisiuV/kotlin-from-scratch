package advanced.generics.function

fun main() {
    val movies: MutableList<String> = mutableListOf(
            "Star Wars",
            "Titanic"
    )

    val lastMovie = getLastMovie(movies)
    println(lastMovie)
    println(lastMovie.toHashCodeToHex(lastMovie))
}

fun <E> getLastMovie(movies: MutableList<E>): E = movies.last()

//generics + extension function
//fun <E> E.toHashCodeToHex(item: E) : String = Integer.toHexString(item.hashCode())
fun <E> E.toHashCodeToHex(e: E) : String = "%x".format(e.hashCode())

