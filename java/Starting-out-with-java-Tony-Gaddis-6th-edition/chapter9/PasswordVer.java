/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Mik
 */
public class PasswordVer {
    public static boolean verify(String str){
        boolean valid = false;
        boolean num = false, low = false, up = false;
        if(str.length()<6);
        else{
            for(int i = 0; i<str.length(); i++){
                if(Character.isDigit(str.charAt(i)))
                    num = true;
                else if(Character.isUpperCase(str.charAt(i)))
                    up = true;
                else if(Character.isLowerCase(str.charAt(i)))
                    low = true;
            }
            if(num&&up&&low)
                valid = true;
        }
        return valid;
    }
}
