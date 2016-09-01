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
public class Pet {
    private String name, animal;
    private int age;
    
    public void setName(String nam){
        name = nam;
    }
    public void setAnimal(String anim){
        animal = anim;
    }
    public void age(int a){
        age = a;
    }
    
    public String getName(){
        return name;
    }
    public String getAnimal(){
        return animal;
    }
    public int getNAge(){
        return age;
    }
}
