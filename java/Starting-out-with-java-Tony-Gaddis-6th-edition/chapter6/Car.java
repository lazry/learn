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
public class Car {
    private int yearModel, speed;
    private String make;
    
    public Car(int yM, String m){
        yearModel = yM;
        make = m;
        speed = 0;
    } 
    
    public int getYearModel(){
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }
    
    public void accelerate(){
        speed+=5;
    }
    public void brake(){
        speed-=5;
    }
}
