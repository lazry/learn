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
public class Payroll {
    private String name;
    private int idNum, hoursWorked;
    private double hourPayRate;
    
    public Payroll(String n, int iN){
        name = n;
        idNum = iN;
        hoursWorked = 0;
        hourPayRate = 0.0;
    }
    
    public void setHours(int hW){
        hoursWorked = hW;
    }
    public void setPayRate(double hPR){
        hourPayRate = hPR;
    }
    
    public String getName(){
        return name;
    }
    public int getIdNum(){
        return idNum;
    }
    public int getHours(){
        return hoursWorked;
    }
    public double getParRate(){
        return hourPayRate;
    }
    public double getGrossPay(){
        return hoursWorked*hourPayRate;
    }
}
