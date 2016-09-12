/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;
import java.util.Scanner;
/**
 *
 * @author Mik
 */
public class chapter9 {
    public static void main(String[] args){
        /*
        checpoint
        1.
        char big = 'A';
        char little = Character.toLowerCase(big);
        System.out.println(little);
        2.
        char ch ='d';
        if(Character.isDigit(ch))
            System.out.println("digit");
        else System.out.println("not a digit");
        3. A
        4.
        Scanner keyboard = new Scanner(System.in);
        String input;
        char ans;
        do{
            System.out.println("Do you want to repeat the program or quit?(R/Q)");
            input = keyboard.nextLine();
            ans = input.charAt(0);
            ans = Character.toUpperCase(ans);
        }while(ans == 'R');
        5. $
        6.
        String str = "jaBBa hAbbA";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }
        System.out.println("There are "+count+" uppercase characters.");
        7.8.
        String str = "hungEr";
        System.out.println(String.valueOf(ending(str)));
    }
    public static boolean ending(String s){
        boolean is = false;
        String buffer = s.toLowerCase();
        if(buffer.endsWith("ger"))
        is = true;
        return is;
    }
        9. substring
        10. indexOf takes into account first occurence and lastIndexOf takes last
        11. in getChars substring is stored as an array and in substring as String
        12. concatenate
        13. in getChars you can choose where to start putting data
        14. he is wrong because replace method creates a copy of string and returns it
        15. WilliamtheConqueror
        16.
        double number = 9.47;
        String str = String.valueOf(number);
        System.out.println(str);
        17. it means that once the object is created it can't be changed
        18. in my opinion StringUilder because it offers a bigger variety of methods
        19. StringBuilder city = new StringBuilder("Asheville");
        20. append();
        21. inser();
        22. deleteCharAt();
        23. setCharAt();
        24. StringBuilder replaces a whole substring and String each char in the string
        25. tokens: apples, pears, bananas delimeter: space
        26. x = 4, first = "one"
        27.
        String str = "/home/rjones/mydata.jtxt";
        String[] tokens = str.split("[/.]");
        for(String token:tokens){
            System.out.println(token);
        }
        28.
        String str = "dog$cat@bird%squirrel";
        String[] tokens = str.split("[$@%]");
        for(String token:tokens){
            System.out.println(token);
        }
        29.
        int i = 99;
        String str = Integer.toString(i);
        System.out.println(str);
        30. methods: toBinaryString, toHexString, toOctalString
            members of: Integer Long
        31. they return maximum and minimum value that is possible to aquire in
        specified data type
        
        multiple choice
        1. c. 2. b. 3. a.
        4. a. 5. a. 6. c.
        7. b. 8. a. 9. d.
        10.b. 11.a. 12.c.
        13.d. 14.a. 15.F
        16.T  17.F  18.T
        19.T  20.F  21.T
        22.F  23.F
        
        find the error
        1. if (choice.toUpperCase == 'Y');
        2. 
        String str = " this is a test object ";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' ')
                count++;
        }
        System.out.println(count);
        3.
        String str = " 904 jj3jij *&^";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i)))
                count++;
        }
        System.out.println(count);
        4.
        String str = " 904 jj3IJj *&^";
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(Character.isLowerCase(str.charAt(i)))
                count++;
        }
        System.out.println(count);
        5.6.
        String str = "hasboobs.com";
        if(hasCom(str))
            System.out.println("it works");
    }
    public static boolean hasCom(String str){
        boolean is = false;
        if(str.regionMatches(true, (str.length()-4), ".com", 0, 4))
            is = true;
        return is;
    }
        7.
        StringBuilder str = new StringBuilder("tuTTi frutti!");
        upperT(str);
        System.out.println(str);
    }   
    public static void upperT(StringBuilder strB){
        for(int i = 0; i<strB.length(); i++){
            if(strB.charAt(i) == 't')
                strB.setCharAt(i, 'T');
        }
    }
        8.
        String str = "cookies>milk>fudge:cake:ice cream";
        String[] tokens = str.split("[>:]");
        for(String token : tokens)
            System.out.println(token);   
        9.
        String str, str2 = String.valueOf(Integer.MAX_VALUE);
        double d = 4, check = Double.parseDouble(str2);
        int i = 0;
        
        if(d<=check){
            
            i = (int)d;
        }
         System.out.println(i);
        10.
        int i = 943;
        System.out.println(Integer.toBinaryString(i)+"\n"+
                Integer.toHexString(i)+"\n"+
                Integer.toOctalString(i));
        
        short answer
        1. because it has more options to work on portions of strings
        2. to get rid of leading and trailing whitespaces
        3. returns a string representation of number referenced in argument
        4. using wrapper classes and final value MAX_VALUE and MIN_VALUE
        */
        
    }    
}
