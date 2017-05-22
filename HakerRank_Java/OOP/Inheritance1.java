package HakerRank_Java.OOP;

class Animal{
	   void walk()
	   {
	      System.out.println("I am walking");
	   }
	}

class Bird extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
   }
   
   void sing()
   {
      System.out.println("I am singing");
   }
}

public class Inheritance1 {

	   public static void main(String args[])
	   {
	     Bird b = new Bird();
	     b.walk();  // child class can access super class method
	     b.fly();
	     b.sing();
	     
//	     Super class reference can't access child class methods
//	     Animal a = new Animal();
//	     a.walk();
//	     
//	     Animal c = new Bird();
//	     c.walk();
	     
	     
	   }


}
