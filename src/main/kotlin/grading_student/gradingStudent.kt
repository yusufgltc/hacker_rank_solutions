package grading_student

fun gradingStudent() {

    val gradeList = mutableListOf(73, 67, 38, 33)

    for (i in gradeList.indices) {
        if (gradeList[i] >= 38) {
            val reminder = gradeList[i] % 5
            val leastMultiple = gradeList[i] - reminder
            val upperMultiple = leastMultiple + 5
            val difference = upperMultiple - gradeList[i]

            if (difference<3){
                gradeList[i] = upperMultiple
            }
        }
        println(gradeList)
    }

}