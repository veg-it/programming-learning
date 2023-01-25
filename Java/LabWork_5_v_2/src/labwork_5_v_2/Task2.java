/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork_5_v_2;

/**
 *
 * @author User
 */
class Task2 {

    public static void main(int[][] a, int[][] b) {
        int[][] result = multiply(a, b);
        // Prints the result of multiplying matrix a and matrix b
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;
        if (colsA != rowsB) {
            throw new IllegalArgumentException("A:Rows: " + colsA + " did not match B:Columns " + rowsB + ".");
        }
        int[][] c = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
