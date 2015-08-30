/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class ShiftArray
{
    int [] arr;
    ShiftArray()
    {
        arr = new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
    }
    void moveToEnd()
    {
        int i,j;
        for(i=0,j=0; i<arr.length; i++)
        {
            if(arr[j] == 0 )
            {
                if(arr[i] != 0)
                {
                    arr[j++] = arr[i];
                    arr[i] = 0;
                }
            }
            else
                j++;
        }

        for(i=0;i<arr.length;i++)
            System.out.print( arr[i]+" " );
    }
}

public class MoveZeroToEnd
{
    public static void main(String [] args)
    {
        ShiftArray obj = new ShiftArray();
        obj.moveToEnd();
    }
}
