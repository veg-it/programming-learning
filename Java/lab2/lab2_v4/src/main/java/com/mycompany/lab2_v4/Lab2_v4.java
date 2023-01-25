/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2_v4;

/**
 *
 * @author User
 */
public class Lab2_v4 {

    public static void main(String[] args) {
        double a,b,c,d,y;
//        Zavdannya 1
        a=1.27;
        b=10.99;
        c=2.73;
        d=25.32;
        y = (Math.pow(a, b)/Math.sinh(Math.abs(b)) + 4 * (Math.log(c)/Math.pow(d, 1.0/4)));
        System.out.println("Zavdannya 1");
        System.out.println("y = " + y);
//        Zavdannya 2
        a=0.478;
        b=-1.26;
        c=2.68;
        d=18.24;
        y = 9 * (Math.asin(a)/Math.cos(Math.sqrt(Math.abs(b)))) + Math.pow(2.43, d) + Math.log(c);
        System.out.println("Zavdannya 2");
        System.out.println("y = " + y);
//        Zavdannya 3
        a=1.478;
        b=9.26;
        c=0.68;
        d=2.24;
        y = 6*Math.pow(Math.sin(Math.abs(2*a)), Math.log(b))+Math.sqrt(c*Math.cosh(-d));
        System.out.println("Zavdannya 3");
        System.out.println("y = " + y);
    }
}
