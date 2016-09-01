/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author Mik
 */
public class DriverExam {
    String[] validAns = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B",
        "C", "D", "A", "D", "C", "C", "B", "D", "A"};
    String[] examAns = new String[20];
    
    public DriverExam(String[] array){
        for(int i = 0; i<array.length; i++)
            examAns[i] = array[i];            
    }
    public boolean passed(){
        boolean passed = false;
        if(totalCorrect()>14)
            passed = true;
        return passed;
    }
    public int totalCorrect(){
        int total = 0;
        for(int i = 0; i<validAns.length; i++){
            if(validAns[i].equalsIgnoreCase(examAns[i]))
                    total++;
        }
        return total;
    }
    public int totalIncorrect(){
        int total = 0;
        for(int i = 0; i<validAns.length; i++){
            if(!(examAns[i].equals("")))
                if(!(validAns[i].equalsIgnoreCase(examAns[i])))
                        total++;
        }
        return total;
    }
    public int questionsMissed(){
        int total = 0;
        for(int i = 0; i<validAns.length; i++)
            if(examAns[i].equals(""))
                total++;
        return total;
    }
}
