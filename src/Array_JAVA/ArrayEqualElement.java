/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.Arrays;
/**
 *
 * @author RAHUL
 */
public class ArrayEqualElement
{
    public static void main(String args[]) {

       // comparing two ArrayEqualElement

       int arr1[] = {1, 2, 3};
       int arr2[] = {1, 3, 2};
       if (Arrays.equals(arr1, arr2))
             System.out.println("Same");
       else
             System.out.println("Not same");

       //using final with ArrayEqualElement

        final int arr3[] = {1, 2, 3, 4, 5};
	int arr4[] = {10, 20, 30, 40, 50};
	arr4 = arr3;
//	arr3 = arr4; // arr3 is final
	for (int i = 0; i < arr4.length; i++)
		System.out.print(" "+arr4[i]);
    }
}