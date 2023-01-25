/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5_v4;

/**
 *
 * @author User
 */
public class FootballTable {
    public static boolean isUnbalanced(int[][] results) {
        if (results.length != results[0].length) {
            throw new IllegalArgumentException("Matrix must be square");
        }

        for (int i = 0; i < results.length; i++) {
            int wins = 0;
            for (int j = 0; j < results[0].length; j++) {
                if (results[i][j] != 2 && results[i][j] != 1 && results[i][j] != 0) {
                    throw new IllegalArgumentException("Matrix elements must be in the set {2,1,0}");
                }
                if (results[i][j] == 2) {
                    wins++;
                }
            }
            if (wins > results.length / 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] testTable = {{2, 1, 0}, {1, 2, 0}, {0, 1, 2}};
        System.out.println(isUnbalanced(testTable)); // should return false
    }
}
