package advanced.extension

fun main() {
    val names = listOf(
            "Rafael",
            "Alex",
            "Valentin",
            "Gabriel",
            "Razvan"
    )
    println(names.lastIndex)

    val time = Time()
    time.minutes = 3 //Is done using setter

    println(time.seconds)
}

val <T> List<T>.lastIndex: Int get() = this.size - 1

var Time.seconds: Int
    get() = this.minutes * 60
    set(value) {
        this.seconds = value
    }

class Time {
    var minutes: Int = 0
//    var seconds: Int = 0
}
