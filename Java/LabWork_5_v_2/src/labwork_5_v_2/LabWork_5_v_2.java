/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labwork_5_v_2;

/**
 *
 * @author User
 */
public class LabWork_5_v_2 {
    
    public static void main(String[] args) {
        //Дані для першого завдання
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //Дані для другого завдання
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8}, {9, 10}, {11, 12}};
        
        System.out.println("Zavdannya: 1");
        Task1.main(matrix);
        
        System.out.println("Zavdannya: 2");
        Task2.main(a, b);
        
    }
    
}
