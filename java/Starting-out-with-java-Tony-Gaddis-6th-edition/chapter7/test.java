/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Mik
 */
public class test {
    public static void main(String[] args) throws IOException{
        Scanner keyboard = new Scanner(System.in);
        /*
        1.
        double[] rainfall = new double[12];
        for(int i = 0; i<rainfall.length; i++){
            do{
                System.out.println("Enter monthly rainfall for month "+(i+1));
                rainfall[i] = keyboard.nextDouble();
            }while(rainfall[i]<0);
        }
        RainFall rainfall2 = new RainFall(rainfall);
        System.out.printf("Total rain for year: %.2f\n"
                + "Average monthly fall: %.2f\n"
                + "Month with the most rain: %d\n"
                + "Month with the least rain: %d\n", rainfall2.annualRain(),
                rainfall2.monthAverage(), rainfall2.monthMostRain(),
                rainfall2.monthLeastRain());
        
        2.
        Payroll stuff = new Payroll();
        int hours;
        double pay;
        for(int i = 0; i<7; i++){
            do{
            System.out.println("Enter hours of employee with ID "+stuff.getId(i));
            hours = keyboard.nextInt();
            }while(hours<0);
            stuff.setHours(i, hours);
            do{
            System.out.println("Enter pay rate of employee with ID "+stuff.getId(i));
            pay = keyboard.nextDouble();
            }while(pay<6.00);
            stuff.setPayRate(i, pay);
            stuff.setWages(i);
        }
        for(int id : stuff.employeeId)
            stuff.grossPay(id);
        
        3.4.
        ChargeAccount charge = new ChargeAccount();
        System.out.println("Enter your validation code.");
        String buffer = keyboard.nextLine();
        if(charge.validation(buffer))
            System.out.println("Your code is valid.");
        else System.out.println("Your code is invalid.");
        
        5.
        int[] numbers = { 76, 3, 43, 54, 5, 24, 100};
        int n = 53;
        largerThanN(numbers, n);         
    }
    public static void largerThanN(int[] array, int n){
        for(int num : array){
            if(num > n)
                System.out.print(num+", ");
        }
    }
        
        6.
        String[] user = new String[20];
        String ans = null;
        for(int i = 0; i<20; i++){
            do{
                System.out.println("Enter asnwer for question number "+(i+1));
                ans = keyboard.nextLine();
            }while(!(ans.equalsIgnoreCase("A") || ans.equalsIgnoreCase("B") ||
                    ans.equalsIgnoreCase("C") || ans.equalsIgnoreCase("D")));
            user[i] = ans;
        }
        DriverExam exam = new DriverExam(user);
        System.out.println("Passed: "+exam.passed()+
                "\nTotal correct: "+exam.totalCorrect()+
                "\nTotal incorrect: "+exam.totalIncorrect()+
                "\nQuestions missed: "+exam.questionsMissed());
                //there wont be any missed if i HAVE to pass value
                
        7.
        double[][] sales = new double[2][2];
        setSales(sales);
        getByDiv(1, sales);
        divIncDec(2, sales);
        totalForQuarter(4, sales);
        quarterIncDec(3, sales);
        quarterAverage(2, sales);
        divHighForQuart(2, sales);
        
    }
    public static void setSales(double[][] array){
        Scanner keyboard = new Scanner(System.in);
        double buffer = 0;
        for(int row = 0; row<array.length; row++){
            System.out.println("Enter sales for division number "+(row+1));
            for(int col = 0; col<array[row].length; col++){
                do{
                    System.out.println("Quarter "+(col+1));
                    buffer = keyboard.nextDouble();
                    array[row][col] = buffer;
                }while(buffer<0.0);
            } 
        }        
    }
    public static void getByDiv(int div, double[][] array){
        System.out.println("Sales for division number "+div);
        for(int col = 0; col<array[div-1].length; col++){
            System.out.println("Quarter "+(col+1)+
                    ": $"+array[div-1][col]);
        }
    }    
    public static void divIncDec(int quart, double[][] array){
        if(quart>1){
            System.out.println("From quarter "+(quart-1)+" to "+quart);
            for(int row = 0; row<array.length; row++){
                System.out.println("For division "+(row+1)+": $"
                        +(array[row][quart-1]-array[row][quart-2]));
            }
        }
    }
    public static void totalForQuarter(int quart, double[][] array){
        double total = 0.0;
        for (double[] array1 : array) {
            total += array1[quart-1];
        }
        System.out.println("For quarter "+quart+": $"+total);
    }
    public static void quarterIncDec(int quart, double[][] array){
        if(quart>1){
            double total = 0.0;
            for (double[] array1 : array) {
                total += array1[quart-1];
            }
            double totalP = 0.0;
            for (double[] array1 : array) {
                totalP += array1[quart-2];
            }
            System.out.println("Quarter status from previous: $"+(total-totalP));
        }
    }
    public static void quarterAverage(int quart, double[][] array){
        double total = 0.0;
        for (double[] array1 : array) {
            total += array1[quart-1];
        }
        System.out.println("Quarter "+quart+". average: "+(total/6.0));
    }
    public static void divHighForQuart(int quart, double[][] array){
        int index = 0;
        for(int row = 1; row<array.length; row++){
            if(array[row][quart-1]>array[index][quart-1])
                index = row;
        }
        System.out.println("The division with the highest sales in quarter "+
                quart+" is "+(index+1));
    }
        8.9.
        String[] names = new String[5];
        double[][] studentsScores = new double[5][4];
        
        setNames(names);
        System.out.println("Enter your student number");
        setGrades(studentsScores, keyboard.nextInt());
        
        GradeBook gradebook = new GradeBook(names, studentsScores);
        System.out.println("Enter students number to display details");
        gradebook.getStudent(keyboard.nextInt());
    }
    public static void setNames(String[] n){
        Scanner keyboard = new Scanner(System.in);
        for(int row = 0; row<n.length; row++){
            System.out.println("Enter name of student number "+(row+1));
            n[row] = keyboard.nextLine();
        }
    }
    public static void setGrades(double[][] scores, int s){
        Scanner keyboard = new Scanner(System.in);
        for(int col = 0; col<scores[s].length; col++){
            System.out.println("Enter score number "+(col+1));
            scores[s-1][col] = keyboard.nextDouble();
        }
    }
        10. //nsk
        Lottery mylottery = new Lottery();
        int[] picks = new int[5];
        lotteryPicks(picks);
        System.out.println("You have matched "+mylottery.lotteryPicks(picks)+
                " times\nThe numbers to guess were:");
        mylottery.getLotteryNum();
    }
    public static void lotteryPicks(int[] p){
        Scanner keyboard = new Scanner(System.in);
        for(int row = 0; row<p.length; row++){
            System.out.println("Pick a number 0-9");
            p[row] = keyboard.nextInt();
        }
    }
        
        11.
        int[] array = {12, 32, 434, 3, 23, 556};
        System.out.println("Total: "+getTotal(array)+
                "\nAverage: "+getAverage(array)+
                "\nHighest: "+getHighest(array)+
                "\nLowest: "+getLowest(array));
        
    }
    public static int getTotal(int[] array){
        int total = 0;
        for(int val : array)
            total +=val;
        return total;
    }
    public static int getAverage(int[] array){
        return getTotal(array)/array.length;
    }
    public static int getHighest(int[] array){
        int  highest = array[0];
        for(int row = 1; row<array.length; row++)
            if(highest<array[row])
                highest = array[row];
        return highest;
    }
    public static int getLowest(int[] array){
        int  lowest = array[0];
        for(int row = 1; row<array.length; row++)
            if(lowest>array[row])
                lowest = array[row];
        return lowest;
    }
    
        12.
        String name = "Numbers.txt";
        NumberAnalysis numbers = new NumberAnalysis(name);
        
        13.
        File file = new File("femaleNames.txt");
        Scanner inputFemale = new Scanner(file);
        file = new File("maleNames.txt");
        Scanner inputMale = new Scanner(file);
        String[] female = new String[50];
        String[] male = new String[50];
        read(female, inputFemale);
        read(male, inputMale);
        System.out.println("Enter name or names.");
        String name1 = keyboard.nextLine();
        String name2 = keyboard.nextLine();
        search(female, male, name1, name2);
    }
    public static void read(String[] array, Scanner input){
        int index = 0;
        while(input.hasNext()){
            array[index] = input.nextLine();
            index++;
        }
    }
    public static void search(String[] arrayF, String[] arrayM, String... names){
        boolean are = false;
        String ans;
        for(String name : names){
            for(String nameF : arrayF)
                if(nameF.equalsIgnoreCase(name))
                    are = true;
            for(String nameM : arrayM)
                if(nameM.equalsIgnoreCase(name))
                    are = true;
            ans = are ? " is " : " is not ";
            System.out.println("Name "+name+ans+"among the most popular.");
        }
    }
    
        14.//nsk
        File file = new File("Numbers.txt");
        Scanner inputFile = new Scanner(file);
        final int YEARS = 12;
        long[] population = new long[YEARS];
        int index = 0;
        while(inputFile.hasNext()){
            population[index] = inputFile.nextInt();
            index++;
        }
        System.out.println("Average annual change: "+averAnnualChange(population)+
                "\nGreatest population increase in year: "+greatestIncr(population)+
                "\nSmallest population increase in year: "+smallestIncr(population));
    }    
    public static long averAnnualChange(long[] array){
        long total = 0;
        for(int row = 1; row<array.length; row++){
            total += (array[row]-array[row-1]);
        }
        long average = (long)(total/(array.length-1));
        return average;
    }
    public static int greatestIncr(long[] array){
        long inc;
        long buffer = (array[1]-array[0]);
        int year = 1950;
        
        for(int row = 2; row<array.length; row++){
            inc = (array[row]-array[row-1]);
            if(inc>buffer){
                System.out.println(inc+">"+buffer);
                buffer = inc;
                
                year = 1950+(row-1);
            }
        }
        return year;
    }
    public static int smallestIncr(long[] array){
        long inc;
        long buffer = (array[1]-array[0]);
        int year = 1950;
        
        for(int row = 2; row<array.length; row++){
            inc = (array[row]-array[row-1]);
            if(inc<buffer){
                buffer = inc;
                year = 1950+(row-1);
            }
        }
        return year;
    }
        
        15.
        File file = new File("WorldSeriesWinners.txt");
        Scanner inputFile = new Scanner(file);
        String[] winners = new String[106];
        
        int i = 0;
        while(inputFile.hasNextLine()){
            winners[i] = inputFile.nextLine();
            i++;
        }
        
        int times = 0;
        System.out.println("Enter the name of a team.");
        String team = keyboard.nextLine();
        for (String winner : winners)
            if(winner.equalsIgnoreCase(team))
                times++;
        System.out.println("Team "+team+" has won World Series "+times+" time(s).");
        
        16.
        int[][] test = { { 4, 6, 8},
                         { 10, 12, 14},
                         { 3, 5, 7}};
        System.out.println( getTotal(test)+"\n"+
                            getAverage(test)+"\n"+
                            getRowTotal(test, 1)+"\n"+
                            getColumnTotal(test, 2)+"\n"+
                            getHighestInRow(test, 0)+"\n"+
                            getLowestInRow(test, 2));
    }
    public static int getTotal(int[][] array){
        int total = 0;
        for(int row = 0; row<array.length; row++){
            for(int col = 0; col<array[row].length; col++)
                total += array[row][col];
        }
        return total;
    }
    public static double getAverage(int[][] array){
        return (double)(getTotal(array)/(array.length*array[0].length));
    }
    public static int getRowTotal(int[][] array, int row){
        int total = 0;
        for(int col : array[row])
            total += col;
        return total;
    }
    public static int getColumnTotal(int[][] array, int col){
        int total = 0;
        for(int[] row : array)
            total += row[col];
        return total;
    }
    public static int getHighestInRow(int[][] array, int row){
        int buffer = 0;
        int highest = array[row][0];
        for(int col = 1; col<array[row].length; col++){
            buffer = array[row][col];
            if(buffer>highest)
                highest = buffer;
        }
        return highest;
    }
    public static int getLowestInRow(int[][] array, int row){
        int buffer = 0;
        int lowest = array[row][0];
        for(int col = 1; col<array[row].length; col++){
            buffer = array[row][col];
            if(buffer<lowest)
                lowest = buffer;
        }
        return lowest;
    }
    
        17.
        PhoneBookEntry name = new PhoneBookEntry("John", 314534);
        PhoneBookEntry name2 = new PhoneBookEntry("Joshua", 356593);
        PhoneBookEntry name3 = new PhoneBookEntry("Natalie", 754874);
        PhoneBookEntry name4 = new PhoneBookEntry("Claire", 354675);
        PhoneBookEntry name5 = new PhoneBookEntry("Potatoe", 345534);

        ArrayList<PhoneBookEntry> contacts = new ArrayList<>(5);
        contacts.add(name);
        contacts.add(name3);
        contacts.add(1, name2);
        contacts.add(3, name5);
        contacts.add(3, name4);
        
        for(PhoneBookEntry contact : contacts){
            System.out.println("Name: "+contact.getName()+
                                "\tNumber: "+contact.getNum());
        }
        18.//im too tired to think of 10 questions with answers...
        //nsk
        Question[] questions = new Question[10];
        
        19.
        int[][] square = {  { 4, 9, 2},
                            { 3, 5, 7},
                            { 8, 1, 6}};
        System.out.println(isLoShuMagicSquare(square));
    }
    public static boolean isLoShuMagicSquare(int[][] array){
        boolean magic = false;
        int[] total = { 0, 0, 0, 0, 0, 0, 0, 0};
        
        for(int col = 0; col<array.length; col++)
                total[0] +=array[0][col];
        for(int col = 0; col<array.length; col++)
                total[1] +=array[1][col];
        for(int col = 0; col<array.length; col++)
                total[2] +=array[2][col];
        for(int row = 0; row<array[0].length; row++)
                total[3] +=array[row][0];
        for(int row = 0; row<array[1].length; row++)
                total[4] +=array[row][1];
        for(int row = 0; row<array[2].length; row++)
                total[5] +=array[row][2];
        for(int row = 0; row<array.length; row++)
            for(int col = 0; col<array[row].length; col++){
                if(row == col)
                    total[6] += array[row][col];
            }
        for(int row = 0; row<array.length; row++)
            for(int col = 0; col<array[row].length; col++){
                if((row+col) == 2)
                    total[7] += array[row][col];
            }
        if(total[0] == total[1] && total[1] == total[2] && total[2] == total[3]
                && total[3] == total[4] && total[4] == total[5] && total[5] == total[6]
                && total[6] == total[7])
            magic = true;
        return magic;*/
    }
}
