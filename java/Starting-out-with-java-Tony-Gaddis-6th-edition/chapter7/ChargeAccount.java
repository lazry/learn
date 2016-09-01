/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Mik
 */
public class ChargeAccount {
    //for 3.
    /*String[] chargeCodes = {"5658845", "4520125", "7895122", "8777541", "8451277", 
"1302850", "8080152", "4562555", "5552012", "5050552", "7825877", "1250255", 
"1005231", "6545231", "3852085", "7576651", "7881200", "4581002"};*/
    
    //for 4. 
    ArrayList<String> chargeCodes = new ArrayList<>(20);
    
    public ChargeAccount() throws IOException{
        File file = new File("ValidCodes.txt");
        Scanner inputFile = new Scanner(file);
        while(inputFile.hasNext()){
            chargeCodes.add(inputFile.next());
        }
    }
    public boolean validation(String num){
        boolean valid = false;
        for(String charge : chargeCodes){
            if(charge.equals(num))
                valid = true;
        }
        return valid;
    }
}
