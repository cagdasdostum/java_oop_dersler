/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.polymorphismdemo;

import java.time.*;

/**
 *
 * @author cagda
 */
public class PolymorphismDemo {

    public static void main(String[] args) {
        Circle c1 = new Circle(2, "kırmızı");
        Rectangle r1 = new Rectangle(34.5, 56.7, "yeşil");

        GeometricObject g1 = new Circle();  // parentclass = new subclass;
        Circle c2 = (Circle) g1; // (Circle) kullanarak expilisiv casting ypatık.

        GeometricObject g2 = new Circle(5, "mor");
        GeometricObject g3 = new Rectangle(4, 7, "turuncu");

        displayObject(g2);
        displayObject(g3);
    }

    public static void displayObject(GeometricObject geo) {
        System.out.println("Oluşturulduğu tarih: " + geo.getDate() + " rengi: " + geo.getColor());
    }

}

class GeometricObject {

    private String color;
    private LocalDate createDate;

    public GeometricObject() {
        createDate = LocalDate.now();
    }

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public LocalDate getDate() {
        return this.createDate;
    }
}

class Circle extends GeometricObject {

    private double radius;
    private String color;
    private LocalDate createdDate;

    public Circle() {
        createdDate = LocalDate.now();
    }

    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

}

class Rectangle extends GeometricObject {

    private double width, height;
    private String color;
    private LocalDate createdDate;

    public Rectangle() {
        createdDate = LocalDate.now();
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
