/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Mik
 */
public class NumberAnalysis {
    int[] numbers = new int[12];
    
    public NumberAnalysis(String fileName)throws IOException {
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        
        int index = 0;
        while(inputFile.hasNext()){
            numbers[index] = inputFile.nextInt();
            index++;
        }
        highest();
        lowest();
        System.out.println("Total: "+getTotal());
        System.out.println("Average: "+getAverage());
    }
    
    public void highest(){
        int index = 0;
        for(int row = 0; row<numbers.length; row++){
            if(numbers[row]>numbers[index])
                index = row;
        }
        System.out.println("The highest number: "+numbers[index]);
    }
    public void lowest(){
        int index = 0;
        for(int row = 0; row<numbers.length; row++){
            if(numbers[row]<numbers[index])
                index = row;
        }
        System.out.println("The lowest number: "+numbers[index]);
    }
    public int getTotal(){
        int total = 0;
        for(int row = 0; row<numbers.length; row++){
            total+=numbers[row];
        }
        return total;
    }
    public int getAverage(){
        return getTotal()/numbers.length;
    }
}
