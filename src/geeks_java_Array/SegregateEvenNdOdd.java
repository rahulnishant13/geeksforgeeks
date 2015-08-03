/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class SegEvenOdd
{
    int [] arr;
    void rearrange()
    {
        int j = arr.length-1;
        for(int i=0; i <= j;)
        {
            while((arr[i]%2 == 0) && i < j)
                i++;

            while((arr[j]%2 != 0) && j > i)
                j--;

            if(i < j)
            {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int i =0; i< arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class SegregateEvenNdOdd
{
    public static void main(String [] args)
    {
        SegEvenOdd obj = new SegEvenOdd();
        obj.arr = new int[]{2,3,5,8,10,7,9};
        obj.rearrange();
    }
}
