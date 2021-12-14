package number_lines_jump

fun numberLinesJump() {
    val x1 = 0
    val v1 = 3
    val x2 = 4
    val v2 = 2

    for (i in 1..10000) {
        if (x1 + v1 * i == x2 + v2 * i) {
            println("YES")
            break
        } else {
            println("NO")
        }
    }
}