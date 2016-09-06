/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;
import java.util.Random;
/**
 *
 * @author Mik
 */
public class Coin {
    private String sideUp;
    
    public Coin(){
        toss();
    }
    
    public void toss(){
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num==0)
            sideUp = "heads";
        else sideUp = "tails";
    }
    public String getSideUp(){
        return sideUp;
    }
}
