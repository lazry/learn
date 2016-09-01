/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import java.util.Random;

/**
 *
 * @author Mik
 */
public class Lottery {
    int[] lotteryNumbers = new int[5];
    
    public Lottery(){
        Random rand = new Random();
        for(int row = 0; row<lotteryNumbers.length; row++){
            lotteryNumbers[row] = rand.nextInt(9);
        }
    }
    public int lotteryPicks(int[] picks){
        int match = 0, i = 0;
        do{
            for(int number : lotteryNumbers){
                if(picks[i] == number){
                    match++;
                    i++;
                }
            }
        }while(i<picks.length);
        return match;
    }
    public void getLotteryNum(){
        for(int num : lotteryNumbers)
            System.out.println(num+" ");
    }
}
