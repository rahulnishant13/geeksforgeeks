package HakerRank_Java.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Stack<String> st = new Stack<String>();
	    		
	      while (sc.hasNext()) {
	         String input=sc.nextLine();
	         
	         for(int i = 0; i<input.length(); i++){
	        	 String c = input.substring(i, i+1);
	        	 if(!st.isEmpty()){
		        	 if(c.equals("}") && st.peek().equals("{")){
		        		 st.pop();
		        	 }
		        	 else if(c.equals(")") && st.peek().equals("(")){
		        		 st.pop();
		        	 }
		        	 else if(c.equals("]") && st.peek().equals("[")){
		        		 st.pop();
		        	 }
		        	 else{
		        		 st.push(c);
		        	 }
	        	 }
	        	 else{
	        		 st.push(c);
	        	 }
	         }
	         
	         System.out.println((st.isEmpty() ? "true" : "false"));
	         st.clear();
	      }

	      sc.close();
	}

}
