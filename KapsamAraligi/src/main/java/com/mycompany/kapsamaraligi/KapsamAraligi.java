/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kapsamaraligi;

/**
 *
 * @author cagda
 */
public class KapsamAraligi {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Foo f = new Foo();
    }
}

class Foo {
    private int x = 0;
    private int y = 0;
    private int i;
    private int j = i + 2;
    
    Foo() {
        int x = 1;
        System.out.println("x in constructor: " + x);
        System.out.println("y in constructor: " + y);
        System.out.println("x in Foo class: " + this.x);
        this.i = 5;
        System.out.println(j);
    }
}
