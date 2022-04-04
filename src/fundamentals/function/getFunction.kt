package fundamentals.function

fun main() {
    val viewModel = ViewModel()
    println(viewModel.readRepositoryData())

    println(viewModel.data)

}

class ViewModel {
    //We can create a function to read the data
    fun readRepositoryData() = Repository().readData()

    //We can create a getter and save the result in a variable
    val data get() = Repository().readData()
}

class Repository {
    fun readData() = "Data"
}