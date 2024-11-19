/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaapplication1;

/**
 *
 * @author cagda
 */
public class Uygulama4 {

    public static void main(String[] args) {
            Rectangle rect1 = new Rectangle();
            Rectangle rect2 = new Rectangle(3.5, 35.9);
            System.out.println("1.dikdörtgenin alanı: " + rect2.getArea());
            System.out.println("1.dikdörtgenin çevresi: " + rect2.getPerimeter());
            
            Rectangle rect3 = new Rectangle(4, 40);
            System.out.println("2.dikdörtgenin alanı: " + rect3.getArea());
            System.out.println("2.dikdörtgenin çevresi: " + rect3.getPerimeter());
            
    }
}

class Rectangle {
    public double width = 1;
    public double height = 1;
    
    Rectangle() {
        this.width = width;
        this.height = height;
    }
    Rectangle(double new_width, double new_height) {
        this.width = new_width;
        this.height = new_height;
    }
    public double getArea() {
        double area = width * height;
        return area;
    }
    public double getPerimeter() {
        double perimeter = 2*width + 2*height;
        return perimeter;
    }
}
