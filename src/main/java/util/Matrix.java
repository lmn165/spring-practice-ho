package util;

public final class Matrix {
    public int[][] creatMatrix(int row, int column){
        int[][] matrix = new int[row][column];
        for (int i=0, k=1; i<row; i++){
            for (int j=0; j<column; j++){
                matrix[i][j] = k++;
            }
        }
        return matrix;
    }
}
