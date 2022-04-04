package fundamentals.dataTypes

fun main() {
    val obj = Any()
    if(obj is String) {
        print("is a String")
    }

    if(obj !is String) { //same as we neage the entire statement !(obj is String
        print("is not a String")
    }
}