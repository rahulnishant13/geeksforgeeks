package HakerRank_Java.ExceptionHandling;

import java.util.Scanner;

public class ExampleTryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a/b);
		}
		catch(Exception e){
			System.out.println(e.getClass().getName() + (e.getClass().getName() == "java.util.InputMismatchException" ? "" : ": "+e.getMessage()));
		}
		sc.close();
	}

}
