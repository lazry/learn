/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Mik
 */
public class boxes {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "HI, I'm Ben");
        String answer;
        int age;
        answer = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(answer);
        System.out.println("If i were two times older i would be " + 2*age + ".");
        System.exit(0);
    }
}
