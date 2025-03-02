package heranca

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("A lion named $name says: graaaah!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}