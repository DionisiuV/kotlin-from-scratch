package advanced.genericObjects

fun main() {
    countClicks(Window())
}

fun countClicks(window: Window) {
    var clickCount = 0
    var longClickCount = 0

    window.addOnMouseClickListener(object : Mouse.ClickListener {
        override fun onMouseClick() {
            clickCount++
            println(clickCount)
        }
    })

    window.addOnLongMouseClickListener(object : Mouse.LongClickListener {
        override fun onMouseLongClick() {
            longClickCount++
            println(longClickCount)
        }
    })

}

interface Mouse {
    interface ClickListener {
        fun onMouseClick()
    }

    interface LongClickListener {
        fun onMouseLongClick()
    }
}

class Window {
    fun addOnMouseClickListener(mouseClickListener: Mouse.ClickListener) {
        mouseClickListener.onMouseClick()
    }
    fun addOnLongMouseClickListener(mouseLongClickListener: Mouse.LongClickListener) {
        mouseLongClickListener.onMouseLongClick()
    }
}