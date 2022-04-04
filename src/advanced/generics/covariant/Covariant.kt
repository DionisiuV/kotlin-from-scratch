package advanced.generics.covariant

fun main() {
    useTextView(Case<EditText>()) //Case<EditText> is a subtype of Case<TextView>because EditText extends TextView
    useTextView(Case<TextView>())
//    useTextView(Case<View>()) //not compile
}

open class View
open class TextView : View()
class EditText : TextView()

class Case<out T> {
    private val contents = mutableListOf<T>()
    //Returns T, but cannot take T as argument
    fun produce(): T = contents.last() // Producer - ok !!!
//    fun consumer(item: T) = contents.add(item) // not possible - Consumer
}

fun useTextView(case: Case<TextView>) {
    //Produces TextView and it's subtype
    val textView = case.produce()
}