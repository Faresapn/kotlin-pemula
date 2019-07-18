fun main() {

    // TODO 2
    val text = formatText("Kotlin is Awesome")

    val lowerCase = text["lowerCase"]
    val upperCase = text["upperCase"]

    // TODO 3
    println(lowerCase)
    println(upperCase)

}

// TODO 1
fun formatText(text: String) = with(text){
    mapOf(
            "lowerCase" to this.toLowerCase(),
            "upperCase" to this.toUpperCase()
    )
}