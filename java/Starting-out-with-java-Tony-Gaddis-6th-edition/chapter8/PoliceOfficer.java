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
public class PoliceOfficer {
    private String officerName;
    private int badgeNum;
    
    public PoliceOfficer(String officerName, int badgeNum){
        this.officerName = officerName;
        this.badgeNum = badgeNum;
    }
    public ParkingTicket examine(ParkedCar car, ParkingMeter ticket){
        ParkingTicket newTicket = null;
        if(car.getMin()>ticket.getMin())
            newTicket = new ParkingTicket(fine(car, ticket), badgeNum, officerName, car);
        else
            newTicket = new ParkingTicket(0, badgeNum, officerName, car);
        return newTicket;
    }
    
    public static int fine(ParkedCar car, ParkingMeter ticket){
        int fine = 0, hours = 0;
        int min = car.getMin()-ticket.getMin();
        if(min%60 > 0)
            hours++;
        min -= min%60;
        hours += min/60;
        if(hours>1)
            fine = 25+10*(hours-1);
        else fine = 25;
        return fine;
    }
}
