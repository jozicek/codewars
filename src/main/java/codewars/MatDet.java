package codewars;

import java.util.Arrays;

public class MatDet {

  public static void main(String[] args) {
    int[][] M = {{-8, 0, 8, 9, 4, -9}, {-6, -8, -6, 5, 3, 8}, {-7, 5, -4, 2, -8, -3}, {-7, -1, -9, -10, 1, -8}, {-7, -10, 4, 8, -3, 5}, {2, -4, -8, -4, -10, -8}};
    print(M);
    int[][] m = min(M, 0, 0);
    print(m);
  }

  private static int[][] min(int[][] matrix, int row, int column) {
    int[][] m = new int[matrix.length - 1][matrix.length - 1];

    int x = 0;
    int y = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if(i==row || j == column) continue;
        m[x][y] = matrix[i][j];

      }
    }

    return m;
  }


  private static void print(int[][] matrix) {
    for (int g = 0; g < matrix.length; g++) {
      System.out.print(Arrays.toString(matrix[g]).replace('[', '{').replace(']', '}') + ",");
    }
  }

}
