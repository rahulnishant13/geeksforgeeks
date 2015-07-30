/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;
import java.util.Arrays;
/**
 *
 * @author RAHUL
 */

class SumZero
{
    int [] arr;

    void findNumber()
    {
         Arrays.sort(arr);
         int i = 0, j = arr.length - 1,min_sum = Integer.MAX_VALUE,x =0,y=0;

         while(i <= j)
         {
             int sum = arr[i] + arr[j];
             if(Math.abs(sum) < Math.abs(min_sum))
             {
                 min_sum = sum;
                 x = i;
                 y = j;
             }

             if(sum < 0)
                 i++;
             else
                 j--;
         }

         System.out.println("Min Sum nearest to Zero : " +min_sum +" " +arr[x] +" " +arr[y]);
    }

}

public class SumClosestZero
{
    public static void main(String [] args)
    {
        SumZero obj = new SumZero();
        obj.arr = new int[]{1,60,-10,70,-80,85};
        obj.findNumber();
    }
}