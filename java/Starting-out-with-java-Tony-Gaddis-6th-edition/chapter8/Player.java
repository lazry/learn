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
public class Player {
    private int points = 50;
    private String playerName;
    private Die die;
    
    public Player(String pN, Die die){
        playerName = pN;
        this.die = new Die(die);
    }
    
    public boolean changePoints(){
        boolean end = false;
        die.roll();
        if(points - die.getValue()==1){
            points -= die.getValue();
            end = true;
        }
        else if(points - die.getValue()<1)
            points += die.getValue();
        else
            points -= die.getValue();
        return end;
    }
    
    public String getName(){
        return playerName;
    }
    public String toString(){
        String str = String.format("Player "+playerName+" rolled "+die.getValue()+
                " and has "+points+" points.");
        return str;
    }
    
}
