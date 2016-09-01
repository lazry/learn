/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author Mik
 */
public class Payroll {
    int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    int[] hours = new int[7];
    double[] payRate = new double[7];
    double[] wages = new double[7];
    
    public void setHours(int emp, int num){
        hours[emp] = num;
    }
    public void setPayRate(int emp, double num){
        payRate[emp] = num;
    }
    public void setWages(int emp){
        wages[emp] = (double)(hours[emp]*payRate[emp]);
    }
    public int getId(int num){
        return employeeId[num];
    }
    public int getHours(int num){
        return hours[num];
    }
    public double getPayRate(int num){
        return payRate[num];
    }
    public void grossPay(int id){
        for(int i = 0; i<employeeId.length; i++)
            if(id==employeeId[i]){
                System.out.println("Employee with ID "+id+" has gross wage of $"
                +wages[i]);
            }  
    }
}
