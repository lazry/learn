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
public class RoomDimension {
    private double length;
    private double width;
    
    public RoomDimension(double l, double w){
        length = l;
        width = w;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length*width;
    }
    public String toString(){
        String str = String.format("Length: %f.\tWidth: %f.", this.getLength(), 
                this.getWidth());
        return str;
    }
}
