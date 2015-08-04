/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class GetArray
{
    private int [] pair;
    private int [] arr;
    GetArray(int x)
    {
        pair = new int[]{15,13,11,10,12,10,8,8,7,5};
        arr = new int[x];
    }

    void arrayFromSum()
    {
        arr[0] = ( (pair[0] + pair[1]) - pair[arr.length-1])/2;
        for(int i=1; i<arr.length; i++)
        {
            arr[i] = pair[i-1] - arr[0];
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print( arr[i] + " , ");
        }
    }
}

public class ArrayFromPairSum
{
    public static void main(String [] args)
    {
        GetArray obj = new GetArray(5);
        obj.arrayFromSum();
    }
}
