/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6_v4;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Lab6_v4 {

    public static void main(String[] args) {
        float[] arr = {2.3F, 2.3F, 1.9F, -1.2F, 5.6F};
        SortArray.bubbleSort(arr);
        System.out.println("BubbleSort: " + Arrays.toString(arr));
        
        float[] arr2 = {2.3F, -6F, 38F, -1.2F, 2.6F};
        SortArray.selectionSort(arr2);
        System.out.println("SelectionSort: " + Arrays.toString(arr2));
    }
}
