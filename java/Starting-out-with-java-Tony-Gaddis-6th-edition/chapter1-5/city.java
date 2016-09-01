/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

/**
 *
 * @author Mik
 */
/** this is some kind of shitty program. */
public class city {
    /** something is definitely happening here but im not sure what is it. */
    public static void main(String[] args){
        String city = "San Francisco";
        int stringLength = city.length();
        char oneChar = city.charAt(0);
        String upperCity = city.toUpperCase();
        String lowerCity = city.toLowerCase(); 
        
        System.out.println(city + stringLength + oneChar + upperCity + lowerCity);
        
        double number = 5.435348556E4;
        String name = "James";
        System.out.printf("%-20s", name);
        
       int x = 19;
       if (!(x > 20)) System.out.println("smaller");
    }
}
