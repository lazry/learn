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
public class TestScores {
    private int one, two, three;
    
    public TestScores(){
        one = 0;
        two = 0;
        three = 0;
    }
    
    public void setScoreOne(int o){
        one = o;
    }
    public void setScoreTwo(int t){
         two = t;
    }
    public void setScoreThree(int th){
        three = th;
    }
    public int getScoreOne(){
        return one;
    }
    public int getScoreTwo(){
        return two;
    }
    public int getScoreThree(){
        return three;
    }
    public double getAverage(){
        return (one+two+three)/3.0;
    }
}
