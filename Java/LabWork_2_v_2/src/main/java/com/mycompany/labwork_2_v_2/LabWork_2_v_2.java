/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labwork_2_v_2;

/**
 *
 * @author User
 */
public class LabWork_2_v_2 {

    public static void main(String[] args) {
        double a,b,c,d,y;
//1
        a=3.56;
        b=1.02;
        c=3;
        d=2.43;
        y = (Math.pow(Math.tan(a), 1.0/c))/(1+Math.sinh(b)/Math.log(Math.abs(d+c)));
        System.out.println("y = " + y);
//2
        a=2.54;
        b=1.23;
        c=-2.14;
        d=-0.23;
        y = 2*Math.cos(Math.pow(a, b))+Math.abs(Math.acos(-Math.sqrt(c/d)));
        System.out.println("y = " + y);
//3
        a=-1.23;
        b=-0.34;
        c=0.707;
        d=2.312;
        y = 3*(Math.log(Math.abs(b/a)+Math.sqrt(Math.sin(c)+Math.pow(Math.E, d))));
        System.out.println("y = " + y);
    }
}
