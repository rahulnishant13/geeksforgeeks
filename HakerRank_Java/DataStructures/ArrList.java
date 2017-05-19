package HakerRank_Java.DataStructures;

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.
You are given nn lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in ythyth position of xthxth line. 
Take your input from System.in.

Input Format
The first line has an integer nn. In each of the next nn lines there will be an integer dd denoting number of integers on that line and then there will be dd space-separated integers. In the next line there will be an integer qq denoting number of queries. Each query will consist of two integers xx and yy.

Output Format
In each line, output the number located in ythyth position of xthxth line. If there is no such position, just print "ERROR!"
*/

import java.util.*;

public class ArrList {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<x; i++){
        	int y= sc.nextInt();
        	ArrayList<Integer> bl = new ArrayList<Integer>();
            for(int j=0; j<y; j++){
                bl.add(sc.nextInt());
            }
            al.add(bl);
        }
        
//        for(int i=0; i<al.size(); i++){
//            for(int j=0; j<al.get(i).size(); j++){
//            	System.out.print(al.get(i).get(j)+" ");
//            }
//            System.out.println();
//       }
        
        x = sc.nextInt();
        for(int i =0; i<x; i++){
        	try{
        		int y = al.get(sc.nextInt()-1).get(sc.nextInt()-1);
        		System.out.println(y);
        	}
        	catch(IndexOutOfBoundsException e){
        		System.out.println("ERROR!");
        	}
        }
        
        sc.close();
    }
	
}
