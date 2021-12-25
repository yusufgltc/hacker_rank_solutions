package cats_and_mouse

import kotlin.math.abs

fun catsAndMouse() {

    val situationFirst = intArrayOf(1, 2, 3)
    val situationSecond = intArrayOf(1, 3, 2)

    val distanceA = abs(situationSecond[0] - situationSecond[2])
    val distanceB = abs(situationSecond[1] - situationSecond[2])

    if (distanceA < distanceB) {
        println("Cat A")
    } else if (distanceA > distanceB) {
        println("Cat B")
    } else {
        println("Mouse C")
    }
}