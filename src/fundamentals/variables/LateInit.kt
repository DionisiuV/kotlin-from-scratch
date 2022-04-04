package fundamentals.variables

fun main() {
    val viewModel: ViewModel = ViewModel()
    viewModel.getName()

    //check if the late init variable is init
    if(viewModel.isCourseNameInit) {
        val courseName = viewModel.courseName
        println(courseName)
    }
}

class ViewModel {
    lateinit var courseName: String

    fun getName() {
        val repository: Repository = Repository()
        courseName = repository.getCourseById(3)
    }

    //This is called reflection
    val isCourseNameInit get() = ::courseName.isInitialized //
}

class Repository {
    fun getCourseById(id: Int) = "Kotlin form Scratch"
}