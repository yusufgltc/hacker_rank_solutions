package plus_minus

import java.util.*

fun plusMinus() {

    val random = Random()
    val arr = IntArray(5)

    var positive = 0
    var negative = 0
    var neutral = 0

    for (i in arr.indices) {
        arr[i] = random.nextInt()
        println(arr.contentToString())

        when {
            arr[i] > 0 -> {
                positive++
            }
        }
        when {
            arr[i] < 0 -> {
                negative++
            }
        }
        when {
            arr[i] == 0 -> {
                neutral++
            }
        }
    }
    println(positive)
    println(negative)
    println(neutral)

}