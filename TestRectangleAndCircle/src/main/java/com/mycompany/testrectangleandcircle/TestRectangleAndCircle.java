/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testrectangleandcircle;
import com.mycompany.testrectangleandcircle.GeometricObject;
/**
 *
 * @author cagda
 */
public class TestRectangleAndCircle {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Rectangle rectangle = new Rectangle(45, 35);
        Circle circle = new Circle(4.5, "yeşil", true);
        
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}

class Rectangle extends GeometricObject {

    private double width, height;
    
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        
    }
    
    Rectangle(int width, int height, String color, boolean filled) {
        
        super(color, filled);
        this.width = width;
        this.height = height;
        //setColor(color);
        //setFilled(filled);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(int value) {
        this.width = value;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(int value) {
        this.height = value;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    
        public String toString() {
            //return super.toString();
            return "rectangle class'ının toString() metodu çalıştı";
    }

    
}

class Circle extends GeometricObject {
    
    private double radius;
    
    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(int value) {
        this.radius = value;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
/*        public String toString() {
            //return super.toString();
            return "circle class'ının toString() metodu çalıştı";
    }*/
}
