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
public class PhoneBookEntry {
    String name;
    int phoneNum;
    
    public PhoneBookEntry(String n, int pN){
        name = n;
        phoneNum = pN;
    }
    public void setName(String n){
        name = n;
    }
    public void setNum(int pN){
        phoneNum = pN;
    }
    public String getName(){
        return name;
    }
    public int getNum(){
        return phoneNum;
    }
}
