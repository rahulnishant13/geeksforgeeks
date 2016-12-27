/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.ArrayList;
/**
 *
 * @author RAHUL
 */

class Radix
{
    int [] arr;
    Radix()
    {
        arr = new int[]{1,4,2,3,5,10,8};
    }

    void radixSort(int maxDigits)
    {
        
        ArrayList<Integer>[] bucket = new ArrayList[10];
        for(int k=0; k < 10; k++)
        {
            bucket[k] = new ArrayList<Integer>();
        }

        boolean maxLength = false;
        int tmp = -1, placement = 1;
        while(!maxLength)
        {
            maxLength = true;
            for(Integer i : arr)
            {
                tmp = i / placement;
                bucket[tmp % 10].add(i);
                if (maxLength && tmp > 0)
                {
                    maxLength = false;
                }
            }
            // empty lists into input array
            int a = 0;
            for(int b = 0; b < 10; b++)
            {
                for(Integer i : bucket[b])
                {
                    arr[a++] = i;
                }
                bucket[b].clear();
            }

            placement *= 10;
         }

        for(int i=0; i< arr.length; i++)
        {
            System.out.print( " "+arr[i]);
        }
      }
}

public class RadixSort
{
    public static void main(String [] args)
    {
        Radix obj = new Radix();
        obj.radixSort(2);
    }
}
