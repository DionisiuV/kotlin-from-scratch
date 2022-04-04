package fundamentals.classes

import fundamentals.classes.Server.*
import java.net.HttpURLConnection.*

fun main() {
    when(val response = getServerResponse()) {
        is Success -> print(response)
        is Error -> print(response)
        is Loading -> print("Loading...")
    }
}

sealed class Server {
    data class Success(val response: Int): Server()
    data class Error(val response: Int): Server()
    object Loading: Server()
}

fun getServerResponse(): Server {
    val random = (1 ..1000).random()
    return if(random % 2 == 0) {
        Success(HTTP_OK)
    } else {
        Error(HTTP_INTERNAL_ERROR)
    }
}