/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class MaxSum
{
    private int [] arr;
    private int [] sum;
    public MaxSum()
    {
        arr = new int[]{1, 101, 2, 3, 100, 4, 5};
        sum = new int[arr.length];
    }

    void getMaxSum()
    {
        System.arraycopy(arr, 0, sum, 0, arr.length);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = i-1; j >= 0; j--)
            {
                if((arr[i] > arr[j]) && (sum[i] < (arr[i] + sum[j])))
                    sum[i] = sum[j] + arr[i];

                if(max < sum[i])
                    max = sum[i];
            }
        }

        System.out.println(" Max Sum Is : "+max);

    }

}

public class MaxSumIncreasingSubsequence
{
    public static void main(String [] args)
    {
        MaxSum obj = new MaxSum();
        obj.getMaxSum();
    }
}
