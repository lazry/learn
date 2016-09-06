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
public class CashRegister {
    private RetailItem item;
    private int quantitySold;
    
    public CashRegister(RetailItem item, int quantity){
        quantitySold = quantity;
        this.item = new RetailItem(item);
    }
    
    public int getQuantity(){
        return quantitySold;
    }
    public double getSubtotal(){
        return item.getPrice()*quantitySold;
    }
    public double getTax(){
        return item.getPrice()*quantitySold*6/100;
    }
    public double getTotal(){
        return getSubtotal()+getTax();
    }
}
