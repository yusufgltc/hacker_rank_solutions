package stair_case

fun stairCase() {
    for (star in 1..6) {
        val space = 6 - star
        for (i in 0 until space){
            print(' ')
        }
        for (i in 0 until star){
            print('#')
        }
        println()
    }
}