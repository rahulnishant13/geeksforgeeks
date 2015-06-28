/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
public class revarr
{
    public static void main(String a[])
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int i,j=5,n=6;
        int temp;
  
        for(i=0;i<j;i++)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }

         for (i=0; i < n; i++)
         System.out.print(" " +arr[i]);
    }
}