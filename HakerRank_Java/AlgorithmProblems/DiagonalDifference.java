package HakerRank_Java.AlgorithmProblems;

import java.util.Scanner;
 
/*
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 */

public class DiagonalDifference {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        in.close();
        
        int sumd1 =0, sumd2=0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(i == j)
                    sumd1 += a[i][j];
                 if(i+j == n-1)
                     sumd2 += a[i][j];
            }
        }
        
        sumd1 -= sumd2;
        if(sumd1 > 0){
            System.out.println(sumd1);
        }
        else{
            System.out.println(sumd1*-1);
        }
    }

}
