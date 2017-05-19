package HakerRank_Java.DataStructures;

/*
You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.
*/

import java.util.*;

class JavaMap {
	public static void main(String []argh)
	{
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String, Integer> map = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	          
	          map.put(name, phone);
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(map.containsKey(s))
	        	 System.out.println(s+"="+map.get(s));
	         else
	        	 System.out.println("Not found");
	      }
	      
	      in.close();
	   }
}
