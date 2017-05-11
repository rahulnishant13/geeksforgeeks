package HakerRank_Java.String;

/*
Given a string, find number of words in that string. For this problem a word is defined by a string of one or more english alphabets.

There are multiple ways to tokenize a string in java, learn how to tokenize a string in java and demonstrate your skill by solving this problem!

Input Format
A string not more than 400000 characters long. The string can be defined by following regular expression:
[A-Za-z !,?.\_'@]+
That means the string will only contain english alphabets, blank spaces and this characters: "!,?._'@".

Output Format
In the first line, print number of words nn in the string. The words don't need to be unique. In the next nn lines, print all the words you found in the order they appeared in the input.
*/

import java.util.*;

public class StringToken {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String [] a = s.split("[^\\p{Alpha}]+");
        
        System.out.println(a.length);
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        
        
        scan.close();
    }
}
