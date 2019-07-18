data class User(val name: String, var age: Int, var address: String)
fun main() {

    // TODO 2
    val user = User("John", 23, "St. Petersburg")

    // TODO 3
    val newUser = user.copy()
    // TODO 4
    newUser.age = 25
    newUser.address = "Saint Petersburg"

    // TODO 5
    println("""User
        |Name: ${user.name}
        |Age: ${user.age}
        |Address: ${user.address}
        |
        |New User
        |Name: ${newUser.name}
        |Age: ${newUser.age}
        |Address: ${newUser.address}
        """.trimMargin())
}

// TODO 1
