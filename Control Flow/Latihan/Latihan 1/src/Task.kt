fun main() {
    val value = 1
    val range = 1..100

    // TODO 2
    println("In range : ${inRange(value, range)}")
}

// TODO 1
fun inRange(value: Int, range: IntRange): Boolean {
    return when (value) {
        in range -> true
        !in range -> false
        else -> false
    }
}