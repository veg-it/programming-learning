/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labwork_4_v_2;

/**
 *
 * @author User
 */
public class LabWork_4_v_2 {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 33, 4, 5, 45, 2};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr3 = {1, 0, 3, 8, 23, 6, 7};
        
        System.out.println("Завдання: 1:");
        Task1.main(arr);
        Task1.main(arr2);
        Task1.main(arr3);
        
        System.out.println("Завдання: 2 (Пам'ятайте про те що індекс першого єлемента массиву дорівнює 0):");
        Task2.main(arr);
        Task2.main(arr2);
        Task2.main(arr3);
        
        System.out.println("Завдання: 3:");
        Task3.main(arr);
        Task3.main(arr2);
        Task3.main(arr3);
    }
}
