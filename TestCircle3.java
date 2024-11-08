/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.testcircle3;

 import com.mycompany.totalarea.Circle3;
 
 /**
  *
  * @author cagda
  */
 public class TestCircle3 {
 
     public static void main(String[] args) {
         
         Circle3 c1 = new Circle3(5);
         
         System.out.println("c1 nesnesi için yarıçap: " + c1.getRadius() + "-alan " + c1.getArea());
         
         c1.setRadius(c1.getRadius()*1.3);
         System.out.println("c1 nesnesi için yarıçap: " + c1.getRadius() + "-alan " + c1.getArea());
         
         System.out.println("c1 nesnesi için static object sayısı: " + Circle3.getNumberOfObjects());
         
         printCircle(c1);
         
         int n = 5;
         
         printAreas(c1,n);
         
     }
     public static void printCircle(Circle3 cc) {
         
         System.out.println("cc nesnesi için yarıçap: " + cc.getRadius()+ "-alan: " + cc.getArea());
         
     }
     
     public static void printAreas(Circle3 cc, int times) {
         
         System.out.println("yarıçap \t alan\t");
         
         while(times>=1) {
             
             System.out.println(cc.getRadius() + "\t\t" + cc.getArea());
             
             cc.setRadius(cc.getRadius()+1);
             
             times--;
         }
     }
 }
 