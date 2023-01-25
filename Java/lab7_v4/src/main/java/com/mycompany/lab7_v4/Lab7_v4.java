/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab7_v4;

import java.util.Arrays;

/**
 *
 * @author User
 */

public class Lab7_v4 {

    public static void main(String[] args) {
        SortingStrategy bubbleSort = new bubbleSort();
        float[] arr = {2.3F, 2.3F, 1.9F, -1.2F, 5.6F};
        bubbleSort.sort(arr);
        System.out.println("BubbleSort: " + Arrays.toString(arr));

        SortingStrategy selectionSort = new selectionSort();
        float[] arr2 = {2.3F, -6F, 38F, -1.2F, 2.6F};
        selectionSort.sort(arr2);
        System.out.println("SelectionSort: " + Arrays.toString(arr2));

        SortingStrategy insertionSort = new insertionSort();
        float[] arr3 = {7.3F, -6F, 8F, -1.2F, 2.6F};
        insertionSort.sort(arr3);
        System.out.println("InsertionSort: " + Arrays.toString(arr3));
    }
}


interface Shape {
    void draw();
    void resize();
    void rotate();
}

class Circle implements Shape {
    public void draw() { /* code to draw a circle */ }
    public void resize() { /* code to resize a circle */ }
    public void rotate() { /* code to rotate a circle */ }
}