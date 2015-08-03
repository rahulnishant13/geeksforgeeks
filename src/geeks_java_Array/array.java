/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;
import java.util.Arrays;
/**
 *
 * @author RAHUL
 */
public class array
{
    public static void main(String args[]) {
       int arr[] = {10, 20, 30, 40, 50};
       for(int i=0; i < arr.length; i++)
       {
             System.out.println(" " + arr[i]);
       }

       // comparing two array

       int arr1[] = {1, 2, 3};
       int arr2[] = {1, 3, 2};
       if (Arrays.equals(arr1, arr2))
             System.out.println("Same");
       else
             System.out.println("Not same");

       //using final with array

        final int arr3[] = {1, 2, 3, 4, 5};
	int arr4[] = {10, 20, 30, 40, 50};
	arr4 = arr3;
//	arr3 = arr4; // arr3 is final
	for (int i = 0; i < arr4.length; i++)
		System.out.println(arr4[i]);
    }
}