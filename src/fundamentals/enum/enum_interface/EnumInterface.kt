package fundamentals.enum.enum_interface


fun main() {
  val info: String = HttpsResponse.NOT_FOUND.getError()
  println(info)
}

enum class HttpsResponse(val statusCode: Int, val type: String) : Server {
//  OK(statusCode = 200, type = "Success") {
//    override fun getError() = "Request successfully!"
//
//  },
//  FORBIDDEN(statusCode = 103, type = "Client Error") {
//    override fun getError() = "FORBIDDEN!"
//  },
//  NOT_FOUND(statusCode = 404, type = "Client Error") {
//    override fun getError() = "Server not found!"
//  };

  OK(statusCode = 200, type = "Success"),
  FORBIDDEN(statusCode = 103, type = "Client Error"),
  NOT_FOUND(statusCode = 404, type = "Client Error");

  override fun getError(): String = when(statusCode) {
    200 -> "Request successfully."
    403 -> "The client doesn't accuses."
    404 -> "Server error"
    else -> "Unknown Error."
  }
}

interface Server {
  fun getError(): String
}

