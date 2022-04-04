package advanced.interfaces

fun main() {
    val auth: GoogleAuth = MyApp()
    auth.displayMessage()
    auth.signIn()
}

interface GoogleAuth {
    val errorMessage: String //abstract
    val timeout:  Int get() = 3 //Property with implementation

    fun displayMessage() {
        println("Please sign in")
    }

    fun signIn()
}

class MyApp : GoogleAuth {
    override val errorMessage: String get() = "Auth error"
    override fun signIn() = println("Signed in")
}