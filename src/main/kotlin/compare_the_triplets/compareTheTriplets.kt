package compare_the_triplets

fun compareTheTriplets() {
    var aliceScore = 0
    var bobScore = 0

    val listAlice = listOf(17, 28, 30)
    val listBob = listOf(99, 16, 8)

    for (i in listAlice.indices) {
        if (listAlice[i] > listBob[i]) {
            aliceScore++
        }

        if (listBob[i]>listAlice[i]){
            bobScore++
        }

        when {
            listAlice[i]==listBob[i] -> {
                //do nothing
            }
        }
    }
    println(aliceScore)
    println(bobScore)

}