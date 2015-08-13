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

class Duplicate
{
    private int [] arr;
    Duplicate()
    {
        arr = new int[]{10, 5, 3, 4, 3, 5, 6};
    }

    void checkDuplicate()
    {
        int k=3;
        HashSet<Integer> du = new HashSet();

        for(int i =0; i < arr.length; i++)
        {
            if(du.contains(arr[i]))
            {
                System.out.println( "Duplicate : "+arr[i] +" Index : " +i);
                return;
            }
            du.add(arr[i]);
            if(i>=k)
                du.remove(arr[i-k]);
        }
        System.out.println( "No Duplicate Within K ");
        return;
    }
}

public class DuplicateWithinKdist
{
    public static void main(String [] args)
    {
        Duplicate obj = new Duplicate();
        obj.checkDuplicate();
    }
}
