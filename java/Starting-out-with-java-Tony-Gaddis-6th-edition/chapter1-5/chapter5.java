/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
import java.util.Random;

/**
 *
 * @author Mik
 */
public class chapter5 {
    public static void main(String[] args)throws IOException{
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        /*
        Checkpoint
        5.1
        Void runs through statements, value-returning return also a value.
        5.2
        Method call.
        5.3
        Header.
        5.4
        if 5 "able i was". if 10 or 100 "i saw elba"
        5.5
        public static void MyName(){
        System.out.println("Name");
        }
        5.6
        Arguments appear in call method and paramter in method header.
        5.7
        b.c.
        5.8
        d.
        5.9
        It means that not actual argument is passed but only its value.
        5.10
        99 1.5
        99 1.5
        0 0.0
        99 1.5
        5.11
        double
        5.12
        public static int days(int years, int months, int weeks)
        5.13
        public static double distance(double rate, double time)
        5.14
        public static long lightYears(long miles)
        
        Review
        multiple choice
        1.b.  2.d.  3.a.
        4.e.  5.b.  6.a.
        7.b.  8.d.  9.c.
        10.F  11.T  12.F
        13.F  14.F  15.T
        16.T  17.F  18.F
        19.F  20.T
        find the error
        1.has semicolon after method header
        2.call does't need data type in parentesis
        3.method should be void because doesn't return any value
        4. return type in header and body of method doesn't match
        
        algorith workbench
        1.
        doSomething(x);
        2.
        a.Y  b.N  c.Y
        d.N  e.N  f.Y
        3. 
        a=3 b=2 c=1
        4.
        1 3.4
        0 0.0
        1 3.4
        5.
        int result = cube(4);
        6.
        display(age, income, initial);
        7.
        public static double timesTen(double number)
        {
        return number*10;
        }
        8.
        public static int square(int number)
        {
        return number*number;
        }
        9.
        public static String getName()
        {
        String name = JOptionPane.showInputDialog("Enter your first name.");
        return name;
        }
        10.
        public static double quartersToDollars(int quartersNumber)
        {
        return quartersNumber/4.0;
        }
        
        short answer
        1.
        to divide one painstaking method into few smaller
        2.
        void doesn't return any value to the calling method
        3.
        argument is in method calling and parameter is in method header
        4.
        in method header
        5.
        value is passed only by value not a reference to adress or name holding 
        a reference
        6.
        because they exists only localy?
        
        programming challenges
        1.
        public static void showChar(String stringRef, int charPosition)
        {
        System.out.println(stringRef.charAt(charPosition));
        }
        
        2.
        public static double calculateRetail(double wholesaleCost, double markupPercentage)
        {
            double retailsPrice = wholesaleCost*(markupPercentage+1);
            return retailsPrice;
        }
        
        3.
        public static double getLength()
        {
            String input = JOptionPane.showInputDialog("Enter the rectangle's lenght.");        
            return Double.parseDouble(input);
        }
        public static double getWidth()
        {
            String input = JOptionPane.showInputDialog("Enter the rectangle's width.");        
            return Double.parseDouble(input);
        }
        public static double getArea(double length, double width)
        {       
            return length*width;
        }
        public static void displayData(double length, double width, double area)
        {       
            JOptionPane.showMessageDialog(null, String.format("length: %.2f, width: %.2f, area: %.2f" ));
        }
        
        4.
        String input = JOptionPane.showInputDialog("Enter price for one gallon."); 
        double gallonCost = Double.parseDouble(input);
        double wallSpace = getWallSpace();
        int paint = paintRequired(wallSpace);
        double laborHours = laborHoursRequired(wallSpace);
        double paintCost = paintCost(paint, gallonCost);
        double laborCost = laborCost(laborHours);
        double totalCost = totalCost(laborCost, paintCost);
        System.out.printf("Paint: $%.2f \nLabor: $%.2f\nTotal: $%.2f\n", paintCost, 
                laborCost, totalCost);
    }
    public static double getWallSpace()
    {
        String input = JOptionPane.showInputDialog("Enter the number of rooms."); 
        int j = Integer.parseInt(input);
        
        double total=0;
        for(int i = 1; i<=j; i++){
            input = JOptionPane.showInputDialog("Enter wall space of room number "+i); 
            total+= Double.parseDouble(input);
        }
        return total;
    }
    public static int paintRequired(double wallSpace)
    {
        int paint = 0;
        double extraGallon = wallSpace%115;
        if (extraGallon>0)
            paint++;
        paint += (wallSpace-extraGallon)/115;
        return paint;
    }
    public static double laborHoursRequired(double wallSpace)
    {
        double answer = 8.0/115.0*wallSpace;
        JOptionPane.showMessageDialog(null, answer);
        return answer;
    }
    public static double paintCost(int gallons, double gallonCost)
    {
        return gallons*gallonCost;
    }
    public static double laborCost(double laborHours)
    {
        return laborHours*18;
    }
    public static double totalCost(double labor, double paint)
    {
        return labor+paint;
    }
        
        5.
        for(int i = 1; i<=10; i++){
            System.out.printf("Falling distance for %d second(s) is %.2f. "
                    + "meter(s)\n", i, fallingDistance(i));
        }
    }
    public static double fallingDistance(int time)
    {
        return 0.5*9.8*time*time;
    }
        
        6.
        for(int i = 0; i<=20; i++){
            System.out.printf("%d:%20.2f\n", i, celsius(i));
        }
    }
    public static double celsius(double fahrenheit)
    {
        return 5.0/9.0*(fahrenheit-32);
    }
        
        7.
        double one = 0,two = 0,three = 0,four = 0,five = 0;
        for(int i = 1; i<=5; i++){
            System.out.println("Enter score number "+i);
            switch(i){
                case 1:
                    one = keyboard.nextDouble();
                    System.out.printf("%d %.2f %s\n", i, one, determineGrade(one));
                    break;
                case 2:
                    two = keyboard.nextDouble();
                    System.out.printf("%d %.2f %s\n", i, two, determineGrade(two));
                    break;
                case 3:
                    three = keyboard.nextDouble();
                    System.out.printf("%d %.2f %s\n", i, three, determineGrade(three));
                    break;
                case 4:
                    four = keyboard.nextDouble();
                    System.out.printf("%d %.2f %s\n", i, four, determineGrade(four));
                    break;
                case 5:
                    five = keyboard.nextDouble();
                    System.out.printf("%d %.2f %s\n", i, five, determineGrade(five));
            }    
        } 
        System.out.println("Average: "+calcAverage(one,two,three,four,five));
    }     
    public static double calcAverage(double one, double two, double three, double four, double five)
    {
        return (one+two+three+four+five)/5.0;
    }
     public static char determineGrade(double testScore)
    {
        char letterGrade = 0;
        if(testScore<60)
            letterGrade = 'F';
        else if(testScore<70)
            letterGrade = 'D';
        else if(testScore<80)
            letterGrade = 'C';
        else if(testScore<90)
            letterGrade = 'B';
        else if(testScore<=100)
            letterGrade = 'A';
        
        return letterGrade;
    }
        
        8.
        int meters = 0, choice = 0; 
        do{
                System.out.println("Enter a distance in meters:");
                meters = keyboard.nextInt();
            }while(meters<0);
        do{
            menu();
            System.out.println("\nEnter your choice:");
            choice = keyboard.nextInt();
            switch(choice){
                case 1:
                    showKilometers(meters);
                    break;
                case 2:
                    showInches(meters);
                    break;
                case 3:
                    showFeet(meters);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error.");
            }
        }while(choice != 4);
    }     
    public static void showKilometers(int meters)
    {
        JOptionPane.showMessageDialog(null, meters+" meters is "+meters*0.001+" kilometers.");
    }
    public static void showInches(int meters)
    {
        JOptionPane.showMessageDialog(null, meters+" meters is "+meters*39.37+" inches.");
    }
    public static void showFeet(int meters)
    {
        JOptionPane.showMessageDialog(null, meters+" meters is "+meters*3.281+" feet.");
    }
     public static void menu()
    {
        System.out.println("1. Convert to kilometers\n2.Conver to inches\n3."
                + "Convert to feet\n4. Quit the program");
    }
        
        9.
        int hours, speed, distance;
        do{
            System.out.println("Enter number of hours travelled and the speed of a vehicle.");
            hours = keyboard.nextInt();
            speed = keyboard.nextInt();
        }while(hours<1 || speed<0);
        
        PrintWriter outputFile = new PrintWriter("distance.txt");
        
        outputFile.println("Hour\t\tDistance Traveled");
        outputFile.println("_________________________________");
        for(int i = 1; i<=hours; i++){
            outputFile.printf("%d%32d", i, distance(speed, hours));
            outputFile.println();
        }
        outputFile.close();
    }
    public static int distance(int speed, int time)
    {
        return speed*time;
    }
        
        10.
        double ns = 0, sp = 0, pp = 0, sc = 0, pc = 0;
        System.out.println("Enter number of shares.");
        ns = enter();
        System.out.println("Enter sale price per share.");
        sp = enter();
        System.out.println("Enter purchase price per shares.");
        pp = enter();
        System.out.println("Enter sale commission paid.");
        sc = enter();
        System.out.println("Enter purchase commission paid.");
        pc = enter();
        System.out.println(stock(ns, sp, pp, sc, pc));
    }
    public static double enter()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
    public static double stock(double ns, double sp, double pp, double sc, double pc)
    {
        double stock = ((ns*sp) - sc) - ((ns*pp) + pc);
        return stock;
    }
        
        11.
        System.out.println("Enter the number of stock sales.");
        double stockSalesNumber = enter();
        double total = 0;
        for(int i = 1; i<=stockSalesNumber; i++){
            total+=stockDataEnter();
        }    
        System.out.println("Total: "+total);
    }
    public static double enter()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextDouble();
    }
    public static double stock(double ns, double sp, double pp, double sc, double pc)
    {
        double stock = ((ns*sp) - sc) - ((ns*pp) + pc);
        return stock;
    }
    public static double stockDataEnter()
    {
        double ns = 0, sp = 0, pp = 0, sc = 0, pc = 0;
        System.out.println("Enter number of shares.");
        ns = enter();
        System.out.println("Enter sale price per share.");
        sp = enter();
        System.out.println("Enter purchase price per shares.");
        pp = enter();
        System.out.println("Enter sale commission paid.");
        sc = enter();
        System.out.println("Enter purchase commission paid.");
        pc = enter();
        return stock(ns, sp, pp, sc, pc);
    }
        
        12.
        double mass, velocity;
        System.out.println("Enter object's mass (kilograms) and velocity (m/s(.");
        mass = keyboard.nextDouble();
        velocity = keyboard.nextDouble();
        System.out.println("The object has "+kineticEnergy(mass, velocity)+
                " kinetic energy");
    }
    public static double kineticEnergy(double mass, double velocity)
    {
        return 0.5*mass*velocity*velocity;
    }
        13.
        public static boolean isPrime(int num)
    {
        if(num<2)
            return false;
        else if(num==2)
            return true;
        else if(num%2==0)
            return false;
        for(int i = 3; i*i<=num; i+=2)
            if(num % i == 0) return false;
        return true;
    }
        
        14.
        PrintWriter outputFile = new PrintWriter("primeNumberList.txt");
        for(int i = 1; i<=100; i++){
            if(isPrime(i))
                outputFile.println(i);
        }
        outputFile.close();
    }
    public static boolean isPrime(int num)
    {
        if(num<2)
            return false;
        else if(num==2)
            return true;
        else if(num%2==0)
            return false;
        for(int i = 3; i*i<=num; i+=2)
            if(num % i == 0) return false;
        return true;
    }
        
        15.
        int numEven = 0, numOdd = 0, number;
        for(int i = 1; i<=100; i++){
            number = rand.nextInt();
            if(isEven(number))
                numEven++;
            else
                numOdd++;
        }
        System.out.println("There were generated "+numEven+" even numbers and "
                +numOdd+" odd numbers.");
    }
    public static boolean isEven(int num)
    {
        if((num % 2) == 0)
            return true;
        else 
            return false;
    }
        
        16.
        double futureValue = 0, interestRate = 0, numOfYears = 0, presentValue;
        System.out.println("Enter future value.");
        futureValue = keyboard.nextDouble();
        System.out.println("Enter interest rate.");
        interestRate = keyboard.nextDouble();
        System.out.println("Enter number of years.");
        numOfYears = keyboard.nextDouble();
        
        System.out.printf("You should invest $%.2f.", 
                presentValue(futureValue, interestRate, numOfYears));
    }
    public static double presentValue(double futureValue, double interestRate, double numOfYears)
    {
        return (futureValue/ Math.pow((1+interestRate), numOfYears));
    }
        
        17.
        String computerChoice, userChoice;
        do{
        int num = rand.nextInt(3)+1;
        computerChoice = computerChoice(num);
        userChoice = menu();
        System.out.println("Computers choice is: "+computerChoice);
        System.out.println("The winner is: "+winner(computerChoice, userChoice));
        }while(computerChoice.equalsIgnoreCase(userChoice));
        
    }
    public static String computerChoice(int num)
    {
        String ans = null;
        switch(num){
            case 1:
                ans = "rock";
                break;
            case 2:
                ans = "paper";
                break;
            case 3:
                ans = "scissors";
        }
        return ans;
    }
    public static String menu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose paper, rock or scissors.");
        return keyboard.nextLine();
    }
    public static String winner(String computer, String user)
    {
        if(computer.equalsIgnoreCase(user)){
            System.out.println("It's a tie! Choose again.");
            return "God";
        }
        else if(computer.equalsIgnoreCase("rock")){
            if(user.equalsIgnoreCase("scissors"))
                return "computer";
            else
                return "user";
        }
        else if(user.equalsIgnoreCase("rock")){
            if(computer.equalsIgnoreCase("scissors"))
                return "user";
            else
                return "computer";
        }
        if(user.equalsIgnoreCase("scissors")) 
            return "user";
        else return "computer";
    }
        
        18.
        String computerColor, userColor;
        int correct = 0;
        for(int i = 0; i<10; i++){
            int num = rand.nextInt(5)+1;
            computerColor = computerColor(num);
            userColor = menu();
            System.out.println("Computers color is: "+computerColor);
            if(computerColor.equalsIgnoreCase(userColor))
                correct++;
        }
        System.out.println("Correctly guessed "+correct+" times.");
    }
    public static String computerColor(int num)
    {
        String ans = null;
        switch(num){
                case 1:
                    ans = "Red";
                    break;
                case 2:
                    ans = "Green";
                    break;
                case 3:
                    ans = "Blue";
                    break;
                case 4:
                    ans = "Orange";
                    break;
                case 5:
                    ans = "Yellow";
            }
        return ans;
    }
    public static String menu()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Choose the color that the computer has selected.");
        return keyboard.nextLine();
    }*/
    }
}
