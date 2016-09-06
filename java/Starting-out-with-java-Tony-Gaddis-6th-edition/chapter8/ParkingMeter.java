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
public class ParkingMeter {
    private int minPurchased;
    
    public ParkingMeter(int mP){
        minPurchased = mP;
    }
    public int getMin(){
        return minPurchased;
    }
}
