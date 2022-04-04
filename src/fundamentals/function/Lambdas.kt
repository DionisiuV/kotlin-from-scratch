package fundamentals.function

fun main() {
    startApp(fun() {
        println("Hello, World")
    })

    //Lambda expression
    startApp{
        println("Hello, World")
    }
    startApp {
        display()
    }
    //Lambda expression
    startApp(::display)
}

fun startApp(function: () -> Unit) {
//    function()
    function.invoke()
}

fun display(): Unit {
    print("Hey, World!")
}