/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;
import java.util.*;
//import java.io.*;
/**
 *
 * @author RAHUL
 */

class Student
{
    int rollno;
    String name;
    int age;

    Student(int rollno,String name,int age)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}

class NameComparator implements Comparator
{
    NameComparator(){}

    public int compare(Object o1,Object o2)
    {
        Student s1=(Student)o1;
        Student s2=(Student)o2;

        return s1.name.compareTo(s2.name);
    }

}


class SortByFrequency
{
    public static void main(String args[])
    {
        ArrayList al=new ArrayList();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        System.out.println("Sorting by Name...");

        Collections.sort(al, new NameComparator());
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("sorting by age...");

 }
}
