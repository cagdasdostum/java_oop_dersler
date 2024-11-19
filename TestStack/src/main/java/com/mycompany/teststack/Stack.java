/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teststack;

/**
 *
 * @author cagda
 */
public class Stack {
    
    private int[] elements;
    private int size;
    
    public static final int DEFAULT_CAPACITY = 16;
    
    Stack() {
        this(DEFAULT_CAPACITY);
        System.out.println("size:" + size);
        
    }
    
    Stack(int size) {
        elements = new int[size];
    }
    
    public void push(int value) {
        if(size >= elements.length) {
            int[] temp = new int [elements.length * 2];
            
            System.arraycopy(elements, 0, temp, 0, elements.length);
            
            elements = temp;
        }
        
        elements[size++] = value;
    }
}
