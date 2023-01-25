/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labwork_4_v_2;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Task3 {

    public static void main(int[] arr) {
        int[] result = divideBySmallest(arr);
        System.out.println(Arrays.toString(result));
        
    }

    public static int[] divideBySmallest(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array is null");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        if (min == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = -10;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] /= min;
            }
        }
        return arr;
    }
}