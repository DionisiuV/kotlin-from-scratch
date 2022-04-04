package fundamentals.dataTypes

fun main() {
    val obj = Any()
//    val s = obj as String //ClassCastException. Why? Because and Object is NOT a String. However, a String is an Object

    val s = obj.toString()
    println(s) //it will print hashcode

    if(s is String) {
        print("is a String")
    }

    if(s !is String) {
        print("is not a String")
    }

    printMessage("Hello, World!")
}

fun printMessage(message: Any) {
    if(message is String) { //smart cast
        println(message)
    }

}
