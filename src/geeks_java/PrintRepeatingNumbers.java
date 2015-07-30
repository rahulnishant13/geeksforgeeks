/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class PrintNum
{
    int [] arr;

    void repeatedNumbers()
    {
        for(int i=0; i < arr.length; i++)
        {
            if(arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = - arr[Math.abs(arr[i])];
            else
                System.out.print(" "+Math.abs(arr[i]));
        }
    }

}

public class PrintRepeatingNumbers
{
    public static void main(String [] args)
    {
        PrintNum obj = new PrintNum();
        obj.arr = new int[]{2,4,1,5,2,6,1,4};
        obj.repeatedNumbers();
    }
}
