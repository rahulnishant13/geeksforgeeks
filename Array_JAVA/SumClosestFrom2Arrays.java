/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class SumNearZ
{
    private int [] arr;
    private int [] brr;
    private int z;

    SumNearZ()
    {
        arr = new int[]{1, 4, 5, 7};
        brr = new int[]{10, 20, 30, 40};
        z = 32;
    }

    void findNumber()
    {
         int i = 0, j = brr.length - 1,min_sum = Integer.MAX_VALUE,x =0,y=0;

         while(i < arr.length && j >= 0)
         {
             int sum = arr[i] + brr[j];
             if(Math.abs(sum - z) < Math.abs(min_sum - z))
             {
                 min_sum = sum;
                 x = i;
                 y = j;
             }

             if(sum < z)
                 i++;
             else
                 j--;
         }

         System.out.println("Min Sum nearest to X : " +min_sum +" = " +arr[x] +" + " +brr[y]);
    }

}

public class SumClosestFrom2Arrays
{
    public static void main(String [] args)
    {
        SumNearZ obj = new SumNearZ();
        obj.findNumber();
    }
}