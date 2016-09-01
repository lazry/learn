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
public class Employee {
    private String name, department, position;
    private int idNumber;
    
    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }
    public Employee(String n, int iN){
        name = n;
        department = "";
        position = "";
        idNumber = iN;
    }
    public Employee(String n, String d, String p, int iN){
        name = n;
        department = d;
        position = p;
        idNumber = iN;
    }
    
    public void setName(String n){
        name = n;
    }
    public void setDepartment(String d){
        department = d;
    }
    public void setPosition(String p){
        position = p;
    }
    public void setIdNumber(int iN){
        idNumber = iN;
    }
    
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
    public int getIdNumber(){
        return idNumber;
    }
}
