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
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    public RetailItem(String d, int uOH, double p){
        description = d;
        unitsOnHand = uOH;
        price = p;
    }
    
    public void setDescription(String d){
        description = d;
    }
    public void setUnitsOnHand(int uOH){
        unitsOnHand = uOH;
    }
    public void setPrice(double p){
        price = p;
    }
    public String getDescription(){
        return description;
    }
    public int getUnitsOnHand(){
        return unitsOnHand;
    }
    public double getPrice(){
        return price;
    }
}
