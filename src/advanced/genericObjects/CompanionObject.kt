package advanced.genericObjects


fun main() {
    val instance = Instance.Factory.create()
    val simplifiedInstance = Instance.create()

    val anotherInstance = AnotherInstance.create()

    val f: Factory<LastInstance> = LastInstance
    f.create()

}

class Instance {
    companion object Factory {
        fun create() = Instance()
    }
}

class AnotherInstance {
    companion object {
        fun create() = AnotherInstance()
    }
}

class LastInstance {
    companion object : Factory<LastInstance> {
        override fun create(): LastInstance = LastInstance()
    }
}

interface Factory<T> {
    fun create(): T
}