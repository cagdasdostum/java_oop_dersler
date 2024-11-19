/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.totalarea;

/**
 *
 * @author cagda
 */
public class Circle3 {
    
    private double radius = 1;
    
    private static int numberOfObjects = 0;
    
    public Circle3() {
        numberOfObjects++;
    }
    public Circle3(double new_radius) {
        radius = new_radius;
        numberOfObjects++;
        
    }
    
    public double getRadius() {
        return radius;
        
    }
    
    public void setRadius(double new_radius) {
        radius = (new_radius >= 0) ? new_radius : 0;
        
    }
    
    public static int getNumberOfObjects() {
        
        return numberOfObjects;
        
    }
    
    public double getArea() {
        
        return radius * radius * Math.PI;
    }
}
