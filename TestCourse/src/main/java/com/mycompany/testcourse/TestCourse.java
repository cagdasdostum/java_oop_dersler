/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testcourse;

/**
 *
 * @author cagda
 */
public class TestCourse {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Course c1 = new Course("Java oop");
        Course c2 = new Course("Java mobil");
        
        c1.ogrenciEkle("Çağdaş");
        c1.ogrenciEkle("Hüseyin");
        c1.ogrenciEkle("Samet");
        
        c2.ogrenciEkle("Ömer");
        c2.ogrenciEkle("Faruk");
        
        System.out.println("c1 nesnesi için öğrenci sayısı getir: " + c1.ogrenciSayisiniGetir());
        
        String[] getirilenOgrenciler = c1.ogrenciGetir();
        for (int i = 0; i < getirilenOgrenciler.length; i++) {
            if (getirilenOgrenciler[i] != null) {
                System.out.println(getirilenOgrenciler[i]);
            }
        }
        
        String[] yeniOgrenciler =  c2.ogrenciSil("Faruk");
        
        for (int i = 0; i < yeniOgrenciler.length; i++) {
            if (yeniOgrenciler[i] != null) {
                System.out.println(yeniOgrenciler[i]);
            }
        }
    }
}
