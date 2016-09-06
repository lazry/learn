/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;
import java.util.Random;
/**
 *
 * @author Mik
 */
public class Die {
    private int sides; // Number of sides
    private int value; // The die's value

    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }
    public Die(Die die)
    {
        this.sides = die.sides;
        roll();
    }

    public void roll()
    {
        Random rand = new Random();

        value = rand.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }
}