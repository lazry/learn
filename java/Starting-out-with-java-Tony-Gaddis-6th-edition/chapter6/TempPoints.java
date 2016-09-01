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
public class TempPoints {
    private double temperature;
    
    public TempPoints(double t){
        temperature = t;
    }
    
    public void setTemp(double t){
        temperature = t;
    }
    public double getTemp(){
        return temperature;
    }
    
    public boolean isEthylFreezing(){
        return temperature<=(-173);
    }
    public boolean isEthylBoiling(){
        return temperature>=172;
    }
    public boolean isOxygenFreezing(){
        return temperature<=(-362);
    }
    public boolean isOxygenBoiling(){
        return temperature>=306;
    }
    public boolean isWaterFreezing(){
        return temperature<=32;
    }
    public boolean isWaterBoiling(){
        return temperature>=212;
    }
}
