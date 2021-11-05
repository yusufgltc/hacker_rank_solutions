package diogonal_difference

import kotlin.math.abs

fun diagonalDifference() {
    val matrix = arrayOf(
        intArrayOf(11, 2, 4),
        intArrayOf(4, 5, 6),
        intArrayOf(10, 8, -12))

    val primaryDiagonal = matrix[0][0] + matrix[1][1] + matrix[2][2]
    val secondaryDiagonal = matrix[0][2] + matrix[1][1] + matrix[2][0]

    val result = primaryDiagonal - secondaryDiagonal
    print(abs(result))

//    val matrix2 = arrayOf(
//        intArrayOf(1,2,3),
//        intArrayOf(4,5,6),
//        intArrayOf(7,8,9)
//    )
//
//    val primaryDiagonal2 = matrix2[0][0] + matrix2[1][1] + matrix2[2][2]
//    val secondaryDiagonal2 = matrix2[0][2] + matrix2[1][1] + matrix2[2][0]
//
//    val result2 = primaryDiagonal2 - secondaryDiagonal2
//    print(abs(result2))
}