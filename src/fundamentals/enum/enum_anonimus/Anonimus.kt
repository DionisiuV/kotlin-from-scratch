package fundamentals.enum.enum_anonimus

fun main() {
  val success = HttpResponse.OK.getError()

}

enum class HttpResponse(val statusCode: Int, val type: String) {
  OK(statusCode = 200, type = "Success") {
    override fun getError() {
      println("Request successfully!")
    }
  },
  FORBIDDEN(statusCode = 103, type = "Client Error") {
    override fun getError() {
      println("The client doesn't have access.")
    }
  },
  NOT_FOUND(statusCode = 404, type = "Client Error") {
    override fun getError() {
      println("Server Error!")
    }
  };

  abstract fun getError()
}
