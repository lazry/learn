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
public class Square {
    private double sideLength;
    
    public Square()
    {
        sideLength = 0.0;
    }
    public Square(double s)
    {
        sideLength = s;
    }
    
    public double getArea()
    {
        return sideLength * sideLength;
    }
    public double getSideLength()
    {
        return sideLength;
    }
}
