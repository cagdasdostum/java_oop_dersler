/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vizelere_hazirlik_oop;

/**
 *
 * @author cagda
 */
public class Vizelere_hazirlik_oop {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Rectangle r1 = new Rectangle(35.5, 45.5);
        Rectangle r2 = new Rectangle(4, 40);

        System.out.println("--------rectangle 1---------\n"
                + "width:" + r1.width + "\n"
                + "height:" + r1.height + "\n"
                + "area:" + r1.getArea() + "\n"
                + "perimeter:" + r1.getPerimeter() + "\n");

        System.out.println("--------rectangle 2---------\n"
                + "width:" + r2.width + "\n"
                + "height:" + r2.height + "\n"
                + "area:" + r2.getArea() + "\n"
                + "perimeter:" + r2.getPerimeter() + "\n");
    }

}

class Rectangle {

    double width = 1, height = 1;

    public Rectangle() {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double new_width, double new_height) {
        width = new_width;
        height = new_height;
    }

    public double getArea() {

        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

}
