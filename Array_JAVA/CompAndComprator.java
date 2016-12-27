/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.*;
/**
 *
 * @author RAHUL
 */

class Dog implements Comparator<Dog>, Comparable<Dog>
{
    private int age;
    private String name;

    Dog(){}

    Dog(String n, int a)
    {
        name = n;
        age = a;
    }

    public String getDogName()
    {
        return name;
    }

    public int getDogAge(){
      return age;
   }

   public int compareTo(Dog d){
      return (this.name).compareTo(d.name);
   }

   public int compare(Dog d, Dog d1){
      return d.age - d1.age;
   }
}


public class CompAndComprator
{
    public static void main(String [] args)
    {
         List<Dog> al = new ArrayList<Dog>();

        al.add(new Dog("German",13));
        al.add(new Dog("French",2));
        al.add(new Dog("Saggy",8));
        al.add(new Dog("Lepord",10));
        al.add(new Dog("Axd",5));

        Collections.sort(al);
        for(Dog a: al)
               System.out.print(a.getDogName() + ", ");

        Collections.sort(al, new Dog());
        System.out.println(" ");
        for(Dog a: al)
             System.out.print(a.getDogName() +"  : "+a.getDogAge() + ", ");
    }
}
