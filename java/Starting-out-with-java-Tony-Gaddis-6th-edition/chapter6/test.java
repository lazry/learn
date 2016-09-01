/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;
import java.util.Scanner;
import java.io.*;
/**
 * document to test all classes in chapter 6 exercises
 * @author Mik
 * 
 */
public class test {
    public static void main(String[] args) throws IOException
    {
        /*
        programming challenges
        1.        
        Employee one = new Employee("Susan Meyers", 47899);
        one.setPosition("Vice President");
        one.setDepartment("Accounting");
        
        Employee two = new Employee("Mark Jones", "IT", "Programmer", 39119);
        Employee three = new Employee();
        three.setName("Joy Rogers");
        three.setIdNumber(81774);
        three.setDepartment("Manufacturing");
        three.setPosition("Engineer");
        
        System.out.printf("%s\t\t%d\t\t%s\t\t%s\n", one.getName(), one.getIdNumber(),
                one.getDepartment(), one.getPosition());
        System.out.printf("%s\t\t%d\t\t%s\t\t%s\n", two.getName(), two.getIdNumber(),
                two.getDepartment(), two.getPosition());
        System.out.printf("%s\t\t%d\t\t%s\t\t%s\n", three.getName(), three.getIdNumber(),
                three.getDepartment(), three.getPosition());

        2.
        Car mazda = new Car(2008, "gtxH3H3");
        for(int i = 0; i<5; i++){
            mazda.accelerate();
            System.out.println(mazda.getSpeed());
        }
        for(int i = 0; i<5; i++){
            mazda.brake();
            System.out.println(mazda.getSpeed());
        }
        
        3.
        PersonalInformation me = new PersonalInformation();
        me.setName("John Kennedy");
        me.setAddress("Masovian District, Poland");
        me.setAge(20);
        me.setPhoneNumber("30400000");
        System.out.printf("%s\t\t%s\t\t%d\t\t%s\n", me.getName(), me.getAddress(),
                me.getAge(), me.getPhoneNumber());
        
        4.
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
        System.out.printf("%s\t\t%d\t\t%f\n", item1.getDescription(), item1.getUnitsOnHand(),
                item1.getPrice());
        System.out.printf("%s\t\t%d\t\t%f\n", item2.getDescription(), item2.getUnitsOnHand(),
                item2.getPrice());
        System.out.printf("%s\t\t%d\t\t%f\n", item3.getDescription(), item3.getUnitsOnHand(),
                item3.getPrice());
        
        5.
        Payroll worker = new Payroll("John Cebula", 23453);
        worker.setHours(6);
        worker.setPayRate(12.8);
        System.out.printf("Worker %s with ID number %d has %.2f gross pay.",
                worker.getName(), worker.getIdNum(), worker.getGrossPay());
        
        6.
        TestScores test = new TestScores();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter score: ");
        test.setScoreOne(keyboard.nextInt());
        System.out.println("Enter score: ");
        test.setScoreTwo(keyboard.nextInt());
        System.out.println("Enter score: ");
        test.setScoreThree(keyboard.nextInt());
        
        System.out.printf("Average: %.2f\n", test.getAverage());
        
        7.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter radius.");
        double input = keyboard.nextDouble();
        Circle circle = new Circle(input);
        
        System.out.printf("Area: %.2f \nDiameter: %.2f \nCircumference: %.2f\n",
                circle.getArea(), circle.getDiameter(), circle.getCircumference());
         
        8.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter Fahrenheit temperature.");
        double input = keyboard.nextDouble();
        Temperature temp = new Temperature(input);
        
        System.out.println("Temperature in Kelvin's: "+temp.getKelvin()
        +"\nTemperature in Celcius: "+temp.getCelsius());
        
        9.
        Scanner keyboard = new Scanner(System.in);
        MonthDays mday = new MonthDays();
        
        System.out.println("Enter a month:");
        int input = keyboard.nextInt();
        System.out.println("Enter a year.");
        int input2 = keyboard.nextInt();
        System.out.println(mday.getNumberOfDays(input, input2));
        
        10.
        int totalComp = 0, totalUser = 0;
        boolean answer;
        Die comp = new Die(6);
        Die user = new Die(6);
        do{
            int userRoll = 0;
            comp.roll();
            answer = round();
            if(answer){
                user.roll();
                userRoll = user.getValue();
                System.out.println("You have rolled "+userRoll);
            }
            totalComp+= comp.getValue();
            totalUser+= userRoll;
            System.out.println("User's points: "+totalUser);
        }while(totalUser<=21 && answer == true);
        System.out.println("\nComputers points: "+totalComp+"\nThe winner is"
                +winner(totalComp, totalUser)+".");
    }
    
    public static boolean round(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to roll this round? (yes/no)");
        
        String answer = keyboard.nextLine();
        return answer.equalsIgnoreCase("yes");
    }
    public static String winner(int cP, int uP){
        String an;
        if(cP>21 && uP<21)
            an = " user";
        else if(uP>21 && cP<21)
            an = " computer";
        else if(cP>uP)
            an = " computer";
        else if(uP>cP)
            an = " user";
        else
            an = "... it's a tie!";
        return an;
    }
    
        11.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter temperature.");
        double temp = keyboard.nextDouble();
        System.out.println(information(temp));
    }
    public static String information(double t){
        return String.format("Boiling:%s\nFreezing:%s",
                boiling(t), freezing(t));
    }
    public static String boiling(double t){
        TempPoints myt = new TempPoints(t);
        String message = "";
        if(myt.isEthylBoiling())
            message+=" ethyl";
        if(myt.isOxygenBoiling())
            message+=" oxygen";
        if(myt.isWaterBoiling())
            message+=" water";
        return message;
    }
    public static String freezing(double t){
        TempPoints myt = new TempPoints(t);
        String message = "";
        if(myt.isEthylFreezing())
            message+=" ethyl";
        if(myt.isOxygenFreezing())
            message+=" oxygen";
        if(myt.isWaterFreezing())
            message+=" water";
        return message;
    }
        
        12. //I changed interestRate from double to int in class but not it this program
        Scanner keyboard = new Scanner(System.in);
        double deposits = 0, withdrawals = 0, interestRate = 0;
        System.out.println("Enter starting balance, annual interest rate and"
                + " the number of months.");
        SavingsAccount acc = new SavingsAccount(keyboard.nextDouble());
        acc.setAnnualRate(keyboard.nextDouble());
        final int MONTHS = keyboard.nextInt();
        
        for(int i = 1; i<=MONTHS; i++){
            System.out.println("Enter amount deposited during the month "+i);
            deposits+= acc.deposit(keyboard.nextDouble());
            System.out.println("Enter amount withdrawn during the month "+i);
            withdrawals = acc.withdrawal(keyboard.nextDouble());
            interestRate += acc.addMonthlyInterestRate();
        }
        
        System.out.printf("Balance: %.2f\nTotal deposits: %.2f\nTotal withdrawals: "
                + "%.2f\nTotal interest earned: %.2f\n", acc.getBalance(), deposits,
                withdrawals, interestRate);
        
        13.
        File file = new File("Deposits.txt");
        Scanner dep = new Scanner(file);
        File file2 = new File("Withdrawals.txt");
        Scanner with = new Scanner(file2);
        SavingsAccount acc = new SavingsAccount(500.00);
        
        double interest = 0;
        while(dep.hasNext()){
            double num = Double.parseDouble(dep.nextLine());
            System.out.println(num);
            acc.deposit(num);
        }
        while(with.hasNext()){
            double num = Double.parseDouble(with.nextLine());
            System.out.println(num);
            acc.withdrawal(num);
        }
        dep.close();
        with.close();
        interest += acc.addMonthlyInterestRate(12);
        System.out.println("Balance: "+acc.getBalance()+"\nTotal interest: "
                            + interest);
        
        14.
        Die comp = new Die(6);
        Die user = new Die(6);
        int cWins = 0, uWins = 0;
        String ans;
        
        for(int i = 0; i<10; i++){
            comp.roll();
            user.roll();
            if(comp.getValue()>user.getValue())
                cWins++;
            else if(comp.getValue()<user.getValue())
                uWins++;
        }
        if(cWins!=uWins){
            ans = cWins>uWins ? "The winner is computer.":"The winner is user.";
        }
        else ans = "It's a tie";
        System.out.println(ans);
        
        15.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter pocket number.");
        RoulettePocket myRP = new RoulettePocket(keyboard.nextInt());
        System.out.println("Your color is: "+myRP.getPocketColor());
        
        16.
        Coin coin = new Coin();
        System.out.println(coin.getSideUp());
        int heads = 0, tails = 0;
        
        for(int i = 1; i<=20; i++){
            coin.toss();
            if(coin.getSideUp().equalsIgnoreCase("heads"))
                heads++;
            else tails++;
            System.out.println(i+".tossed: "+coin.getSideUp());
        }
        System.out.println("total tails: "+tails+"\ntotal heads: "+heads);
        
        17.
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();
        double total = 0.0;
        
        do{
            toss(quarter, dime, nickel);
            total += count(quarter, dime, nickel);
        }while(total <= 1.0);
        
        String ans = (total == 1.0) ? "You won.":"You lost.";
        System.out.println("Total: $"+total+"\n"+ans);
    }
    public static void toss(Coin q, Coin d, Coin n){
        q.toss();
        d.toss();
        n.toss();
        System.out.printf("quarter: %s\ndime: %s\nnickel: %s\n", q.getSideUp(),
                d.getSideUp(), n.getSideUp());
    }
    public static double count(Coin q, Coin d, Coin n){
        double count = 0;
        if(q.getSideUp().equalsIgnoreCase("heads"))
            count+=0.25;
        if(d.getSideUp().equalsIgnoreCase("heads"))
            count+=0.1;
        if(q.getSideUp().equalsIgnoreCase("heads"))
            count+=0.05;
        System.out.printf("Earned: $%.2f\n",count);
        return count;
    }
    
        18.
        Scanner keyboard = new Scanner(System.in);
        Die die = new Die(6);
        String ans = null;
        int points = 0;
        
        do{
            die.roll();
            points += fishin(die.getValue());
            System.out.println("Do you want to continue fishing? (yes/no)");
            ans = keyboard.nextLine();
        }while(ans.equalsIgnoreCase("yes"));
        
        finish(points);
    }
    public static int fishin(int d){
        int point = 0;
        String what = null;
        switch(d){
            case 1:
                what = "used condom";
                point = 2;
                break;
            case 2:
                what = "a shark";
                point = -2;
                break;
            case 3:
                what = "a mermaid";
                point = 6;
                break;
            case 4:
                what = "a bottle with message \"go fuck yourself\"";
                point = -1;
                break;
            case 5:
                what = "a salmon";
                point = 3;
                break;
            case 6:
                what = "a scuba diver";
                point = 5;
        }
        System.out.println("You have cought "+what+" and is awarded with "+point+
                " points!");
        return point;
    }
    public static void finish(int d){
        String ans;
        if(d>=0 && d<=5)
            ans = "What a lame fisherman...";
        else if(d<=10)
            ans = "Little this and that and you will be a better fisherman.";
        else if(d<15)
            ans = "WHoa! Take a break from the fishing, you no-life!";
        else if(d>=15 )
            ans = "You are a son of fisherman or something..?";
        else ans = "You're there's a fishmarket around the corner.";
        
        System.out.printf("Points: %d\n%s\n", d, ans);*//**/
    }
}

