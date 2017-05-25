package HakerRank_Java.AlgorithmProblems;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();  
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
        	max = max > height[i] ? max : height[i];
        	
        	if(hm.containsKey(height[i])){
        		hm.put(height[i], hm.get(height[i]) + 1);
        	}
        	else{
        		hm.put(height[i], 1);
        	}
        }
        
//        for(Map.Entry m:hm.entrySet()){  
//        	   System.out.println(m.getKey()+" "+m.getValue());  
//        	  }  
        
        System.out.println(hm.get(max));
        
        in.close();
    }
}
