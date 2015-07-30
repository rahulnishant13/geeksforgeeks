/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class CheckArray
{
    int [] arr;

    void checkNumbers()
    {
        int max,min;
        max = min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(max < arr[i])
                max = arr[i];
            else if(min > arr[i])
                min = arr[i];
        }

        if((max - min) == (arr.length - 1))
            System.out.println("Array is Consequative");
        else
            System.out.println("Array is NOT Consequative");
    }
}

public class ConsequtiveElements
{
    public static void main(String [] args)
    {
        CheckArray obj = new CheckArray();
        obj.arr = new int[]{34, 23, 52, 12, 3 };
        obj.checkNumbers();
    }
}
