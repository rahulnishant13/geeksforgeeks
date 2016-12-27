package Array_JAVA;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
import java.util.*;
public class binaryhash {
    public static void main(String z[])
    {
        int arr[]={1,3,22,3,21,2,6};
        int MAX=10000;
        int d=24;
       HashMap h=new HashMap();

        for(int i=0;i<arr.length;i++)
        {
             h.put(arr[i], d - arr[i]);
           
        }

         for(int i=0;i<arr.length;i++)
        {
            if(h.containsValue(arr[i]))
            {
                System.out.print("Founr"+arr[i]+" "+(d-arr[i]));
                return;
            }
        }

        return;

    }

}
