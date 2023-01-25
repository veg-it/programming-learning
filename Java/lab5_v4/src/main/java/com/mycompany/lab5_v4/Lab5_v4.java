/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5_v4;

/**
 *
 * @author User
 */
public class Lab5_v4 {

    public static void main(String[] args) {
        System.out.println("Task 1");
        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] testMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixTranspose.transpose(testMatrix);
        matrixTranspose.printMatrix(testMatrix);
        System.out.println("Task 2");
        FootballTable footballTable = new FootballTable();
        int[][] testTable = {{2, 1, 0}, {1, 2, 0}, {0, 1, 2}};
        System.out.print("Чи є хоча б одна команда що виграли більше половини ігор: ");
        System.out.print(footballTable.isUnbalanced(testTable));

    }
}
