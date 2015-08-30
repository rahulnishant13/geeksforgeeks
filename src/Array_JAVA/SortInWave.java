/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class Wave
{
    private int [] arr;
    Wave()
    {
        arr = new int[]{10, 5, 6, 3, 2, 20, 100, 80};
    }
    void createWave()
    {
        int temp;
        for(int i=1; i<arr.length; i=i+2)
        {
            if( (i > 0) && (arr[i-1] > arr[i]))
            {
                temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }
            if( (i < (arr.length-1)) && (arr[i] < arr[i+1]))
            {
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] +" ");
    }
}

public class SortInWave
{
    public static void main(String [] args)
    {
        Wave obj = new Wave();
        obj.createWave();
    }
}
