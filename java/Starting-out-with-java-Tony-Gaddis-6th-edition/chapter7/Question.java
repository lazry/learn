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
public class Question {
    String question;
    String one;
    String two;
    String three;
    String four;
    int correct;
    
    public Question(int c, String q, String... answers){
        correct = c;
        question = q;
        one = answers[1];
        two = answers[2];
        three = answers[3];
        four = answers[4];
    }
    public int getCorrect(){
        return correct;
    }
    public String getQuestion(){
        return question;
    }
    public String getOne(){
        return one;
    }
    public String getTwo(){
        return two;
    }
    public String getThree(){
        return three;
    }
    public String getFour(){
        return four;
    }
    
}
