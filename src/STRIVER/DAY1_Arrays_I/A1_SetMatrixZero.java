package STRIVER.DAY1_Arrays_I;

public class A1_SetMatrixZero {
    public static void main(String[] args) {

    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length, flag = 0;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    flag = 1;
                    
                }
            }
        }
    }
}
