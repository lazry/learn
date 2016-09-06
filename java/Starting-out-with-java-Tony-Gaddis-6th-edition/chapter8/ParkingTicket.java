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
public class ParkingTicket {
    //the things to report
    private ParkedCar car;
    private int fine, badgeNum;
    private String officerName;
    
    public ParkingTicket(int f, int b, String o, ParkedCar car){
        this.car = new ParkedCar(car);
        fine = f;
        badgeNum = b;
        officerName = o;
    }
    
    public int getFine(){
        return fine;
    }
    public String toString(){
        String str = String.format("Officer %s num.%d\n%s"
                + "\nFine: $%d", officerName, badgeNum, car.toString(), fine);
        return str;
    }
}
