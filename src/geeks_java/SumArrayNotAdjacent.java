/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class SumNotAdjacent
{
    int [] arr;

    int max(int temp, int exc)
    {
        return( temp < exc ? exc : temp );
    }

    void sum()
    {
        int inc = arr[0],exc =0;

        for(int i=1;i < arr.length; i++)
        {
            int temp = inc;
            inc = arr[i] + exc;
            exc = this.max(temp, exc);
        }

        System.out.println("   "+this.max(exc, inc) );
    }

}

public class SumArrayNotAdjacent
{
    public static void main(String [] args)
    {
        SumNotAdjacent obj = new SumNotAdjacent();
        obj.arr = new int[]{1,5,2,7,12};
        obj.sum();
    }

}
