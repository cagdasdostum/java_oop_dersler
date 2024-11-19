package com.mycompany.javaapplication1;

public class Uygulama2 {
    public static void main(String[] args) {
        
        System.out.println(Circle.nesne_sayisi);
        Circle c1 = new Circle();
        System.out.println("nesne oluşturulduktan sonra: " + Circle.nesne_sayisi);
        System.out.println("c1 için radius: " + c1.radius);
        System.out.println("c1 için alan: " + c1.getArea());
        System.out.println("c1 için nesne sayısı: " + c1.nesne_sayisi);



        Circle c2 = new Circle(2.4);
        System.out.println("nesne oluşturulduktan sonra: " + Circle.nesne_sayisi);
        System.out.println("c2 için radius: " + c2.radius);
        System.out.println("c2 için alan: " + c2.getArea());
        System.out.println("c2 için nesne sayısı: " + c2.nesne_sayisi);



    }
}

class Circle {

    public double radius;

    public static int nesne_sayisi = 0;
    public static final double PI = 3.14;

    Circle() {
        radius = 2.4;
        nesne_sayisi++;
    }
    Circle(double new_radius) {
        radius = new_radius;
        nesne_sayisi++;
    }

    public static int get_nesne_sayisi() {
        return nesne_sayisi;
    }
    public double getArea() {
        return radius * radius * PI;
    }
}

