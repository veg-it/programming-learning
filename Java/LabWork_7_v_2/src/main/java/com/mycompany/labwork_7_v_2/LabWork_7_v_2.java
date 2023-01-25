/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.labwork_7_v_2;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class LabWork_7_v_2 {

    public static void main(String[] args) {
        short[] array = {5, 3, 8, 1, 9, 6};

        System.out.println("Оригінальний масив: " + Arrays.toString(array));

        Sorter sorter = new Sorter();
        sorter.sort(array, new SelectionSort());
        System.out.println("Після сортування (Selection): " + Arrays.toString(array));

        sorter.sort(array, new InsertionSort());
        System.out.println("Після сортування (Insertion): " + Arrays.toString(array));

        sorter.sort(array, new BubbleSort());
        System.out.println("Після сортування (Bubble): " + Arrays.toString(array));
    }
}
