/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thiskullanimi;

/**
 *
 * @author cagda
 */
public class ThisKullanimi {

    
    int i = 5;
    static double k = 0;
    
    ThisKullanimi() {
        this(3);
    }
    
    ThisKullanimi(int i) {
        this.i = i;
    }
    
    void setValue(int i) {
        this.i = i;
    }
    
    void setKValue(double k) {
        ThisKullanimi.k = k;    // static değişkene "this.k = k" yerine "class_adi.k = k" şeklinde ulaşıyoruz.
        
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ThisKullanimi this1 = new ThisKullanimi();
        ThisKullanimi this2 = new ThisKullanimi();
        
        this1.setValue(7);
        this2.setValue(14);
        this1.setKValue(41);
        this2.setKValue(66);
        
        System.out.println("this1 için i değeri: " + this1.i);
        System.out.println("this1 için k değeri: " + ThisKullanimi.k);
        
        System.out.println("this2 için i değeri: " + this2.i);
        System.out.println("this2 için k değeri: " + ThisKullanimi.k);
        
    }
}
