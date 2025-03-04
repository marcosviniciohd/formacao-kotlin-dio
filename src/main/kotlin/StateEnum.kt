enum class StateEnum {
    IDLE,
    RUNNING,
    FINISHED
}

fun main() {
    val state = StateEnum.RUNNING

    val message = when (state) {
        StateEnum.IDLE -> "It's idle"
        StateEnum.RUNNING -> "It's running"
        StateEnum.FINISHED -> "It's finished"
    }

    println(message)
}