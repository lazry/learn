/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Mik
 */
public class chapter7 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
    /*
    checkpoint
    7.1  
    a. int[] employeeNumbers = new int[100];
    b. double[] payRates = new double[25];
    c. float[] miles = new float[14];
    d. char[] letters = new char[1000];
    7.2 you can't declare negative numbers and halfs
    7.3 0, 1, 2, 3
    7.4 array's size declaration defines size and subscript starts from 0 to 
        and end on declaration value -1
    7.5 it means that it's different than declared subscripts in array
    7.6 an exception occures and program halts
    7.7 1, 2, 3, 4, 5
    7.8
    double[] statement = {1.7, 6.4, 8.9, 3.1, 9.2};     5 elements
    7.9
    result = numbers2[3]*numbers1[0];
    7.10
    int[] array = new int[5];
    for(int i = 0; i< array.length; i++){
        array[i] = -1;
    }
    7.11
    System.out.println("Enter the array size.");
    double[] values = new double[keyboard.nextInt()];
    7.12
    for(int i = 0; i<a.length; i++){
        b[i] = a[i]; 
    }
    7.13
    myMethod(numbers);
    7.14
    public static void zero(int[] array){
        for(int i = 0; i<array.length; i++){
            array[i] = 0;
        }
    }
    7.15
    String[] planets = {"Mercury", "Penus", "Earth", "Mars"};
    for(int i = 0; i<planets.length; i++){
        System.out.println(planets[i]);
    }
    for(String planet: planets){
        System.out.println(planet.charAt(0));
    }
    
        7.16
        Scanner keyboard = new Scanner(System.in);
        double length = 0, width = 0; 
        final int ELEMENTS = 5;
        Rectangle[] rectangles = new Rectangle[ELEMENTS];
        for(int i = 0; i<rectangles.length; i++){
            System.out.println("Enter length of rectangle number "+(i+1));
            length = keyboard.nextDouble();
            System.out.println("Enter width of rectangle number "+(i+1));
            width = keyboard.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }
        
        7.17
        int[][][] storage = new int[50][10][25];
        
        7.18
        smallest. it stores it in one of the first substracts.
        7.19
        just one
        7.20
        sequential doesn't have any requirements and searches one by one
        and binary searches by the middles
        7.21
        20,000?
        7.22
        more searched items should be placed first in the array
        7.23
        import java.util.ArrayList;
        7.24
        ArrayList<String> frogs = new ArrayList<>();
        7.25
        ArrayList<String> lizards = new ArrayList<>();
        7.26
        ArrayListObject.add(item);
        7.27
        ArrayListObject.remove(index);
        7.28
        ArrayListObject.get(index);
        7.29
        ArrayListObject.add(item);
        7.30 
        By adding or removing items.
        7.31
        The difference is how many items are stored and how many can be stored
        
        review
        1. a.? 2.a. 3.b.
        4. d. 5.a/c 6.c.
        7. b. 8. a. 9.d.
        10.a. 11.c. 12.a.
        13.a. 14.T  15.F
        16.T  17.T  18.T
        19.F  20.T  21.F
        22.T  23.T
        
        find the error
        1. you can't initialize array with negative size
        2. lack of braces around values
        3. wrong start of index
        4. lenght method of array is without parenthesis and of item is with
        5. words need to be uppered one by one
        
        workbench
        1.   
        String[] names = new String[20];
        for(String name: names){
            System.out.println(name);
        }
        2.
        int[] numberArray1 = new int[100];
        int[] numberArray2 = new int[100];
        for(int i = 0; i<numberArray1.length; i++){
            numberArray2[i] = numberArray1[i];
        }
        3.
        int total = 0;
        String[] scientists = {"Einstein", "Newton", "Copernicus", "Kepler"};
        for(String scientist : scientists){
            System.out.println(scientist);
        }
        for(String scientist : scientists){
            total += scientist.length();
        }
        System.out.println(total);
        4.
        String[] countries = new String[12];
        int[] population = new int[12];
        for(int i = 0; i<countries.length; i++){
            System.out.println("Enter a name and a population of country number "
            +(i+1));
            countries[i] = keyboard.nextLine();
            population[i] = keyboard.nextInt();
            keyboard.nextLine();
        }
        for(int i = 0; i<countries.length; i++){
            System.out.println((i+1)+". Country: "+countries[i]+"\tPopulation: "
                    +population[i]);
        }
        5.
        int[] idNum = new int[10];
        double[] grossPay = new double[10];
        //the rest is same as in previous exercise...
        6.7.
        int[][] grades = new int[30][10];
        int total = 0, count = 0;
        for(int row = 0; row<grades.length; row++){
            for(int col = 0; col<grades[row].length; col++){
                total +=grades[row][col];
                count++;
            }    
        }
        System.out.println("Average: "+total/count);
        8.
        int[][] numberArray = new int[9][11];
        numberArray[0][0] = 145;
        numberArray[8][10] = 18;
        9.
        double[][] values = new double[10][20];
        double total = 0;
        
        for(int row = 0; row<values.length; row++){
            for(int col = 0; col<values[row].length; col++){
                total +=values[row][col];
            }    
        }
        10.
        int[][] days = new int[29][5];
        //for rows
        int rowTotal = 0;
        for(int row = 0; row<days.length; row++){
            for(int col = 0; col<days[row].length; col++){
                rowTotal = days[row][col];
            }
            System.out.println("Total in row number "+(row+1)+" : "+rowTotal);
        }
        //for columns
        int index = 0, colTotal = 0;
        for(int col = 0; col<days[index].length; col++){
            for(int row = 0; row<days.length; row++){
                colTotal += days[row][col];
            }
            System.out.println("Total in column number "+(index+1)+" : "+colTotal);
        }
        11.
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Bentlieyey");
        cars.add(1, "FourD");
        cars.add("Meatsuebeshe");
        for(String array: cars){
            System.out.println(array);
        }
        
        short answer
        1. subscript is index of variable and size is index of array creating
        2. a. 10 b. 0 c. 9.
        3. a. 2 b. 14 c. 8
        4. with using braces and storing values inside them
        5. because this references store only addresses, not the actual values of
        arrays
        6. estabilish = declare? 
        7. it's ok
        8. 10 000
        9. a.8  b.10  c.80 d. sales[7][9] = 1;
        
        programming challenges
        in test.java file
        */
    
        
    }
}
