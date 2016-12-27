/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class SumHash
{
    private int [] arr;
    SumHash()
    {
        arr = new int[]{1, 4, 45, 6, 0, 19};
    }
    void getSum(int n)
    {
        int j=0,i,sum = 0,size=Integer.MAX_VALUE,x=0,y=0;
        for( i=0; i<arr.length; i++)
        {
            while(sum <= n && i < arr.length)
                sum += arr[i++];

            while(sum >= n && j < arr.length)
            {
                if((i-j) < size)
                {
                    size = i-j;
                    x = j;
                    y = i;
                }
                sum -= arr[j++];
            }
        }
        System.out.println(x+" "+y);
    }
}

public class SmallestSubArraySumX
{
    public static void main(String [] args)
    {
        SumHash obj = new SumHash();
        obj.getSum(51);
    }
}
