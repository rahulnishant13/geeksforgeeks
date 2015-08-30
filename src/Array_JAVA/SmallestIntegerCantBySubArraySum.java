/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class CheckSum
{
    private int [] arr;
    CheckSum()
    {
        arr = new int[]{1, 3, 6, 10, 11, 15};
    }

    void sumArray()
    {
        int sum =1;
        for(int i=0; i<arr.length && sum >= arr[i]; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}

public class SmallestIntegerCantBySubArraySum
{
    public static void main(String [] args)
    {
        CheckSum obj = new CheckSum();
        obj.sumArray();
    }
}
