package HakerRank_Java.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
           int input = in.nextInt();
           
           deque.add(input);
           hs.add(input);
           
           if(deque.size() == m){
        	   if(hs.size() > max) max = hs.size();
               int first = (int)deque.remove(); // out boxing
               if(!deque.contains(first)) hs.remove(first);
           }
        }
        
        System.out.println(max);
        
        in.close();
    }

}