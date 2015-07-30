/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class Difference
{
    int [] arr;

    void maxDiff()
    {

        int diff = arr[1]-arr[0];
        int curr_sum = diff;
        int max_sum = curr_sum;

        for(int i=1; i < arr.length-1; i++)
        {
            diff = arr[i+1]-arr[i];
            if (curr_sum > 0)
               curr_sum += diff;
            else
               curr_sum = diff;

            if (curr_sum > max_sum)
               max_sum = curr_sum;
        }
        System.out.println("Max diff : " + max_sum);
    }
}

public class MaxDiffLargeComesAfterSmaller
{
    public static void main(String [] args)
    {
        Difference obj = new Difference();
        obj.arr = new int[]{15,6,3,9,18};
        obj.maxDiff();
    }
}
