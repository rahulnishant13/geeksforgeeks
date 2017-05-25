package HakerRank_Java.String;

/*
Given a string AA, print "Yes" if it is a palindrome, print "No" otherwise. The strings will consist lower case english letters only. The strings will have at most 50 characters.

Some examples of palindromes are "madam", "anna", "reviver".
*/

import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        if(A.compareTo(new StringBuffer(A).reverse().toString()) == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
