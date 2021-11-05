package a_very_big_sum

fun aVeryBigSum() {
    var sum: Long = 0
    val list = listOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    for (i in list.indices) {
        sum += list[i]
    }
    println(sum)
}