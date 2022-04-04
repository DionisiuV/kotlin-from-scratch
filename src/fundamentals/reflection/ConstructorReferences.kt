package fundamentals.reflection


fun main() {
    //Using :: operator we can call the no-argument constructor of the ToolBar class
    display(::ToolBar)

}

class Car(val brand: String)

class ToolBar

fun display(create: () -> ToolBar) {
    val toolBar: ToolBar = create()
//    val toolBar: ToolBar = create.invoke()

}