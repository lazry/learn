/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;
import java.util.Scanner;
import java.util.Random;
import java.io.*;

/**
 *
 * @author Mik
 */
public class chapter4 {
    public static void main(String[] args) throws IOException{
        /* true/false
        1. a.   2. b.   3. c.
        4. d.   5. a.   6. a.
        7. b.   8. a.   9. c.
        10.b.   11.b.   12.d.
        13.a/b? 14.a.   15.d.
        16.b.   17.d.   18.b.
        19.T    20.F    21.F
        22.F.   23.F    24.T
        25.T    26.F
        
        find error
        1.  it should be do-while loop
            i find its lack of braces disturbing 
        2.  total should be initialized with 0
            count isn't increased (then add braces)
        3.  (choice == 1);
        4.  use semicolons instead of , in for header
            doesn't need extra count++
        
        alogrithm workbench*/
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();/*
        1.        
        int product = 0, number = 0;
        
        while(product<100){
            System.out.println("Enter number.");
            number = keyboard.nextInt();
            product = number*10;
        }
        
        2.
        int answer;
        
        do{
            System.out.println("Enter two numbers.");
            int num1 = keyboard.nextInt();
            int num2 = keyboard.nextInt();
            
            int sum = num1+num2;
            System.out.println("The sum is: " + sum + "\nDo you want to perform "
                    + "again? 1=yes");
            
            answer = keyboard.nextInt();
        }   while(answer == 1);
                
        3.
        for(int i = 0; i<=1000; i+=10)
            System.out.println(i);
        
        4.
        int sum = 0;
        
        for(int i = 0; i<=10; i++){
            System.out.println("Enter a number");
            int number = keyboard.nextInt();
            
            sum +=number;
        }
        System.out.println("Total: " + sum);
        
        5.
        double total = 0;
        for (int i = 1, y = 30; i<=30; i++, y--){
            total += i/y;
        }
        
        6.
        for(int i = 0; i<10; i++){
            System.out.print("\n");
            for(int j = 0; j<15; j++)
                System.out.print("#");
        }
        
        7.
        int x = 1;
        do{
            System.out.print("Enter a number: ");
            x = keyboard.nextInt();
        } while(x > 0);
        
        8.
        String input;
        char sure;
        
        while (sure != 'Y' && sure != 'N'){
            System.out.print("Are you sure you want to quit? ");
            input = keyboard.next();
            sure = input.charAt(0);
        }
        
        9.
        for(int count = 0; count<50; count++)
            System.out.println("count is " + count);
        
        10.
        int x = 50;
        
        while(x > 0){
            System.out.println(x-- + " seconds to go.");
        }
        
        11. 
        int number = 0;
        do{
            System.out.println("Write a number in the range of 1 through 4.");
            number = keyboard.nextInt();
        }while(number<1 || number>4);
        
        12.
        String answer;
        do{
            System.out.println("Enter word yes or no.");
            answer = keyboard.nextLine();
        }while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yes")));
        
        13.
        for(int i = 0; i<7; i++){
            for(int j = 0; (j+i)<7;j++)
                System.out.print("*");
            System.out.print("\n");
        }
        
        14.
        for(int i = 0; i<6; i++){
            System.out.print("#");
            for(int j = 0; j<i; j++)
                System.out.print(" ");
            System.out.print("#\n");
        }
        
        15.
        int number = rand.nextInt(10) + 1;
        
        16.
        int number = 0;
        String answer;
        
        for(int i  = 0; i<10; i++){
            number = rand.nextInt(2);
            answer = (number==1) ? "Yes" : "No";
            System.out.println(answer);
        }
        
        17.
        PrintWriter outputFile = new PrintWriter("NumberList.txt");
        for(int i = 1; i<=100; i++)
            outputFile.println(i);
        outputFile.close();
        
        18./19.
        int line, total = 0;
        File file = new File("NumberList.txt");
        Scanner inputFile = new Scanner(file);
        
        while(inputFile.hasNext()){
            line = inputFile.nextInt();
            total+=line;
            System.out.println(line);
        }
        inputFile.close();
        System.out.println("Total: " + total);
        
        20.
        FileWriter fwriter = new FileWriter("NumberList.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter); 
        String input = keyboard.nextLine();
        outputFile.println(input);
        outputFile.close();
        
        short answer
        1.prefix works with variable before execution meets variable and postfix
        works with variable after execution meets variable.
        2.to know which loops are nested and how etc.
        3. postest does one iteration before facing the boolean and pretest does 
        any
        4.because they are executed only if the boolean expression in header 
        equals 1
        5.omg, while is pretest and do-while is posttest. also they differ in 
        syntax
        6.while
        7.do-while
        8.for
        9.because the memory address their names are referenced to already may 
        contain data
        10.is loop that always meets the boolean expression requiretments
        11.bill in a market
        12.it means to create sentinel
        13.the loop can be controlled by user?
        14.because it can't be used later in the loop
        15.jeeeez no idea.. clock? i'm not that creative
        16.it takes longer to write something to a disk than to memoryso the 
        data is stored in a buffer
        17.because the buffers are created while file is opened and data may 
        be lost unsaved
        18.it's a line where program is currently set to read. at the beginning
        19.println jumps to next line
        20.0
        21.
        22.it means to wrte more data to existing one
        23.using FileWriter
        
        programming challenges
        1.
        System.out.println("Enter nonzero positive integer value.");
        final int NUMBER = keyboard.nextInt();
        int total = 0;
        
        for(int i = 1; i<=NUMBER; i++)
            total+=i;
        System.out.println(total);
        
        2./3.
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
            distance = speed*i;
            outputFile.printf("%d%32d", i, distance);
            outputFile.println();
        }
        outputFile.close();
        
        4.
        int days;
        double salary = 0.005, total = 0;
        do{
            System.out.println("Enter days worked.");
            days = keyboard.nextInt();
        }while(days<1);
        
        System.out.println("Day\t\tSalary");
        System.out.println("______________________");
        for(int i = 1; i<=days; i++){
            salary*=2;
            total+=salary;
            System.out.printf("%d%28.2f$\n", i, salary);
        }
        System.out.println("Total: $" + total);
        
        5.
        System.out.println("Write a string and a character.");
        String word = keyboard.nextLine();
        int stringLength = word.length();
        String character = keyboard.nextLine();
        char character2 = character.charAt(0);
        int count = 0;
        
        for(int i = 0; i<stringLength; i++){
            char check = word.charAt(i);
            if(check == character2)
                count++;
        }
        System.out.println("There are " + count +" "+ character2 + " in word " + word);
        
        6.
        System.out.println("Write the name of a file.");
        String input = keyboard.nextLine();
        File file = new File(input);
        Scanner inputFile = new Scanner(file);
        
        System.out.println("Enter a character.");
        input = keyboard.nextLine();
        char character = input.charAt(0);
        
        int chars = 0;
        
        while(inputFile.hasNextLine()){
            String line = inputFile.nextLine();
            int lineLength = line.length();
            
            for(int i = 0; i<lineLength; i++)
                if(character == line.charAt(i))
                    chars++;
        }
        
        System.out.println("There are " + chars +" "+ character + " in a file.");    
        
        7.
        int floors, rooms = 0, occupied = 0, vacant = 0, buffer = 0;
        double occupancyRate;
        
        do{
            System.out.println("Enter the number of floors in a hotel.");
            floors = keyboard.nextInt();
        }while(floors<1);
        for(int i = 1; i<=floors; i++){
            do{
                System.out.println("Enter the number of rooms on floor " +i+ ".");
                buffer = keyboard.nextInt();
            }while(buffer<10);            
            System.out.println("Enter the number of occupied rooms on floor" +i+
                    ".");
            rooms += buffer;
            occupied += keyboard.nextInt();
        }
        occupancyRate = (double)occupied/rooms;
        System.out.println("There are "+rooms+" rooms in a hotel.\n"+occupied
                + " rooms are occupied.\n"+(rooms-occupied)+" rooms are vacant.\n"
                + "The occupacy rate is: "+occupancyRate);
        
        8.
        int years;
        double rainfall = 0, average = 0, buffer = 0;
        
        do{
            System.out.println("Enter the number of years");
            years = keyboard.nextInt();
        }while(years<1);
        
        for(int i = 0; i<years; i++){
            for(int j = 1; j<=12; j++){
                do{
                    System.out.println("Enter inches of rain for month "+j);
                    buffer = keyboard.nextInt();                    
                }while(buffer<0);
                rainfall += buffer;
            }
        }
        average = rainfall/(years*12);
        System.out.println("Months: "+years*12+"\nTotal inches: "+rainfall
                + "\nAverage: "+average);
        
        9.
        int days;
        double averageIncrease = 0, population;
        
        do{
            System.out.println("Enter starting number of organisms.");
            population = keyboard.nextInt();
        }while(population<2);
        do{
            System.out.println("Enter average daily population increase.");
            averageIncrease = keyboard.nextDouble();
        }while(averageIncrease<0);
        do{
            System.out.println("Enter days they will multiply.");
            days = keyboard.nextInt();
        }while(days<1);
        
        System.out.println("day\t\tpopulation\n_____________________");
        for(int i = 1; i<=days; i++){
            population*= (double)(averageIncrease+1);
            System.out.printf("%d%20.0f\n", i, population);
        }
        
        10.
        int number, max, min;
        System.out.println("Enter a series of integers to find min and max value.");
        number = keyboard.nextInt();
        max = number;
        min = number;
        
        while(number != (-99)){
            if(number>max)
                max = number;
            else if(number<min)
                min = number;
            number = keyboard.nextInt();
        }
        System.out.println("min: "+min+"\nmax: "+max);
        
        11.
        final int MAX = 20;
        double fahrenheit = 0;
        System.out.println("Celsius:\tFahrenheit\n__________________________");
        for(int celsius = 0; celsius<=MAX; celsius++){
            fahrenheit = 9/5*celsius+32;
            System.out.print(celsius);
            System.out.printf("%25.2f\n", fahrenheit);
        }
        
        12.
        final int MAX = 5;
        int one = 0,two = 0,three = 0,four = 0,five = 0, number = 0;
        for(int i = 1; i<=MAX; i++){
            System.out.println("Enter today's sales for store "+i+":");
            if(i==1)//honestly i couldnt find different way without using arrays
                one = keyboard.nextInt();
            else if(i==2)
                two = keyboard.nextInt();
            else if(i==3)
                three = keyboard.nextInt();
            else if(i==4)
                four = keyboard.nextInt();
            else if(i==5)
                five = keyboard.nextInt();
        }
        System.out.println("SALES BAR CHART");
        for(int i = 1; i<=MAX; i++){
            switch(i){
                case 1:
                    number = one/100;
                    break;
                case 2:
                    number = two/100;
                    break;
                case 3:
                    number = three/100;
                    break;
                case 4:
                    number = four/100;
                    break;
                case 5:
                    number = five/100;
                    break;    
            }
            System.out.print("Store "+i+": ");
            for(int j = 0; j<number; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        13.
        System.out.println("Enter name of file");
        String input = keyboard.nextLine();
        File file = new File(input);
        Scanner inputFile = new Scanner(file);
        
            for(int line = 1; line<=5; line++){
                if(inputFile.hasNextLine()){
                    input = inputFile.nextLine();
                    System.out.println(input);
                }
            }
        
        inputFile.close();
        
        14.
        System.out.println("Enter name of file");
        String input = keyboard.nextLine();
        File file = new File(input);
        Scanner inputFile = new Scanner(file);
        int i = 1;
        while(inputFile.hasNext()){
            input = inputFile.nextLine();
            System.out.println(i+". "+input);
            i++;
        }
        15.nsk
        System.out.println("Enter name of file to read.");
        String input = keyboard.nextLine();
        File file = new File(input);
        Scanner inputFile = new Scanner(input);
        System.out.println("Enter name of file to write.");
        String input2 = keyboard.nextLine();
        PrintWriter outputFile = new PrintWriter(input2);
        
        String buffer, take ="";
        while(inputFile.hasNextLine()){
            take = inputFile.nextLine();
            System.out.println(take);
            buffer = input.toUpperCase();
            outputFile.println(buffer);
        }
        inputFile.close();
        outputFile.close();
        
        16.
        System.out.println("Enter your monthly budget.");
        double budget = keyboard.nextDouble(), total = 0, number = 0, total2;
        System.out.println("Enter your expenses and -99 to end.");
        
        while(number != -99){
            total+= number;
            number = keyboard.nextInt();
        }
        
        total2 = budget-total;
        String overUnder = total2>=0? " over" : " under";
        System.out.println("You are $"+total2+overUnder+" the budget.");
        
        17.18.
         System.out.println("Enter number from 1-3");
         int number = rand.nextInt(3)+1;
         int input, count = 0;
         do{
            input = keyboard.nextInt();
            if(number>input)
                System.out.println("Too low, try again.");
            else if(number<input)
                System.out.println("Too high, try again.");
            count++;
         }while(number != input);
         System.out.println("You were guessing "+count+" time(s).");
         
        19.
        int guessed = 0;
        String guess, color = null;
        for(int i = 0; i<10; i++){
            int colorNum = rand.nextInt(5)+1;
            switch(colorNum){
                case 1:
                    color = "Red";
                    break;
                case 2:
                    color = "Green";
                    break;
                case 3:
                    color = "Blue";
                    break;
                case 4:
                    color = "Orange";
                    break;
                case 5:
                    color = "Yellow";
            }
            System.out.println("Guess the color.");
            guess = keyboard.nextLine();
            if(guess.equalsIgnoreCase(color))
                guessed++;
            System.out.println("Correct is: " +color);
        }
        System.out.println("You guessed correctly "+guessed+ " times.");
        
        20.
        int number = 0;
        do{
            System.out.println("Enter positive integer no greater than 15.");
            number = keyboard.nextInt();
        }while(number>15);
        for(int i = 0; i<number; i++){
            for(int j = 0; j<number; j++)
                System.out.print("X");
            System.out.println();
        }
        
        21.
        int userWins = 0, compWins = 0,userNum, compNum;
        String winner;
        System.out.println("Let's get ready to rumble!");
        for(int i = 1; i<=10; i++){
            System.out.print("\nRound "+i+".\nComputers turn: ");
            compNum = rand.nextInt(6)+1;
            System.out.print(compNum+"\nUsers turn: ");
            userNum = rand.nextInt(6)+1;
            System.out.println(userNum);
            
            if(userNum>compNum)
                userWins++;
            else if(compNum>userNum)
                compWins++;
        }
        winner = userWins>compWins ? "user." : "computer.";
        System.out.println("\nK.O!\nThe winner is "+winner);
        
        22.
        int picture;
        String pic = null, pic1 = null, pic2 = null, pic3 = null, againQuestion;
        double amount, won = 0, lost = 0, test;
        do{
            System.out.println("Enter amount of the money.");
            amount = keyboard.nextDouble();
            lost+=amount;
            for(int i = 0; i<3; i++){
                picture = rand.nextInt(6);
                switch (picture){
                    case 0:
                        pic = "Cherries";
                        break;
                    case 1:
                        pic = "Oranges";
                        break;
                    case 2:
                        pic = "Plums";
                        break;
                    case 3:
                        pic = "Bells";
                        break;
                    case 4:
                        pic = "Melons";
                        break;
                    case 5:
                        pic = "Bars";
                }
                switch(i){
                    case 0:
                        pic1 = pic;
                        break;
                    case 1:
                        pic2 = pic;
                        break;
                    case 2:
                        pic3 = pic;
                }
            }
            System.out.println(pic1+"  "+pic2+"  "+pic3);
            
            if(pic1.equals(pic2)){
                if(pic2.equals(pic3)){
                    amount*=3;
                    System.out.println("You have won 3 times the amount entered.");
                }
                else{
                    amount*=2;
                    System.out.println("You have won 2 times the amount entered.");
                }                    
            }
            else if(pic2.equals(pic3)){
                amount*=2;
                System.out.println("You have won 2 times the amount entered.");
            }
            else if(pic1.equals(pic3)){
                amount*=2;
                System.out.println("You have won 2 times the amount entered.");
            }
            else {
                amount=0;
                System.out.println("You have won $0.");
            }
            won+=amount;
            
            System.out.println("Would you like to play again? yes/no");
            keyboard.nextLine();
            againQuestion = keyboard.nextLine();
        }while(againQuestion.equalsIgnoreCase("yes"));
        
        System.out.println("Total amount entered: $"+lost+"\nTotal amount won: $"
                +won);*/
    }   
}
