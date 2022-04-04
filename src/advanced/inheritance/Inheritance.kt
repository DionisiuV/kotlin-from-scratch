package advanced.inheritance

fun main() {

}

//need to mark superclass as open <- keyword
open class SuperClass(arg: String)

class SubClass(arg: String) : SuperClass(arg)

open class View {
    constructor(context: Context)

    constructor(context: Context, bundle: Bundle)
}

//note that in this case, diff constructors call diff constructors of the base class
class TextView : View {
    constructor(context: Context) : super(context)

    constructor(context: Context, bundle: Bundle) : super(context, bundle)
}

class Context

class Bundle