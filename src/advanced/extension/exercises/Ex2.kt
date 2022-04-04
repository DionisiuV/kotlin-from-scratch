package advanced.extension.exercises

/*
Create a Currency class with a dollar field. Create an extension property called
euro and calculate the corresponding value.
*/

fun main() {
    val currency = Currency()

    currency.dollar = 5.0

    println(currency.euro)
}

class Currency {
    var dollar: Double = 0.0
}

var Currency.euro: Double
        get() = this.dollar * 0.9
        set(value) {
            println(value)
            this.dollar = value
        }
