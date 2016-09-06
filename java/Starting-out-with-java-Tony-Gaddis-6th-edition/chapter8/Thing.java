/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Mik
 */
public class Thing {
    private int x;
private int y;
private static int z = 0;
public Thing()
{
x = z;
y = z;
}
static void putThing(int a)
{
z = a;
}
public void getZ(){
    System.out.println(z);
}
}
