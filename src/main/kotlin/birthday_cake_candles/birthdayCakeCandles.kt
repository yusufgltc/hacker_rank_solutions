package birthday_cake_candles


fun birthdayCakeCandles() {
    val list = arrayListOf(3, 2, 1, 3)
    var countMax = 0
    var maxValue = 0

    for (i in 0 until list.size) {
        if (list[i] == maxValue) {
            countMax++
        }

        if (list[i] > maxValue) {
            maxValue = list[i]
            countMax = 1
        }
    }
}