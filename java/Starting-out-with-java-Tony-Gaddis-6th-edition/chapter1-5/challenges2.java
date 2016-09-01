/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Mik
 */
public class challenges2 {
    public static void main(String[] args){
        Scanner keybord = new Scanner(System.in);
        
        /*
        String name = "Mikołaj";
        int age = 20;
        double annualPay = 0;
        char letter = name.charAt(2);
        System.out.println("My name is " + name + ", my age is " +
                + age + " and \nI hope to earn $" + annualPay + " per year." + letter);
        //4.
        System.out.println("   *\n  ***\n *****\n*******\n *****\n  ***\n   *");
        
        //5.
        double eastCost = 0.62;
        int income = 4600000;
        double generating = eastCost * income;
        
        //6.
        double tract = 389767;
        double acre = 43560;
        double numberOfAcres = tract/acre;
        System.out.println(numberOfAcres);
        
        //7.
        double amount;
        double stateTax = 0.04;
        double countyTax = 0.02;
        double totalTax, totalSale;
        
        System.out.println("Enter the amount of purchase.");
        amount = keybord.nextDouble();
        
        totalTax = amount*(stateTax + countyTax);
        totalSale = amount + totalTax;
       
        System.out.println("Amount of the purchase: " + amount + "\nstate sales tax: " +
                amount*stateTax + "\ncounty sales tax: " + amount*countyTax + 
                "\ntotal sales tax: " + totalTax + "\ntotal of the sale: " + totalSale);
        
        //8.
        int caloriesPerCookie = 300/4;
        
        System.out.println("Enter the amount of cookies eaten to report total"
                + " of calories consumed");
        int input = keybord.nextInt();
        System.out.println("You ate " + input*caloriesPerCookie + " calories.");
        
        //9.
        
        double milesDriven, gallonsUsed;
        
        System.out.println("Enter number of miles driven and the gallons of gas used");
        milesDriven = keybord.nextDouble();
        gallonsUsed = keybord.nextDouble();
        
        double mpg = milesDriven / gallonsUsed;
        System.out.println(mpg+" mpg.");

        //10. 
        double first, second, third, average;
        
        System.out.println("Enter three test scores");
        first = keybord.nextDouble();
        second = keybord.nextDouble();
        third = keybord.nextDouble();
        
        System.out.println("Three test scores:\n" + first +", " + second + ", "
                           + third + "\naverage: " + (first+second+third)/3 );
        
        //11. 
        System.out.println("Enter retail price to calculate profit.");
        double profit = keybord.nextDouble()*0.4;
        
        System.out.println("Profit earned: " + profit + ".");

        //12.
        int characters;
        String city, cityUpper, cityLower;
        char first;
        
        System.out.println("Enter name of your favourite city.");
        city = keybord.nextLine();
        
        characters = city.length();
        cityUpper = city.toUpperCase();
        cityLower = city.toLowerCase();
        first = city.charAt(0);
        
        System.out.println(characters +"\n"+ cityUpper +"\n"+ cityLower +"\n"
                           + first);

        //13.
        double charge, tax = 0.0675, tip = 0.2, total;
        
        System.out.println("Enter the charge for the meal.");
        charge = keybord.nextDouble();
        
        tax *= charge;
        tip *= (charge+tax);
        total = tip + tax + charge;
        System.out.println("Charge: " + charge + "\nTax: " + tax + "\nTip: " + 
                           tip + "\nTotal: " + total);

        //14. 
        int total, male, female, malePerc, femalePerc;
        
        System.out.println("Enter number of males and females in class");
        male = keybord.nextInt();
        female = keybord.nextInt();
        
        total = male + female;
        malePerc = 100*male/total;
        femalePerc = 100*female/total;
        
        System.out.println("Male percentage in class: " + malePerc + "%." +
                           "\nFemale percentage in class: " + femalePerc + "%.");
        
        //15.
        int shares;
        double priceOfShare, commission, paidForStock, paidForCommission,
               totalPaid;
        shares = 600;
        priceOfShare = 21.77;
        commission = 0.02;
        paidForStock = shares*priceOfShare;
        paidForCommission = paidForStock*commission;
        totalPaid = paidForStock + paidForCommission;
        
        System.out.println("For stock: $" + paidForStock + "\nFor commission: $"
                           + paidForCommission + "\nTotal: $" + totalPaid);
        
        //16.
        int surveyed = 12467;
        double clients = surveyed * 0.14, citrusClients = clients * 0.64;
        
        System.out.println("Customers:" + clients + "\nCitrus: " + citrusClients);

        //17.
        double sugar = 1.5/48, flour = 2.75/48;
        int cookies;
        String input;
        
        input = JOptionPane.showInputDialog("How many cookies you want to make?");
        cookies = Integer.parseInt(input);
        sugar *= cookies;
        double butter = (double) cookies/48;
        flour *= cookies;
        
        JOptionPane.showMessageDialog( null, "For " + cookies + " cookies you need:\n"
                                     + sugar + " cups of sugar\n" + butter + " cups of"
                                     + " butter\n" + flour + " cups of flour");
        
        //19.
        int shares = 1000, sharesSold = 1000;
        double pricePerShare = 32.87, pricePerShareSold = 33.92, commission = 0.02,
               bought = shares*pricePerShare, sold = sharesSold*pricePerShareSold,
               profit = sold - (bought+commission*(bought+sold));
        
        System.out.println("Joe paid for stock $" + bought + " and "
                + "paid broker $" + bought*commission + ".\nJoe sold stock for $" +
                sold + " and paid broker $" + sold*commission + ".\nProfit: $" +
                profit + ".");

        //3.1
        int number = 0;
        String input = JOptionPane.showInputDialog("Enter number within range 1-10");
        number = Integer.parseInt(input);
        
        switch(number){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Error.");
        }
        //3.2
        int day, month, year;
        String answer;
        
        System.out.println("Enter day, month and year.");
        day = keybord.nextInt();
        month = keybord.nextInt();
        year = keybord.nextInt();
        
        answer = (day*month == year) ? "The date is magic." : "The date is not magic.";
        System.out.println(answer);
        
        //3.3
        //EUROPE FTW
        double pound = 0.45359237, inch = 2.54;
        double BMI = 0;
        
        System.out.println("Enter weight (kg) and height (centimeters).");
        double weight = keybord.nextDouble()/pound;
        double height = keybord.nextDouble()/inch;
        
        double bmi = weight*703/(height*height);
        
        if (bmi<18.5)
            System.out.println("You are underweight.");
        else if (bmi>=18.5 && bmi<=25)
            System.out.println("You have optimal weight.");
        else if (bmi>25)
            System.out.println("You are overweight.");
        else 
            System.out.println("Invalid input. Restart the program.");
        
        //3.4
        double first, second, third;
        
        System.out.println("Enter three test scores");
        first = keybord.nextDouble();
        second = keybord.nextDouble();
        third = keybord.nextDouble();
        
        double average = (first+second+third)/3;
        if(average<60)
            System.out.println("Grade F. Average " + average + "%");
        else if (average<70)
            System.out.println("Grade D. Average " + average + "%");
        else if (average<80)
            System.out.println("Grade C. Average " + average + "%");
        else if (average<90)
            System.out.println("Grade B. Average " + average + "%");
        else if (average<=100)
            System.out.println("Grade A. Average " + average + "%");
        else 
            System.out.println("Enter valid data.");
        
        //3.5
        double mass;
        System.out.println("Enter object's mass.");
        mass = keybord.nextDouble();
        
        double weight = 9.8 * mass;
        
        if(weight<10)
            System.out.println("too light");
        if(weight>1000)
            System.out.println("too heavy");
        
        //3.6
        System.out.println("Enter number of seconds.");
        int seconds = keybord.nextInt();
        
        if(seconds>86400)
            System.out.println("There are " + seconds/86400 + " days in that "
                    + "many seconds.");
        else if(seconds>3600)
            System.out.println("There are " + seconds/3600 + " hours in that "
                    + "many seconds.");
        else if(seconds>60)
            System.out.println("There are " + seconds/60 + " minutes in that "
                    + "many seconds.");
        
        //3.7
        System.out.println("Enter three names.");
        String first = keybord.nextLine();
        String second = keybord.nextLine();
        String third = keybord.nextLine();
        
        if (first.compareTo(second) <0 && first.compareTo(third) <0){
            if (second.compareTo(third) <0 )
                System.out.println(first +"\n"+ second +"\n"+ third);
            else 
                System.out.println(first +"\n"+ third +"\n"+ second);
        }
        if (second.compareTo(third) <0 && second.compareTo(first) <0){
            if (first.compareTo(third)<0)
                System.out.println(second +"\n"+ first +"\n"+ third);
            else
                System.out.println(second +"\n"+ third +"\n"+ first);
        }
        if (third.compareTo(second) <0 && third.compareTo(first) <0){
            if (first.compareTo(second)<0)
                System.out.println(third +"\n"+ first +"\n"+ third);
            else
                System.out.println(third +"\n"+ second +"\n"+ first);
        }
        
        //3.8
        System.out.println("Enter quantity of packages purchased.");
        int quantity = keybord.nextInt();
        
        if(quantity<10)
            System.out.println("You ain't won shit, sir.");
        else if(quantity>=10 && quantity<20)
            System.out.println("You got 20% discount, sir.");
        else if(quantity>=20 && quantity<50)
            System.out.println("You got 30% discount, sir.");
        else if(quantity>=50 && quantity<100)
            System.out.println("You got 40% discount, sir.");
        else if(quantity>=100)
            System.out.println("You got 50% discount, sir.");

        //3.9
        System.out.println("Enter weight of package (pounds) and miles to travel.");
        double weight = keybord.nextDouble();
        double miles = keybord.nextDouble();
        int rates = 0;
        double price = 0;
        
        if(miles%500 > 0){
            miles-=miles%500;
            rates+=1;
        }
        rates += miles/500;
        
        if(weight<=2)
            price = 1.1;
        else if (weight<=6)
            price = 2.2;
        else if (weight<=10)
            price = 3.7;
        else if (weight>10)
            price = 3.8;
        
        System.out.println("Shipping cost: $" + price*rates);
        
        //3.10
        System.out.println("Enter number of calories and fat grams in a food item.");
        double calories = keybord.nextDouble();
        double fat = keybord.nextDouble();
        double caloriesFromFatPercentage = (fat*9)/calories*100;
        
        if(calories>fat*9){
            String low = caloriesFromFatPercentage<30 ? "\nThe food is low in fat." :"";

            System.out.println("Percentage of the calories that come from fat: " + 
                    caloriesFromFatPercentage +"%." + low);
        }
        else System.out.println("Input is invalid.");
        
        //3.11
        System.out.println("Enter names and the times (in minutes) of runners.");
        String firstName = keybord.nextLine();
        int firstTime = keybord.nextInt();
        keybord.nextLine();
        String secondName = keybord.nextLine();
        int secondTime = keybord.nextInt();
        keybord.nextLine();
        String thirdName = keybord.nextLine();
        int thirdTime = keybord.nextInt();
        
        if (firstTime<secondTime){
            if(firstTime<thirdTime){
                if(secondTime<thirdTime)
                    System.out.println(firstName +" "+ secondName +" "+ thirdName);
                else
                    System.out.println(firstName +" "+ thirdName +" "+ secondName);
            }
            else                            
                System.out.println(thirdName +" "+ firstName +" "+ secondName);
        }
        else {
            if (firstTime<thirdTime)
                System.out.println(secondName +" "+ firstName +" "+ thirdName);
            else if (thirdTime<secondTime)
                System.out.println(thirdName +" "+ secondName +" "+ firstName);
            else 
                System.out.println(secondName +" "+ thirdName +" "+ firstName);
        }
        
        //3.12
        System.out.println("Write air/water/steel and the distance (in feets) "
                + "that the sound will travel.");
        String medium = keybord.nextLine();
        double distance = keybord.nextDouble();
        int parameter = 0;
        
        switch(medium){
            case "air":
                parameter = 1100;
                break;
            case "water":
                parameter = 4900;
                break;
            case "steel":
                parameter = 16400;
                break;
            default:
                System.out.println("Invalid input.");
        }
        
        System.out.println("It will take " + distance/parameter + " second(s) "
                         + "to travel in " + medium + ".");
        
        //3.13 and 3.14 
        System.out.println("Enter the letter of the package and hours used.");
        String input = keybord.nextLine();
        char letter = input.charAt(0);
        int hours = keybord.nextInt();
        int extraTime = 0;
        double bill = 0, billB = 0, billC = 19.95, savingsB = 0, savingsC = 0;
        
        if(letter == 'A'){
            extraTime = hours>10 ? (hours-10) : 0;
            bill = 9.95 + extraTime*2;
            
            if(bill>13.95){
                billB = 13.95 + (hours-20);
                savingsB = bill - billB;
            }
            if(bill>19.95){
                billC = 19.95;
                savingsC = bill - billC;
            }                
        }
        else if(letter == 'B'){
            extraTime = hours>20 ? (hours-20) : 0;
            bill = 13.95 + extraTime;
            
            if(bill>19.95){
                savingsC = bill - billC; 
            }
        }
        else if(letter == 'C')
            bill = 19.95;
        else
            System.out.println("Invalid input.");
        
        
        
        System.out.println("Total charges: $" + bill + ".");
        if(billB>13.95)
            System.out.println("You could save $"+savingsB+" on package B");
        if(bill>19.95)
            System.out.println("You could save $"+savingsC+" on package C");
        
        //3.15
        System.out.println("Enter number of checks written per month.");
        int checksWritten = keybord.nextInt();
        double factor = 0;
        
        if(checksWritten>=60)
            factor = .04;
        else if(checksWritten>=40)
            factor = .06;
        else if(checksWritten>=20)
            factor = .08;
        else if(checksWritten<=20)
            factor = 0.1;
        else  System.out.println("Invalid input.");
        
         System.out.println("Banks service fee for the month: $" + 
                            (10+checksWritten*factor));
        
        //3.16
         System.out.println("How many books have you purchased this month?");
         int number = keybord.nextInt(), points = 0;
         
         if(number>=4) points = 60;
         else {
            switch(number){
               case 0:
                   break;
               case 1:
                   points = 5;
                   break;
               case 2:
                   points = 15;
                   break;
               case 3:
                   points = 30;
                   break;
               default:
                    System.out.println("Invalid input.");
            }
         }
         
         System.out.println("You were awarded with " +points+ " points.");*/
        
        int count = 1;
        while (count < 10)
        {
            System.out.println(count);
            count++;
        }
    }
}
