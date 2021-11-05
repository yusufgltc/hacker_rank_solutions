package min_max_sum

import java.util.*


fun minMaxSum() {
    var max = 0
    var min = 0
    val list = intArrayOf(1, 2, 3, 4, 5)
    Arrays.sort(list)

    for (i in 0 until list.size - 1) {
        min += list[i]
    }
    println(min)

    for (i in list.size - 1 downTo 1) {
        max += list[i]
    }
    println(max)
}