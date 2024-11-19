/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.visibility_modifiers;

/**
 *
 * @author cagda
 */
public class Visibility_Modifiers {

    public static void main(String[] args) {
        A a1 = new A("sınıfın dışından public bir yapıcı metoda erişildi");
        System.out.println(a1.msg);
        
        a1.Display();
    }
}

class A {
    
    public String msg = "Sınıfın dışından sınıfa ait public bir değişkene erişildi";
    
    String info;
    
    public void Display() {
        System.out.println("Sınıfın dışından public bir methoda erişildi");
        
        System.out.println(info);
    }
    public A(String info) {
        this.info = info;
    }
}
