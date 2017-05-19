package HakerRank_Java.DataStructures;

/*
In this problem you have to print the largest sum among all the hourglasses in the array.

Input Format
There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

Output Format
Print the answer to this problem on a single line.
*/

import java.util.*;

public class Array2D {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                if(sum > max)
                    max = sum;
                sum = 0;
            }
        }
        
        System.out.println(max);
    }
}
