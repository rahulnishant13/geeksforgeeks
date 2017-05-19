package HakerRank_Java.DataStructures;

import java.util.PriorityQueue;
import java.util.Scanner;

class Student1 implements Comparable<Student1>{
	   private int token;
	   private String fname;
	   private double cgpa;
	   public Student1(String fname, double cgpa, int id) {
	      super();
	      this.token = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getToken() {
	      return token;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
		@Override
		public int compareTo(Student1 o) {
			if(getCgpa() > o.getCgpa())
				return -1;
			else if(getCgpa() < o.getCgpa())
				return 1;
			else{
				if(getFname().compareTo(o.getFname()) == 0){
					if(getToken()<o.getToken())return -1;
			        if(getToken()>o.getToken())return 1;
			        return 0;
				}
				
				return getFname().compareTo(o.getFname());
			}
		}
	}

public class JavaPriorityQueue {

	public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      PriorityQueue<Student1> pq = new PriorityQueue<Student1>();
	      int totalEvents = Integer.parseInt(in.nextLine());
	      while(totalEvents>0){
	         String event = in.next();
	           
	         if(event.equals("ENTER")){
	        	 Student1 ob = new Student1(in.next(), in.nextDouble(), in.nextInt());
	        	 
	        	 pq.offer(ob);
	         }
	         
	         else if(event.equals("SERVED")){
	        	 if(pq.size() > 0) pq.poll();
	         }
	           
	         totalEvents--;
	      }
	      
	      in.close();
	      
	        if(pq.size()==0){
	            System.out.println("EMPTY");
	        }else{
	            for(;;){
	                Student1 stu=pq.poll();
	                if(stu==null)break;
	                System.out.println(stu.getFname());
	            }
	        }
	}

}
