package fundamentals.classes

fun main() {
//    Song("Hey Jude")
//    Song("Hey Jude", 1968)
//    Band("The Beatles", 1960)
    Album()

}

class Song(name: String) {
    init {
        println(name.uppercase())
    }
    constructor(name: String, year: Int): this(name) {
        println(name.uppercase() + " -> " + year)
    }
}

class Band {
    init {
        println("Init block of Band clas called")
    }

    constructor(name: String, year: Int) {
        println("$name are formed in $year")
    }
}

class Album {
    init {
        println("Init block of Album clas called")
    }
}