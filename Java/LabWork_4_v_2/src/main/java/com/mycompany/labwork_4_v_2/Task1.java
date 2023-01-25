/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labwork_4_v_2;

/**
 *
 * @author User
 */
public class Task1 {
    public static void main(int[] arr) {
        int result = sumGreaterThanThree(arr);
        System.out.println(result);
    }

    public static int sumGreaterThanThree(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 3) {
                sum += i;
            }
        }
        return sum;
    }
}
