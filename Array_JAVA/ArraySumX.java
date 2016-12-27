/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */
import java.util.Arrays;

public class ArraySumX {
    public static void main(String z[]){

        int[] arr={-8, 1, 12, 4, 10, 45};
        Arrays.sort(arr);

        int i=0,l=5,x=0,d=16;
        
        while(i<=l)
        {
            if((arr[i]+arr[l]) > 16)
                l--;
            else if((arr[i] + arr[l]) < 16)
                i++;
            else if((arr[i] + arr[l]) == 16)
            {
                System.out.println("FOUND");
                break;
            }

        }
        System.out.print(" " +arr[i] + " " +arr[l]);
        return;
    }

}
