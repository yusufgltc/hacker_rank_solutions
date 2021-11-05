package time_conversion

fun timeConversion() {
    val time = "9:05:45PM"
    val parts = time.split(":").toTypedArray()
    val hour = parts[0]
    val min = parts[1]
    val sec = parts[2]

    if (sec.contains("PM")) {
        val hx = hour.toInt() + 12
        println(":" + hx + min + ":" + sec.substring(0, 2))
    }

    if (sec.contains("AM")) {
        if (hour == "12") {
            hour == "00"
        }
        println(hour + ":" + min + ":" + sec.substring(0, 2))
    }
}
