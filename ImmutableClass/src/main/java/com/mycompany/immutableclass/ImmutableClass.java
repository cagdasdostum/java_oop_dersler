/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.immutableclass;

import java.util.*;

/**
 *
 * @author cagda
 */
public class ImmutableClass {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Student stu1 = new Student(1049, "Çağdaş");
        Date gelentarih = stu1.getDate();
        gelentarih.setTime(4000);
        System.out.println(stu1.getDate());
    }
}

class Student {
    
    private int id;
    private String name;
    private Date tarih;
    
    Student() {
        
    }
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        tarih = new Date();
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Date getDate() {
        return tarih;
    }
}
