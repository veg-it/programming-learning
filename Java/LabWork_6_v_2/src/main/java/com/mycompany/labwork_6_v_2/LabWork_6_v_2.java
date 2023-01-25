/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labwork_6_v_2;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class LabWork_6_v_2 {

    public static void main(String[] args) {
        short[] array = {5, 3, 8, 1, 9, 6};

        System.out.println("Original Array: " + Arrays.toString(array));

        Task1.sort(array);
        System.out.println("Selection Sort: " + Arrays.toString(array));

        Task2.sort(array);
        System.out.println("Insertion Sort: " + Arrays.toString(array));
    }
}
