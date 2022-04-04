package advanced.generics.invariant

fun main() {
    //Invariant produces and consumes, deny subtyping
//    useTextView(Case<EditText>())
    useTextView(Case<TextView>())
//    useTextView(Case<View>())

}

open class View
open class TextView : View()
class EditText : TextView()

class Case<T> {
    private val contents = mutableListOf<T>()
    fun produce(): T = contents.last() // OK - Producer
    fun consume(item: T) = contents.add(item) // OK - Consumer
}

fun useTextView(case: Case<TextView>) {
    //Consume TextView and it's subtype
    val textViewConsume = case.consume(EditText())
    //Produce TextView and it's subtype
    val textViewProduce = case.produce()
}