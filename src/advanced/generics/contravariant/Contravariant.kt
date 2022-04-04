package advanced.generics.contravariant

fun main() {
    //With the in operator, the subtypes is reversed
//    useTextView(Case<EditText>())
    useTextView(Case<View>()) //Case-View is a subtype Case<TextView> because the TextView extends View
}

open class View
open class TextView : View()
class EditText : TextView()

class Case<in T> {
    private val contents = mutableListOf<T>()
    //Returns T, but cannot take T as argument
//    fun produce(): T = contents.last() // Producer - not possible
    //Takes T as an argument, but it cannot return T
    fun consume(item: T) = contents.add(item) // OK - Consumer
}

fun useTextView(case: Case<TextView>) {
    //Consume TextView and it's subtype
    val textView = case.consume(EditText())
}