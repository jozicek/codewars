package codewars;

import java.util.Arrays;

public class MatrixDeterminant {
  static int[][] m = {{-8, 0, 8, 9, 4, -9}, {-6, -8, -6, 5, 3, 8}, {-7, 5, -4, 2, -8, -3}, {-7, -1, -9, -10, 1, -8}, {-7, -10, 4, 8, -3, 5}, {2, -4, -8, -4, -10, -8}};
  static int a = 0;

  public static int determinant(int[][] matrix) {
    for (int g = 0; g < matrix.length; g++) {
      System.out.print(Arrays.toString(matrix[g]).replace('[', '{').replace(']', '}') + ",");
    }
    System.out.println();
    if (matrix[0].length == 1) return matrix[0][0];
    if (matrix[0].length == 2) return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
    int[][] met = new int[matrix[0].length - 1][matrix[0].length - 1];
    int i = 0;
    int j = 0;
    int k = 0;
    for (k = 0; k < matrix.length; k++) {
      for (i = 1; i < matrix.length; i++) {
        for (j = 0; j < matrix.length; j++) {
          if (k != j && i != 0 && j > k) met[i - 1][j - 1] = matrix[i][j];
          if (k != j && i != 0 && j < k) met[i - 1][j] = matrix[i][j];
        }
      }
      System.out.println(a);
      a += ((k + 2) % 2 == 0) ? matrix[0][k] * determinant(met) : (-1) * matrix[0][k] * determinant(met);
    }
    return a;
  }

  public static void main(String[] args) {
    System.out.println(determinant(m));
  }
}
