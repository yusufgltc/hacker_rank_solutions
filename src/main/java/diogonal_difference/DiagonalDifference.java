package diogonal_difference;

public class DiagonalDifference {
    public void diagonalDifference(){
        int[][] matrix2 = {
                {11,2,4},
                {4,5,6},
                {10,8,-12},
        };

        int primary_diagonal = matrix2[0][0] +  matrix2[1][1] +  matrix2[2][2];
        int secondary_diagonal = matrix2[0][2] +  matrix2[1][1] +  matrix2[2][0];

        int result = primary_diagonal - secondary_diagonal;
        System.out.print(Math.abs(result));
    }
}
