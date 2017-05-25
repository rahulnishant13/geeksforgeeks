package HakerRank_Java.AlgorithmProblems;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int max = Integer.MIN_VALUE;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            max = max < height[height_i] ? height[height_i] : max;
        }

        if( max - k > 0){
            System.out.println(max - k);        	
        }
        else{
        	System.out.println(0);
        }
        
        in.close();
	}

}
