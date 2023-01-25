/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labwork_5_v_2;

/**
 *
 * @author User
 */
public class Task1 {
    public static void main(int[][] matrix) {
        lolSwap(matrix);
        // Prints the matrix with the first and last rows swapped
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void lolSwap(int[][] matrix) {
        if (matrix == null || matrix.length < 2) {
            throw new IllegalArgumentException("Matrix is null or too small");
        }
        int[] temp = matrix[0];
        matrix[0] = matrix[matrix.length - 1];
        matrix[matrix.length - 1] = temp;
    }
}
