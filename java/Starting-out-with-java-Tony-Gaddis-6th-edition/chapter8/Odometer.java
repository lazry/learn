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
public class Odometer {
    private double mileage;
    private FuelGauge gauge;
    
    public Odometer(double mileage, FuelGauge gauge){
        this.gauge =  new FuelGauge(gauge);
        this.mileage = mileage;
    }
    public double getMileage(){
        return mileage;
    }
    public double getGallons(){
        double gal = gauge.getGallons();
        return gal;
    }
    public void addMileage(){
        if(mileage == 999999)
            mileage = 0;
        else mileage++;
        if(mileage%24==0){
            gauge.burnGallon();
        }
    }
}
