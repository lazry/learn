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
public class Area {
    public static double getArea(double radius){
        return Math.PI*radius*radius;
    }
    public static int getArea(int width, int length){
        return width*length;
    }
    public static double getArea(double radius, double height){
        return Math.PI*radius*radius*height;
    }
}
