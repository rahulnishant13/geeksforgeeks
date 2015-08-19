/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

import java.util.HashSet;

/**
 *
 * @author RAHUL
 */

class RepeatingElement
{
    private int [] arr;

    public RepeatingElement()
    {
        arr = new int[]{10, 5, 3, 4, 3, 5, 6};
    }

    void getElement()
    {
        HashSet<Integer> hs = new HashSet();
        int min = Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++)
        {
            if(hs.contains(arr[i])){
                if(min > i)
                    min = i;
            }
            else
                hs.add(arr[i]);
        }

        System.out.println("First Repeating No. is : "+arr[min]);
    }
}

public class FirstRepeatingElement
{
    public static void main(String [] args)
    {
        RepeatingElement obj = new RepeatingElement();
        obj.getElement();
    }
}
