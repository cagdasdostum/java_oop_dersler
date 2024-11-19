/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visibility_modifiers_2.deneme;

/**
 *
 * @author cagda
 */
public class A {
        
    public String msg = "Sınıfın dışından sınıfa ait public bir değişkene erişildi";
    
    String info;    //default tanımlanmış
    
    public void Display() {
        System.out.println("Sınıfın dışından public bir methoda erişildi");
        
        System.out.println(info);
    }
    public A(String info) {
        this.info = info;
    }
}
