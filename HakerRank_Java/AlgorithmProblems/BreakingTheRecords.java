package HakerRank_Java.AlgorithmProblems;

import java.util.Scanner;

public class BreakingTheRecords {
	static int[] getRecord(int[] s){

		int [] ar = new int[2];
		int h = s[0], l = s[0];
		for(int i =1; i < s.length; i++){
			if(h < s[i]){
				h = s[i];
				ar[0]++;
			}
			if(l > s[i]){
				l = s[i];
				ar[1]++;
			}
		}
		
		return ar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        
        in.close();
        
        int[] result = getRecord(s);
        
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
