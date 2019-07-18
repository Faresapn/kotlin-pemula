fun main() {
    val listNumber = 1.rangeTo(30)

    for (i in listNumber) {
        // TODO 1
        if (i % 2 != 1) continue

        // TODO 2
        if (i > 10 ) break


        // TODO 3
        val result = (2 + i) * i
        println("result is $result")
    }
}