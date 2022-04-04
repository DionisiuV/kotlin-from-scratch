package fundamentals.accessModifiers

import fundamentals.classes.Inner
import fundamentals.classes.OuterClass

fun main() {
//
}

open class SuperClass {
    private val a = 1 //only in this class
    protected open val b = 2 //only in this class and subclass
    internal open val c = 3 //anyone who sees the declaring class
    open val d = 4 //default public

    protected class InnerClass {
        val e: Int = 5 //public by default
    }
}

class SubClass : SuperClass() {
    fun printValues() {
//        println(a) //private
        println(b) //protected
        println(c) //internal
        println(d) //public
        println(InnerClass().e) //public
    }
//    override val a = 6 //cannot override a private field
    override val b = 4
    override val c = 4
    override val d = 4
}