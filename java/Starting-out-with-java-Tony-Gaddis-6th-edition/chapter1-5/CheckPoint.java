/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Mik
 */
public class CheckPoint {
    public static void main(String[] args) throws IOException
    {
        Scanner keybord = new Scanner(System.in);
        /*
        int number;
        number = 712;
        System.out.println("The value is " + "number");
        
        ////////////////////////
        //Checkpoint
        //2.35
        ////////////////////////
        JOptionPane.showMessageDialog(null, "Greetings Earthling.");
        JOptionPane.showInputDialog("Enter a number.");
        System.exit(0);
        
        ////////////////////////
        //Checkpoint
        //2.36
        ////////////////////////
        int age;
        String str;
        str = JOptionPane.showInputDialog("Enter your age.");
        age = Integer.parseInt(str);
        System.out.println(age*2);
        
        ////////////////////////
        //review
        //2.6
        ////////////////////////
        System.out.println("Hearing in the distance\n");
        System.out.print("Two mandolins like creatures in the ");
        System.out.println("dark");
        System.out.println("\nCreating the agony of ecstasy.");
        System.out.println(" \t\t- George Barker
        
        ////////////////////////
        //review
        //2.13
        ////////////////////////
        String messag = "enter your desired annual income.";
        System.out.println(messag);
        Scanner input = new Scanner(System.in);
        double numberz = input.nextDouble();
        System.out.println(numberz-10);
        
        ////////////////////////
        //review
        //2.14
        ///////////////////////
        double wynik;
        String number1 = JOptionPane.showInputDialog("Eneter your desired annual income.");
        wynik = Double.parseDouble(number1);
        System.out.println(wynik*2);
        
        float total = 0;
        double number2 = 2.7;
        total = (float) number2;
        System.out.println(total);
        
        ////////////////////////
        //checkpoint
        //3.24
        ////////////////////////
        int userNum;
        
        System.out.println("Enter the one of numbers: 1, 2 or 3.");
        userNum = keybord.nextInt();
        
        switch(userNum){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Error.");
        }
        
        ////////////////////////
        //checkpoint
        //3.25
        //////////////////////// 
        switch(selection){
            case 'A':
                System.out.println("You selected A");
                break;
            case 'B':
                System.out.println("You selected B");
                break;
            case 'C':
                System.out.println("You selected C");
                break;
            case 'D':
                System.out.println("You selected D");
                break;
            default:
                System.out.println("No mucho guto with english, hueh?");
                break;
        }
        ////////////////////////
        //checkpoint
        //3.26  answer: different variables
        ////////////////////////
        
        ////////////////////////
        //checkpoint
        //3.27 you can't use boolean in switch cases
        ////////////////////////
        
        ////////////////////////
        //checkpoint
        //3.28 "that is serious"
        ////////////////////////
        
        ////////////////////////
        //checkpoint
        //4.4
        ////////////////////////
        System.out.println("Enter a number in range of 10 through 24");
        int number = keybord.nextInt();
        
        while(number<10 || number>24){
            System.out.println("Wrong. Enter again number in range 10-24.");
            int number = keybord.nextInt();
        }
        
        ////////////////////////
        //checkpoint
        //4.5
        ////////////////////////
        System.out.println("Enter Y,y,N or n.");
        String input = keybord.nextLine();
        char letter = input.charAt(0);
        
        while(!(letter == 'Y' || letter == 'y' || letter == 'N' || letter == 'n')){
            System.out.println("Enter Y,y,N or n.");
            input = keybord.nextLine();
            letter = input.charAt(0);
        }
                
        ////////////////////////
        //checkpoint
        //4.6
        ////////////////////////   
        System.out.println("Enter Yes or No.");
        String input = keybord.nextLine();
        
        while(!("Yes".equals(input) || "No".equals(input))){
            System.out.println("Enter Yes or No.");
            input = keybord.nextLine();
        }
        
        //4.10
        for(int i = 0; i<10; i++){
            System.out.println("John");
        }
        
        //4.11
        for(int i = 1; i<50; i+=2)
            System.out.println(i);

        //4.12
        for(int i = 0; i<=100; i+=5)
            System.out.println(i);
        
        //4.13
        int sum = 0;
        
        System.out.println("Enter numbers seven times to sum them up.");
        for(int i = 0; i<7; i++){
            int input = keybord.nextInt();
            
            sum+=input;
        }
        System.out.println("The sum is: " + sum);
        
        //4.21
        PrintWriter nameFile = new PrintWriter("MyName.txt");
        System.out.println("Enter your first name.");
        String input = keybord.nextLine();
        nameFile.println(input);
        nameFile.close();
        
        //4.22
        File input = new File("MyName.txt");
        Scanner inputFile = new Scanner(input);
        String inputLine = inputFile.nextLine();
        
        System.out.println(inputLine);
        
        inputFile.close();
        
        //4.23*/
    }
}
