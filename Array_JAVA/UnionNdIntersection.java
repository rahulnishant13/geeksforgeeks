/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author RAHUL
 */

class HashSetArrays
{
    int [] arr1;
    int [] arr2;
    HashSetArrays()
    {
        arr1 = new int[]{7, 1, 5, 2, 3, 6};
        arr2 = new int[]{3, 8, 6, 20, 7};
    }

    void getUnionIntersection()
    {
        HashSet<Integer> ui = new HashSet<Integer>();
        for(int i=0;i<arr1.length; i++)
            ui.add(arr1[i]);
        
        System.out.println("Intersection : ");

        for(int i=0; i<arr2.length; i++)
        {
            if(!ui.contains(arr2[i]))
                ui.add(arr2[i]);
            else
                System.out.print( arr2[i] + " ");

        }

        System.out.println("\nUnion : ");
        Iterator<Integer> itr=ui.iterator();  
        while(itr.hasNext())
            System.out.print(itr.next() +" ");
    
    }
}
public class UnionNdIntersection
{
    public static void main(String [] args)
    {
        HashSetArrays obj = new HashSetArrays();
        obj.getUnionIntersection();
    }
}
