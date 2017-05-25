package HakerRank_Java.AlgorithmProblems;

import java.util.HashSet;
import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        int count = 0,x;
        
        while(n > 0){
        	x = in.nextInt();
        	if(hs.contains(x)){
        		count++;
        		hs.remove(x);
        	}
        	else{
        		hs.add(x);
        	}
        	n--;
        }
        
        System.out.println(count);
        
        in.close();

	}

}
