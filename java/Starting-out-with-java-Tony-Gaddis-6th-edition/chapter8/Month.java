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
public class Month {
    private int monthNumber;
    
    public Month(){
        monthNumber = 1;
    }
    public Month(int m){
        if(m>0 || m<13)
            monthNumber = m;
        else
            monthNumber = 1;
    }
    public Month(String m){
        //i used this method because enum is case sensitive
        int num = 1;
        if(m.equalsIgnoreCase("January"))
            num = 1;
        else if(m.equalsIgnoreCase("February"))
            num = 2;
        else if(m.equalsIgnoreCase("March"))
            num = 3;
        else if(m.equalsIgnoreCase("April"))
            num = 4;
        else if(m.equalsIgnoreCase("May"))
            num = 5;
        else if(m.equalsIgnoreCase("June"))
            num = 6;
        else if(m.equalsIgnoreCase("July"))
            num = 7;
        else if(m.equalsIgnoreCase("August"))
            num = 8;
        else if(m.equalsIgnoreCase("September"))
            num = 9;
        else if(m.equalsIgnoreCase("October"))
            num = 10;
        else if(m.equalsIgnoreCase("November"))
            num = 11;
        else if(m.equalsIgnoreCase("December"))
            num = 12;
        monthNumber = num;        
    }
    
    public void setMonthNumber(int m){
        if(m>0 || m<13)
            monthNumber = m;
        else
            monthNumber = 1;
    }
    public int getMonthNumber(){
        return monthNumber;
    }
    public String getMonthName(){
        String month = null;
        switch(monthNumber){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "Sptember";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
    }
    public String toString(){
        return String.format("The number of month is: %d.", monthNumber);
    }
    public boolean equals(Month month){
        boolean is = false;
        if(this.getMonthNumber()==month.getMonthNumber())
            is = true;
        return is;
    }
    public boolean greaterThan(Month month){
        boolean is = false;
        if(this.getMonthNumber()>month.getMonthNumber())
            is = true;
        return is;
    }
    public boolean lessThan(Month month){
        boolean is = false;
        if(this.getMonthNumber()<month.getMonthNumber())
            is = true;
        return is;
    }
}
