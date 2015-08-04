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

class HashElement
{
    private int [] arr;
    HashElement()
    {
        arr = new int[]{10, 5, 3, 4, 3, 5, 6};
    }

    void hashData()
    {
        HashSet<Integer> x = new HashSet();
        for(int i=0; i < arr.length; i++)
        {
            if(!x.contains(arr[i]))
            {
                x.add(arr[i]);
                System.out.print( arr[i]+" , "  );
            }

        }
    }
}

public class DistinctElementHashSet
{
    public static void main(String [] args)
    {
        HashElement obj = new HashElement();
        obj.hashData();
    }
}
