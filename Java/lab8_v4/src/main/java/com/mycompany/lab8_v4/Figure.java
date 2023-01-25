/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8_v4;

/**
 *
 * @author User
 */
public abstract class Figure {

    protected double x;
    protected double y;

    public Figure() {
        this(0, 0);
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Figure)) {
            return false;
        }
        Figure other = (Figure) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public String toString() {
        return getClass().getName() + "(" + x + ", " + y + ")";
    }
}
