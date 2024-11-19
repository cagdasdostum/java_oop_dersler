/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testcourse;

/**
 *
 * @author cagda
 */
public class Course {
    
    private String kursAdi;
    private String[] ogrenciler = new String[10];
    private int ogrenciSayisi;
    
    public Course(String kursAdi) {
        this.kursAdi = kursAdi;
    }
    
    public void ogrenciEkle(String ogrenci) {
        ogrenciler[ogrenciSayisi] = ogrenci;
        ogrenciSayisi++;
    }
    
    public String[] ogrenciGetir() {
        return ogrenciler;
    }
    
    public int ogrenciSayisiniGetir() {
        return ogrenciSayisi;
    }
    
    public String kursAdiGetir() {
        return kursAdi;
    }
    
    public String[] ogrenciSil(String silinecekOgrenci) {
        
        String[]temp = new String[ogrenciler.length-1];
        int silinecekOgrenciIndex = 0;
        
        for (int i = 0; i < ogrenciler.length; i++) {
            if (silinecekOgrenci == ogrenciler[i]) {
                silinecekOgrenciIndex = i;
                break;
            }
        }
        
        for (int i = 0, k = 0; i < ogrenciler.length; i++) {
            if (i != silinecekOgrenciIndex) {
                temp[k] = ogrenciler[i];
                k++;
            }
        }
        ogrenciler = new String[temp.length];
        ogrenciler = temp;
        return ogrenciler;
    }
}
