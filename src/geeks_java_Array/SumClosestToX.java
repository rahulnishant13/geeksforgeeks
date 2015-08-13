/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class SumNearX
{
    private int [] arr;

    SumNearX()
    {
        arr = new int[]{10, 22, 28, 29, 30, 40};
    }

    void findNumber()
    {
         int i = 0, j = arr.length - 1,min_sum = Integer.MAX_VALUE,x =0,y=0;

         while(i <= j)
         {
             int sum = arr[i] + arr[j];
             if(Math.abs(sum - 54) < Math.abs(min_sum - 54))
             {
                 min_sum = sum;
                 x = i;
                 y = j;
             }

             if(sum < 54)
                 i++;
             else
                 j--;
         }

         System.out.println("Min Sum nearest to X : " +min_sum +" " +arr[x] +" " +arr[y]);
    }

}

public class SumClosestToX
{
    public static void main(String [] args)
    {
        SumNearX obj = new SumNearX();
        obj.findNumber();
    }
}