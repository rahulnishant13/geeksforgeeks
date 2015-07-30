/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class PrintSmallestNumber
{
    int [] arr;
    void printnumber()
    {

        int i, first, second;

        if (arr.length < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }

        first = second = Integer.MAX_VALUE;
        for (i = 0; i < arr.length ; i ++)
        {
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }

            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second smallest element");
        else
            System.out.println("The smallest element is: "+first +" and second Smallest element is: "+ second);
    }
}

public class SmallestN2ndSmallest
{
    public static void main(String [] args)
    {
        PrintSmallestNumber obj = new PrintSmallestNumber();
        obj.arr = new int []{12, 13, 1, 10, 34, 22, 35, 11};
        obj.printnumber();
    }

}
