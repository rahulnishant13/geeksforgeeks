/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class CircularSubarraySum
{
    int [] arr;
    public CircularSubarraySum()
    {
        arr = new int[]{10, -3, -4, 7, 6, 5, -4, -1};
    }

    int maxCircularSum()
    {
        int maxSum = checkMaxSum();
        int maxWrap = 0;

        for(int i = 0; i < arr.length; i++)
        {
            maxWrap += arr[i];
            arr[i] = -arr[i];
        }

        maxWrap = maxWrap + checkMaxSum();
        return maxWrap > maxSum ? maxWrap : maxSum;
    }

    private int checkMaxSum()
    {
        int sum =0, max =0;
        for(int i =0; i < arr.length; i++)
        {
            sum += arr[i];

            if(sum < 0)
                sum = 0;

            if(max < sum)
                max = sum;
        }
        return max;
    }
    
}

public class MaximumCircularSubarraySum
{
    public static void main(String [] args)
    {
        CircularSubarraySum obj = new CircularSubarraySum();
        System.out.println(obj.maxCircularSum());
    }
}
