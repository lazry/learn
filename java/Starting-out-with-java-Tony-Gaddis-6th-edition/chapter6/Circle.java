/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author Mik
 */
public class Circle {
    private double radius;
    private final double PI = 3.14159;
    
    public Circle(double r){
        radius = r;
    }
    public Circle(){
        radius = 0.0;
    }
    
    public void setRadius(double r){
        radius = r;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getDiameter(){
        return radius*2.0;
    }
    public double getCircumference(){
        return radius*PI*2.0;
    }
}
