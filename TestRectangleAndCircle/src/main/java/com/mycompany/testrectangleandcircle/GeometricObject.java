/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testrectangleandcircle;
import java.util.*;
/**
 *
 * @author cagda
 */
public class GeometricObject {
    
    private String color = "beyaz";
    private boolean filled;
    private Date dateCreated;
    
    GeometricObject() {
        dateCreated = new Date();
        
    }
    
    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String value) {
        this.color = value;
    }
        public boolean getFilled() {
        return filled;
    }
    public void setFilled(boolean value) {
        this.filled = value;
    }
    public Date getDate() {
        return dateCreated;
    }
    public void setDate(Date value) {
        this.dateCreated = value;
    }
    
    public String toString() {
        return dateCreated+" tarihinde oluşturuldu.\nrenk: " + color + "\n" + "doluluk durumu: " + filled;
        
    }
}
