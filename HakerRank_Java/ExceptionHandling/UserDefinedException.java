package HakerRank_Java.ExceptionHandling;

import java.util.Scanner;

class MyCalculator{
    public static int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception ("n and p should be non-negative");
        } else {
            return ((int)Math.pow(n,p));
        }
    }
}

public class UserDefinedException {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);

		  while ( in .hasNextInt()) {
		   int n = in .nextInt();
		   int p = in .nextInt();
		    
		   try {
		    System.out.println(MyCalculator.power(n, p));
		   } catch (Exception e) {
		    System.out.println(e);
		   }
		  }
		 in.close();
	}

}
