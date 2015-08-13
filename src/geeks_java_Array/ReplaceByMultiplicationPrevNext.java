/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class MultiplyPrevNext
{
    int [] arr;
    MultiplyPrevNext()
    {
        arr = new int[]{2, 3, 4, 5, 6};
    }

    void updateArray()
    {
        if (arr.length <= 1)
          return;

        int prev = arr[0];
        arr[0] = arr[0] * arr[1];

        for (int i=1; i<arr.length-1; i++)
        {
            int curr = arr[i];

            arr[i] = prev * arr[i+1];
            prev = curr;
        }
        arr[arr.length-1] = prev * arr[arr.length-1];

        for(int i =0; i<arr.length; i++)
            System.out.print(arr[i] +" ");
    }
}

public class ReplaceByMultiplicationPrevNext
{
    public static void main(String [] args)
    {
        MultiplyPrevNext obj = new MultiplyPrevNext();
        obj.updateArray();
    }
}
