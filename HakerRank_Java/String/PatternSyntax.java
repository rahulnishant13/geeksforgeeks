package HakerRank_Java.String;

/*
In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format
The first line of input contains an integer NN, denoting the number of testcases. The next NN lines contain a string of any printable characters representing the pattern of a regex.

Output Format
For each testcase, print "Valid" if the syntax of the given pattern is correct. Otherwise, print "Invalid". Do not print the quotes.
*/

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntax
{
	public static void main(String[] args){
	      Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	         String pattern = in.nextLine();
	         try{
	             Pattern.compile(pattern);
	             System.out.println("Valid");
	         }
	          catch(PatternSyntaxException e){
	             System.out.println("Invalid");
	          }
	      }
	      in.close();
	   }
}
