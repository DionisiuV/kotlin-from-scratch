package fundamentals.function.exercises

/*
Create a function that takes as an argument a function, that has no arguments
and returns Unit. How to invoke the function? Find two solutions
*/

fun main() {
    doSomething(fun() {
        println("doSomething()")
    })

    doSomething {
        println("doSomething() 2")
    }

    doSomething {
//        printSomething()
        println("doSomething()")
    }

    doSomething(::printSomething)


}

fun doSomething(x: () -> Unit) = x() //x.invoke()

fun printSomething() = println("doSomething() 3")