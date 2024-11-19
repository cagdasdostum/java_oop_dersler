/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalarea;

/**
 *
 * @author cagda
 */
public class TotalArea {

    public static void main(String[] args) {
        Circle3 [] circleArray;
        circleArray = createCircleArray();
        
        printCircleArray(circleArray);
    }
    
    public static Circle3 [] createCircleArray() {
        Circle3 [] cc = new Circle3[5];
        
        for (int i = 0; i < cc.length; i++) {
            cc[i] = new Circle3(Math.random()*100);
            
        }
        return cc;
    }
    
    public static void printCircleArray(Circle3[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1) + ". nesnenin yarıçapı: " + arr[i].getRadius() + " alanı: " + arr[i].getArea());
        }
        
        System.out.println("Tüm alanların toplamı: " + sum(arr));
    }
    
    public static double sum(Circle3 [] array) {
        double toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i].getArea();
        }
        return toplam;
    }
}

