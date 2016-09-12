/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Mik
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException{
        /*
        1.
        String str = "i love garlic breathe!";
        backward(str);
    }
    public static void backward(String str){
        for(int i = (str.length()-1); i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
        2.
        String str = "i need a puss... a cat.";
        System.out.println(wordCounter(str));
    }
    public static int wordCounter(String str){
        String[] words = str.split(" ");
        return words.length;
    }
        3.
        String str = "when i . place a dot. it does the trick. heh.";
        System.out.println(sentenceCap(str));
    }
    public static String sentenceCap(String str){
        StringBuilder strB = new StringBuilder(str);
        if(Character.isLetterOrDigit(str.charAt(0)));
            strB.setCharAt(0, Character.toUpperCase(str.charAt(0)));
            
        int i = 0;
        while (i<(str.length()-2)){
            i++;
            if(str.charAt(i)== '.'){
                i+=2;
                strB.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return strB.toString();
    }
        4.
        Scanner keyboard = new Scanner(System.in);
        vowelsConsonants strVC;
        char exit = 0;
        String str;
        System.out.println("Enter a string.");
        str = keyboard.nextLine();
        strVC = new VowelsConsonants(str);
        do{
            exit = menu();
            if(Character.toUpperCase(exit) == 'D'){
                do{
                    System.out.println("Enter a string.");
                    str = keyboard.nextLine();
                    strVC = new VowelsConsonants(str);
                    exit = menu();
                }while(Character.toUpperCase(exit) == 'D');
                action(strVC, exit);
            }
            else action(strVC, exit);
        }while(Character.toUpperCase(exit) != 'E');
    }
    public static char menu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("a. Count the number of vowels in the string\n" +
                    "b. Count the number of consonants in the string\n" +
                    "c. Count both the vowels and consonants in the string\n" +
                    "d. Enter another string\n" +
                    "e. Exit the program\n");
        String ans = keyboard.nextLine();
        return ans.charAt(0);
    }
    public static void action(VowelsConsonants obj, char ch){
        switch (Character.toUpperCase(ch)) {
            case 'A':
                System.out.println("Vowels: "+obj.getVowels());
                break;
            case 'B':
                System.out.println("Consonants: "+obj.getConsonants());
                break;
            case 'C':
                System.out.println("Vowels and consonants: "+
                        (obj.getVowels()+obj.getConsonants()));
                break;
            default:
                break;
        }
    }
        5.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a password");
        String input = keyboard.nextLine();
        if(PasswordVer.verify(input))
            System.out.println("Your password is valid.");
        else
            System.out.println("Your password is invalid.");
        
        6.
        Scanner keyboard = new Scanner(System.in);
        String[] names = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String[] numbers = {"555-2234", "555-9098", "555-1785", "555-9224"};
        System.out.println("Enter first few characters or full name.");
        String search = keyboard.nextLine();
        find(names, numbers, search);
    }
    public static void find(String[] n, String[] num, String s){
        for(int i = 0; i<n.length; i++){
            if(n[i].startsWith(s))
                System.out.println(n[i]+": "+num[i]);
        }
    }
        
        7.*/
        
                
        /*8.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter series of numbers separated with commas.");
        String input = keyboard.nextLine();
        String[] numbers = input.split(",");
        int sum = 0;
        for(String number:numbers){
            sum+=Integer.parseInt(number);
        }
        System.out.println("Sum: "+sum);
        
        9.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter series of digits.");
        String input = keyboard.nextLine();
        String[] numbers = input.split("");
        int sum = 0;
        for(String number:numbers){
            sum+=Integer.parseInt(number);
        }
        System.out.println("Sum: "+sum);
        
        10.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of file to read from it.");
        String input = keyboard.nextLine();
        File file = new File(input);
        Scanner inputFile = new Scanner(file);
        int sum = 0;
        String input2;
        do{
            input2 = inputFile.nextLine();
            String[] words = input2.split("[ \t]");
            for(String word:words){
                sum++;
            }
        }while(inputFile.hasNext());
        System.out.println(sum);
        
        11.
        File file = new File("SalesData.txt");
        Scanner inputFile = new Scanner(file);
        String[] week;
        Double[][] sales = new Double[4][7];
        int row = 0;
        while(inputFile.hasNextLine()){
            week = inputFile.nextLine().split(",");
            for(int j = 0; j<7; j++){
                sales[row][j] = Double.parseDouble(week[j]);
            }
            row++;
        }
        inputFile.close();
        totalForEach(sales);
        averDailyForEach(sales);
        totalSales(sales);
        averWeekly(sales, 4);
        weekHighest(sales);
        weekLowest(sales);
    }
    public static void totalForEach(Double[][] s){
        double total;
        for(int row = 0; row<s.length; row++){
            total = 0.0;
            for(int col = 0; col<s[row].length; col++){
                total += s[row][col];
            }
            System.out.println("Total sales for week "+(row+1)+": $"+total);
        }
    }
    public static void averDailyForEach(Double[][] s){
        double total;
        for(int row = 0; row<s.length; row++){
            total = 0.0;
            for(int col = 0; col<s[row].length; col++){
                total += s[row][col];
            }
            System.out.println("Average daily sales for week "+(row+1)+": $"+
                    (total/7.0));
        }
    }
    public static void totalSales(Double[][] s){
        double total = 0.0;
        for(int row = 0; row<s.length; row++){
            for(int col = 0; col<s[row].length; col++){
                total += s[row][col];
            }
        }
        System.out.println("Total sales for all weeks: $"+total);
    }
    public static void averWeekly(Double[][] s, int w){
        double total = 0.0;
        for(int row = 0; row<s.length; row++){
            for(int col = 0; col<s[row].length; col++){
                total += s[row][col];
            }
        }
        System.out.println("Average weekly sales: $"+(double)total/w);
    }
    public static void weekHighest(Double[][] s){
        double total, totalMax = 0.0;
        int weekIndex = 0;
        
        for(int row = 0; row<s.length; row++){
            total = 0.0;
            for(int col = 0; col<s[row].length; col++){
                total += s[row][col];
            }
            if(total>totalMax){
                    weekIndex = row+1;
                    totalMax = total;
                }
        }
        System.out.println("Week with highest amount of sales "+weekIndex);
    }
    public static void weekLowest(Double[][] s){
        double total, totalMin = 9999999.0;
        int weekIndex = 0;
        
        for(int row = 0; row<s.length; row++){
            total = 0.0;
            for(int col = 0; col<s[row].length; col++){
                total += s[row][col];
            }
            if(total<totalMin){
                    weekIndex = row+1;
                    totalMin = total;
                }
        }
        System.out.println("Week with lowest amount of sales "+weekIndex);
    }
        
        12.
        String str1 = "jabba habba\ttaba\nnappa";
        String str2 = "bb";
        String str3 = "666";
        char[] array = { 'f', 'u', 'c', 'k', ' ', 'T', 'H', '3', ' ', 'w', 'o', 'r',
            'l', 'd', '!'};
        
        System.out.println(StringOperations.WordCount(str1)+"\n"+
                            StringOperations.arrayToString(array)+"\n"+
                            StringOperations.mostFrequent(str1)+"\n"+
                            StringOperations.replaceSubstring(str1, str2, str3));
        
        13.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 10-character telephone number in format XXX-XXX"
                + "-XXXX.");
        String input = keyboard.nextLine();
        char num;
        StringBuilder number = new StringBuilder(input);
        for(int i = 0; i<number.length(); i++){
            num = number.charAt(i);
            if(Character.isLetter(num)){
                number.deleteCharAt(i);
                number.insert(i, modify(num));
            }
        }
        System.out.println(number.toString());
    }
    public static char modify(char c){
        char num = 0;
        switch(c){
            case 'A':
            case 'B':
            case 'C':
                num = '2';
                break;
            case 'D':
            case 'E':
            case 'F':
                num = '3';
                break;
            case 'G':
            case 'H':
            case 'I':
                num = '4';
                break;
            case 'J':
            case 'K':
            case 'L':
                num = '5';
                break;
            case 'M':
            case 'N':
            case 'O':
                num = '6';
                break;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                num = '7';
                break;
            case 'T':
            case 'U':
            case 'V':
                num = '8';
                break;
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                num = '9';
                break;
        }
        return num;
    }
        
        14.
        String str = "StopAndSmellMyDick.";
        StringBuilder strb = new StringBuilder(str);
        char ch;
        for(int i = 1; strb.charAt(i) != '.'; i++){
            if(Character.isUpperCase(strb.charAt(i))){
                ch = Character.toLowerCase(strb.charAt(i));
                strb.setCharAt(i, ch);
                strb.insert(i, ' ');
            }
        }
        System.out.println(strb.toString());
        
        15.
        String str = "I ATE A BANANA IN MY PRIVATE CRUISER";
        String[] tokens = str.split(" ");
        str = "";
        StringBuilder strb; 
        char ch;
        for(String token: tokens){
            strb = new StringBuilder(token);
            ch = strb.charAt(0);
            strb.deleteCharAt(0);
            strb.append(ch).append("AY ");
            token = strb.toString();
            str += token;
        }
        System.out.println(str);
        
        16.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string to convert it into morse code.");
        String input = keyboard.nextLine();
        String output = "";
        char[] chars = input.toCharArray();
        for(int i = 0; i<chars.length; i++){
            output += convert(chars[i]);
        }
        System.out.println(output);
    }
    public static String convert(char ch){
        String out = "";
        switch(ch){
            case ' ':
                out = " ";
                break;
            case ',':
                out = "--..--";
                break;
            case '.':
                out = ".-.-.-";
                break;
            case '?':
                out = "..--..";
                break;
            case '0':
                out = "-----";
                break;
            case '1':
                out = ".----";
                break;
            case '2':
                out = "..---";
                break;
            case '3':
                out = "...--";
                break;
            case '4':
                out = "....-";
                break;
            case '5':
                out = ".....";
                break;
            case '6':
                out = "-....";
                break;
            case '7':
                out = "--...";
                break;
            case '8':
                out = "---..";
                break;
            case '9':
                out = "----.";
                break;
            case 'A':
                out = ".-";
                break;
            case 'B':
                out = "-...";
                break; 
            case 'C':
                out = "-.-.";
                break;
            case 'D':
                out = "-..";
                break;
            case 'E':
                out = ".";
                break;
            case 'F':
                out = "..-.";
                break;
            case 'G':
                out = "--.";
                break;
            case 'H':
                out = "....";
                break;
            case 'I':
                out = "..";
                break;
            case 'J':
                out = ".---";
                break;
            case 'K':
                out = "-.-";
                break;
            case 'L':
                out = ".-..";
                break;
            case 'M':
                out = "--";
                break;
            case 'N':
                out = "-.";
                break;
            case 'O':
                out = "---";
                break;
            case 'P':
                out = ".--.";
                break;
            case 'Q':
                out = "--.-";
                break;
            case 'R':
                out = ".-.";
                break;  
            case 'S':
                out = "...";
                break;
            case 'T':
                out = "-";
                break;
            case 'U':
                out = "..-";
                break;
            case 'V':
                out = "...-";
                break;
            case 'W':
                out = ".--";
                break;
            case 'X':
                out = "-..-";
                break;
            case 'Y':
                out = "-.--";
                break;
            case 'Z':
                out = "--..";
                break; 
        }
        return out;*/
    }
}
