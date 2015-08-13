package geeks_java_Array;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
public class MissingNoContinious {
    public static void main(String z[]){
        Scanner input = new Scanner(System.in);
        int i,x,x1,x2,sum,rslt=1;
        System.out.println("Please enter no. of inputs: ");
        x = input.nextInt();
        int[] num = new int[x];
        System.out.println("Please enter input values: ");
        for (i = 0; i < x; i++){
            num[i] = input.nextInt();
        }
        
       sum = ((x+1)*(x+2))/2;

       for ( i = 0; i < x; i++){
           sum = sum - num[i];
        }

       x1 = num[0];
       x2 = 1;
       for(i = 1; i< x; i++)
         x1 = x1^num[i];
            
      for( i = 2; i <= x+1; i++)
        x2 = x2^i;         
    
    System.out.println("Missing Number " +sum +" " +(x1^x2));
    }

}
