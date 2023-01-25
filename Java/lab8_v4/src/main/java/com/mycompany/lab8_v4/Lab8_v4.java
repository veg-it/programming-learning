/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab8_v4;

/**
 *
 * @author User
 */
public class Lab8_v4 {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(1, 2, 3, 4);
        rect.setWidth(5);
        rect.setHeight(6);
        System.out.println("Rectangle Area: " + rect.getArea()); // prints 30.0
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter()); // prints 22.0
        System.out.println("Rectangle toString: " + rect.toString());
        System.out.println("Rectangle equal: " + rect.equals(new Rectangle(1, 2, 5, 6)));

        Circle circle = new Circle(5, 6, 7);
        circle.setRadius(8);
        System.out.println("Circle Area: " + circle.getArea()); // prints 201.06192982974676
        System.out.println("Circle Perimeter: " + circle.getPerimeter()); // prints 50.26548245743669
        System.out.println("Circle toString: " + circle.toString());
        System.out.println("Circle equal: " + circle.equals(new Circle(5, 6, 8)));
    }
}
