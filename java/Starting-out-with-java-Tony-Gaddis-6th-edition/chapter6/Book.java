/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author Mik
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;
    
    public Book(String t, String a, String p, int cS){
        title = t;
        author = a;
        publisher = p;
        copiesSold = cS;
    }
    
    public void setTitle(String t){
        title = t;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setPublisher(String p){
        publisher = p;
    }
    public void setCopiesSold(int cS){
        copiesSold = cS;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getPublisher(){
        return publisher;
    }
    public int getCopiesSOld(){
        return copiesSold;
    }
}
