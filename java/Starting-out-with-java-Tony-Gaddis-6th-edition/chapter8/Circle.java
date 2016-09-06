/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Mik
 */
public class Circle {
    private double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    public String toString(){
        String str = String.format("Radius: %s\tArea: %s\n", getRadius(), getArea());
        return str;
    }
    public boolean equals(Circle circle){
        boolean eq = false;
        if(this.radius == circle.radius)
            eq = true;
        return eq;                    
    }
    public boolean greaterThan(Circle circle){
        boolean gT = false;
        if(this.getArea() < circle.getArea())
            gT = true;
        return gT;
    }
}
