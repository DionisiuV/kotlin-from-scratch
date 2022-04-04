package advanced.extension

fun main() {
    val server = FtpServer("ftp.amazon.com", 21)
    val client = Client(server, "Valentin", "test")
    client.connect()
}



class FtpServer(private val host: String, private val port: Int) {
    fun printFtpServerDetails() = println("$host:$port")
}


class Client(private val ftpServer: FtpServer, private val user: String, private val pass: String) {

    private fun printClientDetails() = println("$user@$pass")
    fun connect() = ftpServer.printAllDetails()

    private fun FtpServer.printAllDetails() { //extension function to FtpServer class
        this.printFtpServerDetails() //calls FtpServer.printFtpServerDetails()
        printClientDetails() //calls Client.printClientDetails()
    }
}