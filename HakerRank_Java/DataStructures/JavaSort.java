package HakerRank_Java.DataStructures;

/*
You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
*/

import java.util.*;

class Student{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	}

public class JavaSort implements Comparator<Student>
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }

      in.close();
      
      Collections.sort(studentList, new JavaSort());
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
   
   @Override
   public int compare(Student s1, Student s2){
	   
	   if(s1.getCgpa() == s2.getCgpa()){
		   if(s1.getFname().compareTo(s2.getFname()) == 0){
			   if(s1.getId() < s2.getId())
				   return 1;
			   else if(s1.getId() > s2.getId())
				   return -1;
			   else
				   return 0;
		   }
		   else
			   return s1.getFname().compareTo(s2.getFname());
	   }
	   
	   else if(s1.getCgpa() < s2.getCgpa())
		   return 1;
	   
	   else
		   return -1;
	   
   }
}