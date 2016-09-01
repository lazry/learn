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
public class RainFall {
    double[] rainfall = new double[12];
    
    public RainFall(double[] array){
        for(int i = 0; i<array.length; i++)
            rainfall[i] = array[i];
    }
    public double annualRain(){
        double annual = 0;
        for(double month: rainfall)
            annual += month;
        return annual;
    }
    public double monthAverage(){
        return annualRain()/12.0;
    }
    public int monthMostRain(){
        int monthNum = 1;
        double month = rainfall[0];
        for(int i = 1; i<rainfall.length; i++){
            if(month<rainfall[i]){
                month = rainfall[i];
                monthNum = i+1;
            }
        }     
        return monthNum;
    }
    public int monthLeastRain(){
        int monthNum = 1;
        double month = rainfall[0];
        for(int i = 1; i<rainfall.length; i++){
            if(month>rainfall[i]){
                month = rainfall[i];
                monthNum = i+1;
            }
        }     
        return monthNum;
    }
}
