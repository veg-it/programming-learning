/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8_v4;

/**
 *
 * @author User
 */
public class Circle extends Figure {

    private double radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (!(obj instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) obj;
        return radius == other.radius;
    }

    @Override
    public String toString() {
        return super.toString() + "[radius=" + radius + "]";
    }
}
