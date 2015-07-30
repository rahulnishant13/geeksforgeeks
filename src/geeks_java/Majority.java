/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class A
{
    public int [] arr;
    void majority()
    {
        int x = 0, count = 1;
        int i;
        for(i = 1; i < arr.length; i++)
        {
            if(arr[x] == arr[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                x = i;
                count = 1;
            }
        }
        System.out.println("Majority : " +arr[x]);
    }
}

public class Majority
{
    public static void main(String [] args)
    {
        
        A ob = new A();
        ob.arr = new int[]{5,3,1,2,5,3,5,5};
        ob.majority();
    }
}