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
public class GradeBook {
    String[] names = new String[5];
    String[] grades = new String[5];
    double[][] studentsScores = new double[5][4];
    
    public GradeBook(String[] n, double[][] sS){
        for(int row = 0; row<n.length; row++){
            names[row] = n[row];
            for(int col = 0; col<sS[row].length; col++)
                studentsScores[row][col] = sS[row][col];
        }
            
    }
    public void getStudent(int index){
        double total = 0, average;
        char grade = 0;
        int drop = 0;
        for(int col = 0; col<studentsScores[index-1].length; col++){
            if(studentsScores[index-1][col]<studentsScores[index-1][drop])
                drop = col;
            total+= studentsScores[index-1][col];
            total -= studentsScores[index-1][drop];
        }
        average = total/4.0;
        if(average<60)
            grade = 'F';
        else if(average<70)
            grade = 'D';
        else if(average<80)
            grade = 'C';
        else if(average<90)
            grade = 'B';
        else if(average<101)
            grade = 'A';
        System.out.println("Student "+names[index-1]+" has average test score of "+
                average+"%.\nGrade: "+grade);
    }
}
