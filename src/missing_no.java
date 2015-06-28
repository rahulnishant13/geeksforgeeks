
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
public class missing_no {
    public static void main(String z[]){
        Scanner input = new Scanner(System.in);
        int x,sum;
        x = input.nextInt();
        int[] num = new int[x];
        for (int i = 0; i < x; i++){
            System.out.println("Please enter number");
            num[i] = input.nextInt();
        }

       sum = (x*(x+1))/2;

       for (int i = 0; i < x; i++){
           sum = sum - num[i];
        }
        System.out.println("Missing Number" +sum);
    }

}
