package HakerRank_Java.BigNumber;


/*
In this problem you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like long integer.
Use the power of Java's BigInteger class and solve this problem.

Input Format
There will be two lines containing two numbers, aa and bb.

Constraints
aa and bb are non-negative integers and can have maximum 200200 digits.

Output Format
Output two lines. The first line should contain a+ba+b, and the second line should contain a×ba×b. Don't print any leading zeros.
*/

import java.util.*;
import java.math.*;

public class BigIntegerC{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        sc.close();
    }
}
