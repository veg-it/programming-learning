/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_v4;

/**
 *
 * @author User
 */
public class MatrixTranspose {
    // Transpose the input matrix b swapping the elements across the main diagonal
    public static void transpose(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matrix must be square");
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] testMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original matrix:");
        printMatrix(testMatrix);
        transpose(testMatrix);
        System.out.println("Transposed matrix:");
        printMatrix(testMatrix);
    }
}
