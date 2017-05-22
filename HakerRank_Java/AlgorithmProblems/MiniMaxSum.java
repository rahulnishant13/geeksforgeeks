package HakerRank_Java.AlgorithmProblems;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        Arrays.sort(arr);
        
        BigInteger sum1 = BigInteger.valueOf(0);
        BigInteger sum2 = BigInteger.valueOf(0);        		
        
        for(int i=0; i<4; i++){
            sum1 = sum1.add(BigInteger.valueOf(arr[i]));

            sum2 = sum2.add(BigInteger.valueOf(arr[i+1]));                	
        }
        
        System.out.println( sum1 + " " + sum2);
        
        in.close();
    }

}
