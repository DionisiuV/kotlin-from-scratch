package fundamentals.classes

typealias LaptopList = MutableList<Laptop>

typealias  Inner = OuterClass.InnerClass

typealias  LaptopMap = Map<String, LaptopList>

typealias LaptopClickListener = (Laptop) -> Unit

fun main() {
    val laptopList: LaptopList = getLaptopList()
    printLaptopBrands(laptopList)
}

data class Laptop(var brand: String)

fun getLaptopList(): LaptopList {
    return mutableListOf(
            Laptop("Dell"),
            Laptop("Toshiba"),
            Laptop("IBM"),
    )
}

fun printLaptopBrands(laptopList: LaptopList) {
    laptopList.forEach {
        println(it)
    }
}

class OuterClass {
    inner class InnerClass{
        //
    }
}

//A variable of type function that takes Laptop object and return Unit
val clickListener: (Laptop) -> Unit = { print(it) }