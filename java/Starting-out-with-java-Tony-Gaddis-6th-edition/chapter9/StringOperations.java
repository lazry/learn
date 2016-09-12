/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author Mik
 */
public class StringOperations {
    public static int WordCount(String str){
        int count = 0;
        String[] words = str.split("[\n\t ]");
        for(String word: words)
            count++;
        return count;
    }
    public static String arrayToString(char[] array){
        StringBuilder strB = new StringBuilder();
        strB.append(array);
        return strB.toString();
    }
    public static char mostFrequent(String str){
        char[] chars = str.toCharArray();
        char mostChar = 0;
        int count = 0, countMax = 0;
        for(char ch:chars){
            count = 0;
            for(char character:chars){
                if(ch == character)
                    count++;
            }
            if(count>countMax)
                mostChar = ch;
        }
        return mostChar;
    }
    public static String replaceSubstring(String str1, String str2, String str3){
        StringBuilder strB = new StringBuilder(str1);
        int index = strB.indexOf(str2, 0);
        do{
            strB.replace(index, (index+str2.length()), str3);
            index = strB.indexOf(str2, 0);
        }while(index != -1);
        return strB.toString();
    }
}
