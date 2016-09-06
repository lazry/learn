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
public class Player2 {
    private String playerName;
    private int points;
    private Coin coin;
    
    public Player2(String n){
        playerName = n;
        points = 0;
        this.coin = new Coin();
    }
    public String getName(){
        return playerName;
    }
    public int getPoints(){
        return points;
    }
    
    public boolean round(String guess){
        boolean win = false;
        if(coin.getSideUp().equalsIgnoreCase(guess))
            points++;
        else points--;
        if(points==5)
            win = true;
        return win;
    }
    public String toString(){
        String str = String.format("Player "+playerName+" has thrown "+coin.getSideUp()
        +" and has "+points+" points.");
        return str;
    }
}
