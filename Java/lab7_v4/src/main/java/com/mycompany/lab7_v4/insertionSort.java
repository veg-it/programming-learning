/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab7_v4;

/**
 *
 * @author User
 */
public class insertionSort implements SortingStrategy {
    public void sort(float[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            float key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
