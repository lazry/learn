/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Mik
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException{
        /*
        review
        1. c. 2. c. 3. a.
        4. c. 5. b. 6. c.
        7. d. 8. b. 9. c.
        10.a. 11.b. 12.F?
        13.F  14.T  15.F
        16.F  17.T. 18.T
        
        find error
        1. it cannot be static
        2. Coffe myCup = Coffe.DARK
           case statements without data types
        
        workbench
        1.
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(50);
        
        System.out.println(circle2);
        if(circle2.equals(circle1))
            System.out.println("circle2 has the same radius as circle1");
        else
            System.out.println("circle2 has NOT the same radius as circle1");
        if(circle1.greaterThan(circle2))
            System.out.println("circle2 has greater radius than circle1");
        else
            System.out.println("circle2 has smaller radius than circle1");
        
        2. a. 3 b. 3. c. 1 d. 0 
        e. three.putThing(8);
        3. enum storePet = { DOG, CAT, BIRD, HAMSTER };
        
        short answer
        1. can't collect or store data
        2. they provide easy access to operations
        3. variables are passed by values and objects by reference
        4. works the same as == operator
        5. it means that an aggreggation occurs
        6. the programm is terminated
        7. it is not. exception is when the referenced object is String type
        8. this is a key word that references the object itself
        9. a. Color b. RED, ORANGE, GREEN, BLUE c. Color shoes = Color.RED;
        10. a.POODLE
              BOXER
              TERRIER
            b. 0
               1
               2
            c. BOXER is NOT greater than TERRIER
        11. when it is no longer referenced
        
        programming challenges 
        1.
        Area demonstration = new Area();
        System.out.println(demonstration.getArea(2.0)+"\n"+
                            demonstration.getArea(2, 5)+"\n"+
                            demonstration.getArea(2.0, 5.0));
        3.
        double width, length, price;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter length of the room.");
        length = keyboard.nextDouble();
        System.out.println("Enter width of the room.");
        width = keyboard.nextDouble();
        System.out.println("Enter price per square foot for the carpet.");
        price = keyboard.nextDouble();
        
        RoomDimension room = new RoomDimension(length, width);
        RoomCarpet room2 = new RoomCarpet(room, price);
        System.out.println(room+"\n"+room2);
        
        4.
        double width, length;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter length of the tract 1.");
        length = keyboard.nextDouble();
        System.out.println("Enter width of the tract 1.");
        width = keyboard.nextDouble();
        LandTract tract1 = new LandTract(length, width);
        
        System.out.println("Enter length of the tract 2.");
        length = keyboard.nextDouble();
        System.out.println("Enter width of the tract 2.");
        width = keyboard.nextDouble();
        LandTract tract2 = new LandTract(length, width);
        
        String ans = tract1.equals(tract2) ? " are ":" are not ";
        System.out.println("Area of tract 1: "+tract1.getArea()+
                            "\nArea of tract 2: "+tract2.getArea()+
                            "\nTracts"+ans+"of equal size.");
        
        5.
        Month month = new Month("February");
        Month month2 = new Month(6);
        System.out.println(month.getMonthName()+" has number "+month.getMonthNumber()
                +"\n"+month.toString()+"\n");
        if(month.equals(month2))
            System.out.println("Its the same month");
        else
            System.out.println("Its different month");
        if(month2.greaterThan(month))
            System.out.println(month2.getMonthName()+" is greater than "+
                                month.getMonthName());
        else
            System.out.println(month2.getMonthName()+" is NOT greater than "+
                                month.getMonthName());
        
        6.7.
        //newlines doesn't work here...
        RetailItem jeans = new RetailItem("jeans", 79, 54.3);
        CashRegister today = new CashRegister(jeans, 34);
        System.out.printf("subtotal: %,.2f.\ntotal tax: %,.2f\ntotal: %,.2f\n",
                today.getSubtotal(), today.getTax(), today.getTotal());
        
        PrintWriter outputFile = new PrintWriter("SalesReceipt.txt");
        outputFile.printf("SALES RECEIPT \n Unit Price: $%,.2f"
                + "\nQuantity: %d \nSubtotal: $%,.2f"
                + "\nSales Tax: $%,.2f \nTotal: $%,.2f", jeans.getPrice(),
                today.getQuantity(), today.getSubtotal(), today.getTax(),
                today.getTotal());
        outputFile.close();
        
        8.
        ParkedCar ford = new ParkedCar("Ford", "Focus", "blue", 34754, 100);
        ParkingMeter ticket = new ParkingMeter(10);
        PoliceOfficer patrol = new PoliceOfficer("John Travis", 807);
        ParkingTicket ticket2 = patrol.examine(ford, ticket);
        if(ticket2.getFine()>0)
            System.out.println(ticket2);
        
        9.
        int choice = 0;
        do{
            choice = menu();
            execution(choice);
        }while(!(choice == 0 || choice == 4));
            
        
    }
    public static int menu(){
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        System.out.println("Geometry Calculator\n" +
                            "1. Calculate the Area of a Circle\n" +
                            "2. Calculate the Area of a Rectangle\n" +
                            "3. Calculate the Area of a Triangle\n" +
                            "4. Quit\n\n" +
                            "Enter your choice (1-4):");
        choice = keyboard.nextInt();
        if(choice<1 || choice>5)
            choice = 0;
        return choice;
    }
    public static void execution(int choice){
        Scanner keyboard = new Scanner(System.in);
        double input = 0, input2 = 0;
        
        switch(choice){
            case 0:
                System.out.println("Error. Wrong choice.");
                break;
            case 1:
                System.out.println("Enter circle radius.");
                input = keyboard.nextDouble();
                System.out.println("Area: "+Geometry.getAreaCircle(input));
                break;
            case 2:
                System.out.println("Enter rectangle width.");
                input = keyboard.nextDouble();
                System.out.println("Enter rectangle length.");
                input2 = keyboard.nextDouble();
                System.out.println("Area: "+Geometry.getAreaRectangle(input, input2));
                break;
            case 3:
                System.out.println("Enter triangle base.");
                input = keyboard.nextDouble();
                System.out.println("Enter triangle height.");
                input2 = keyboard.nextDouble();
                System.out.println("Area: "+Geometry.getAreaTriangle(input, input2));
                break;
        }
    }
        
        10.
        FuelGauge gauge = new FuelGauge(0);
        for(int i = 0; i<=15; i++){
            gauge.addGallon();
        }
        System.out.println("Gallons in gauge: "+gauge.getGallons());
        
        Odometer odometer = new Odometer(0, gauge);
        while(odometer.getGallons() != 0){
            odometer.addMileage();
            System.out.println("Mileage: "+odometer.getMileage()+
                    "\tGallons: "+odometer.getGallons());
        }
        
        11.
        Die die = new Die(6);
        Player one = new Player("Johny", die);
        Player two = new Player("Cena", die);
        boolean test = false, test2 = false;
        String winner = null;
        do{
            test = one.changePoints();
            test2 = two.changePoints();
            System.out.println(one+"\n"+two);
            if(test)
                System.out.println("The winner is "+one.getName());
            if(test2)
                System.out.println("The winner is "+two.getName());
        }while(!(test || test2));
        
        12.
        Scanner keyboard = new Scanner(System.in);
        Player2 one = new Player2("Jabba");
        Player2 two = new Player2("Han Solo");
        boolean test = false, test2 = false;
        do{
            System.out.println("Player n1 guess. Heads or tails?");
            test = one.round(keyboard.nextLine());
            System.out.println("Player n2 guess. Heads or tails?");
            test2 = two.round(keyboard.nextLine());
            System.out.println(one+"\n"+two);
            if(test)
                System.out.println("The winner is "+one.getName());
            if(test2)
                System.out.println("The winner is "+two.getName());
        }while(!(test || test2));*/
    }
}
