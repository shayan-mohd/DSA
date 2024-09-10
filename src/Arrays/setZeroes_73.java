package Arrays;

public class setZeroes_73 {
    public void setZeroes(int[][] matrix) {

        int col0 = 1;

        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] == 0) {
                    matrix[row][0] = 0;

                    if (column != 0)
                        matrix[0][column] = 0;
                    else
                        col0 = 0;
                }
            }
        }

        for(int row = 1; row < matrix.length; row++) {
            for(int column = 1; column < matrix[0].length; column++) {
                if(matrix[row][column] != 0){
                    if (matrix[0][column] == 0 || matrix[row][0] == 0) {
                        matrix[row][column] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0)
        {
            for (int i = 0; i< matrix[0].length; i++)
                matrix[0][i] = 0;
        }

        if (col0 == 0)
        {
            for (int i = 0 ; i < matrix.length; i++)
                matrix[i][0] = 0;
        }


    }
}
