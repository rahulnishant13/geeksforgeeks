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
public class PairArraySumX
{
    public static void main(String args[])
    {
        int [] arr = {2,7,3,9,12,4,8};
        int i=0,j,x = 10;
        j = arr.length -1;

        Arrays.sort(arr);   
         while(i<j)
        {
            if((arr[i]+arr[j]) > x)
            j--;

            else if((arr[i] + arr[j]) < x)
            i++;

            else if((arr[i] + arr[j]) == x)
            {
                System.out.println("Found");
                return;
            }
        }

        for(i=0; i< arr.length; i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if((arr[i] + arr[j]) == x)
                {
                    System.out.println("Found");
                    break;
                }
            }
        }

        int [] brr = new int[x];

        for(i=0;i<arr.length;i++)
        {
            if(arr[i] < 10)
            brr[(10 - arr[i])] = 1;
        }
        for(i=0;i<arr.length;i++)
        {
            if(brr[arr[i]] == 1)
            {
                System.out.println("FOUND");
                return;
            }
        }
    }
}
