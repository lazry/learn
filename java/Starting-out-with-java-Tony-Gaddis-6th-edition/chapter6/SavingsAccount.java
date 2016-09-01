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
public class SavingsAccount {
    private double balance;
    private int annualInterestRate;
    
    public SavingsAccount(double b){
        balance = b;
        
    }
    
    public double getBalance(){
        return balance;
    }
    public void setAnnualRate(int aIR){
        annualInterestRate = aIR;
    }
    public double deposit(double m){
        balance += m;
        return m;
    }
    public double withdrawal(double m){
        balance -= m;
        return m;
    }
    public double addMonthlyInterestRate(){
        double m = balance*(annualInterestRate/1200.00);
        balance += m;
        return m;
    }
    public double addMonthlyInterestRate(int annualInterestRate){
        double m = balance*(annualInterestRate/1200.00);
        balance += m;
        return m;
    }
}
