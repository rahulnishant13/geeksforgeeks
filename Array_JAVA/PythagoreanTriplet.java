/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.Arrays;
/**
 *
 * @author RAHUL
 */

class TripletSq
{
    private int [] arr;
    TripletSq()
    {
        arr = new int[]{3, 1, 4, 6, 5};
    }

    void getTriplet()
    {
        int i;
        for( i=0; i<arr.length; i++)
            arr[i] *= arr[i];

        Arrays.sort(arr);

        for(i=arr.length-2; i >= 0; i--)
        {
            int l =0,r = i;
            while(l < r)
            {
                if((arr[l] + arr[r]) == arr[i+1])
                {
                    System.out.println( "Yes "); //Pythagorean Triplet : "+arr[i+1] +" : "+arr[l] + " : "+arr[r] );
                    return;
                }
                else
                {
                    int x = (arr[l] + arr[r]) < arr[i+1] ? l++ : r-- ;
                }
            }
        }
    }
}

public class PythagoreanTriplet
{
    public static void main(String [] args)
    {
        TripletSq obj = new TripletSq();
        obj.getTriplet();
    }
}
