package HakerRank_Java.AlgorithmProblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(), x, y=Integer.MAX_VALUE;

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
        
        Integer mb = Collections.max(hm.values());
        
        for(Entry<Integer, Integer> en : hm.entrySet()){
        	if(en.getValue().equals(mb))
        		if(y >  en.getKey())
        			y = en.getKey();
        }

		System.out.println(y);
        in.close();
	}

}
