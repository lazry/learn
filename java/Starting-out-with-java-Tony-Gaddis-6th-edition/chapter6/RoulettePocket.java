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
public class RoulettePocket {
    private int pocketNumber;
    
    public RoulettePocket(int pN) {
        pocketNumber = pN;
    }
    
    public String getPocketColor(){
        String color = null;
        if(pocketNumber == 0)
            color = "green";
        else if(pocketNumber>0 && pocketNumber<11){
            if(pocketNumber%2 == 0)
                color = "black";
            else color = "red";  
        }
        else if(pocketNumber>10 && pocketNumber<19){
            if(pocketNumber%2 == 0)
                color = "red";
            else color = "black";
        }
        else if(pocketNumber>18 && pocketNumber<29){
            if(pocketNumber%2 == 0)
                color = "black";
            else color = "red";  
        }
        else if(pocketNumber>28 && pocketNumber<37){
            if(pocketNumber%2 == 0)
                color = "red";
            else color = "black";
        }
        else color = "Error!";
        return color;
    }
}
