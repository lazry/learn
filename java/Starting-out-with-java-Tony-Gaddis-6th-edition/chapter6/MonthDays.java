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
public class MonthDays {
    private int month, year;
    
    public int getNumberOfDays(int m, int y){
        int days = 0;
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if(y%100 == 0){
                    if(y%400 == 0){
                        days = 29;
                        break;
                    }
                    else{
                        days = 28;
                        break;
                    }
                }
                else if (y%4 == 0){
                    days = 29;
                    break;
                }
                else
                    days = 28;
                    break;
            default:
                return 0;                
        }
        return days;
        
    }
}

