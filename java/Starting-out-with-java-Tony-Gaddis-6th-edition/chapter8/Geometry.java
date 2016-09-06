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
public class Geometry {
    
    public static double getAreaCircle(double r){
        double outcome = Math.PI*r*r;
        if(r<0){
            System.out.println("Error.");
            outcome = 0;
        }
        return outcome;
    }
    public static double getAreaRectangle(double w, double l){
        double outcome = w*l;
        if(w<0 || l<0){
            System.out.println("Error.");
            outcome = 0;
        }
        return outcome;
    }
    public static double getAreaTriangle(double b, double h){
        double outcome = b*h*0.5;
        if(b<0 || h<0){
            System.out.println("Error.");
            outcome = 0;
        }
        return outcome;
    }
}
