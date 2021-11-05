package simple_array_sum

fun simpleArraySum() {
    var listSum = 0
    val list = listOf(1,2,3,4,10,11)

    for(i in list.indices){
        listSum += list[i]
    }
    println(listSum)
}