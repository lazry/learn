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
public class ParkedCar {
    private String make, model, color;
    private int license, minParked;
    
    public ParkedCar(String m, String mo, String c, int l, int mP) {
        make = m;
        model = mo;
        color = c;
        license = l;
        minParked = mP;                
    }
    public ParkedCar(ParkedCar car){
        make = car.make;
        model = car.model;
        color = car.color;
        license = car.license;
        minParked = car.minParked;
    }
    
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getLicense(){
        return license;
    }
    public int getMin(){
        return minParked;
    }
    public String toString(){
        String str = String.format("Make: %s\tModel: %s\t Color: %s"
                + "\nLicense: %d\nMinutes parked: %d\n", make, model, color, 
                license, minParked);
        return str;
    }
}
