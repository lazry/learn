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
public class Temperature {
    private double ftemp;
    
    public Temperature(double ft){
        ftemp = ft;
    }
    
    public void setFahrenheit(double ft){
        ftemp = ft;
    }
    public double getFahrenheit(){
        return ftemp;
    }
    public double getCelsius(){
        return (5.0/9.0)*(ftemp-32.0);
    }
    public double getKelvin(){
        return (5.0/9.0)*(ftemp-32.0)+273.0;
    }
}
