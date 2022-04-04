package advanced.genericObjects

fun main() {
    val view = View()

    val clickListener = object: ClickListener {
        override fun onClick() {
            println("Click from anonymous object that extend interface ClickListener")
        }
    }

//   view.addOnCLickListener(clickListener)

    //Java
    val longClickListener = LongClickListener {
        println("Click from longClickListener interface")
    }

//    view.addOnLongCLickListener(longClickListener)


    val book = object : Book(3) , Readable {
        override val newPageNumber = 300

        override fun read() {
            println(newPageNumber)
        }
    }

    println(book.read())
}

class View {
    fun addOnCLickListener(clickListener: ClickListener) {
        clickListener.onClick()
    }

    fun addOnLongCLickListener(longClickListener: LongClickListener) {
        longClickListener.onLongClick()
    }

}

interface ClickListener {
    fun onClick()
}

fun interface Readable {
    fun read()
}

open class Book(pageNumber: Int) {
    open val newPageNumber: Int = pageNumber
}