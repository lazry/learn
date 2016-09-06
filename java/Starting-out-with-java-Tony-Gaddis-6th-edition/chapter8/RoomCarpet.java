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
public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;
    
    public RoomCarpet(RoomDimension dim, double cost){
        size = new RoomDimension(dim.getLength(), dim.getWidth());
        carpetCost = cost;
    }
    public double getTotalCost(){
        return size.getArea()*carpetCost;
    }
    public String toString(){
        String str = String.format("Room area: %f.\tCarpet cost: %,.2f", 
                size.getArea(), carpetCost);
        return str;
    }
}
