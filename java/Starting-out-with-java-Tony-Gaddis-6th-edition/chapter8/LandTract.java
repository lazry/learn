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
public class LandTract {
    private double length;
    private double width;
    
    public LandTract(double l, double w){
        length = l;
        width = w;
    }
    
    public double getArea(){
        return length*width;
    }
    public boolean equals(LandTract tract){
        boolean is = false;
        if(this.getArea()==tract.getArea())
            is = true;
        return is;
    }
    public String toString(){
        String str = String.format("Length: %f.\tWidth: %f.", length, width);
        return str;
    }
}
