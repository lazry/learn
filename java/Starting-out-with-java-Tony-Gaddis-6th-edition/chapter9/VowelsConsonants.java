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
public class VowelsConsonants {
    private String str;
    
    public VowelsConsonants(String str){
        this.str = str;
    }
    
    public int getVowels(){
        int total = 0;
        for(int i = 0; i<str.length(); i++){
            if(isVowel(i))
                total++;
        }
        return total;
    }
    public int getConsonants(){
        int total = 0;
        for(int i = 0; i<str.length(); i++){
            if(!isVowel(i) && Character.isLetter(str.charAt(i)))
                total++;
        }
        return total;
    }
    public boolean isVowel(int i){
        boolean is = false;
        if(Character.toUpperCase(str.charAt(i)) == 'A' ||
                Character.toUpperCase(str.charAt(i)) == 'E'||
                Character.toUpperCase(str.charAt(i)) == 'I'||
                Character.toUpperCase(str.charAt(i)) == 'O'||
                Character.toUpperCase(str.charAt(i)) == 'U')
                is = true;
        return is;
    }
}
