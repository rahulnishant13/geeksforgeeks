/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.HashSet;
/**
 *
 * @author RAHUL
 */

class SumZero
{
    private int [] arr;
    SumZero()
    {
        arr = new int[]{-3, 2, 3, 1, 6};
    }

    void checkSubArray()
    {
        HashSet<Integer> su = new HashSet();
        int sum =0;
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
            if(su.contains(sum))
            {
                System.out.println("Zero present ");
                return;
            }
            su.add(sum);
        }
    }
}

public class SubArrayWithSumZero
{
    public static void main(String [] args)
    {
        SumZero obj = new SumZero();
        obj.checkSubArray();
    }
}
