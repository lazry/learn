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
public class FuelGauge {
    private int gallons;
    
    public FuelGauge(int g){
        gallons = g;
    }
    public FuelGauge(FuelGauge g){
        this.gallons = g.gallons;
    }
    public void addGallon(){
        if(gallons<15)
            gallons++;
        else
            System.out.println("The gauge is full!");
    }
    public void burnGallon(){
        if(gallons>0)
            gallons--;
        else
            System.out.println("The gauge is empty!");
    }
    public int getGallons(){
        return gallons;
    }
}
