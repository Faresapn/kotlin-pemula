// TODO 1
open class Vehicle(val color: String, val wheel: Int, val maxSpeed: Int)

// TODO 2
class Car : Vehicle("Red", 4, 250)
class Motorcycle : Vehicle("Blue", 2, 120)

fun main() {
    val car = Car()

    // TODO 3
    with(car) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }

    val motor = Motorcycle()
    println()

    // TODO 4
    with(motor) {
        println(color)
        println(wheel)
        println(maxSpeed)
    }
}