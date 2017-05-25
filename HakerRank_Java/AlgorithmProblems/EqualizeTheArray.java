package HakerRank_Java.AlgorithmProblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(), x;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int a_i=0; a_i < n; a_i++){
        	x = in.nextInt();
        	if(hm.containsKey(x)){
        		hm.put(x, hm.get(x) + 1);
        	}
        	else{
        		hm.put(x, 1);
        	}
        }
        
        System.out.println(n - Collections.max(hm.values()));

        in.close();
	}

}
