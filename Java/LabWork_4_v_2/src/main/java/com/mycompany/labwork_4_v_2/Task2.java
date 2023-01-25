/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labwork_4_v_2;

/**
 *
 * @author User
 */
public class Task2 {
    public static void main(int[] arr) {
        int result = sumEvenInOdd(arr);
        System.out.println(result);
    }

    public static int sumEvenInOdd(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}

