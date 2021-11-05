package sales_by_match

import java.util.*


fun salesByMatch(){
    val socksList = HashSet(listOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
    val list = ArrayList(socksList)
    var pairCount = 0

    for (i in socksList.indices){
        val element = list[i]
        if (socksList.contains(element)){
            socksList.remove(element)
            pairCount++
        }else{
            socksList.add(element)
        }
    }
    println(pairCount)
}