/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author RAHUL
 */

class Triplet
{
    private int [] arr;
    private int x;
    Triplet()
    {
        arr = new int[]{12, 3, 4, 1, 6, 9};
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextInt();
    }

    void findElements()
    {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
        {
            int z = x - arr[i],j=i+1,e=arr.length-1;
            while(j < e)
            {
                if((arr[j]+arr[e]) < z)
                    j++;
                else if((arr[j]+arr[e]) > z)
                    e--;
                else
                {
                    System.out.println("Triplet : "+arr[i] +" : " +arr[j] +" : " +arr[e] );
                    return;
                }

            }
        }
    }
}

public class TripletElementSum
{
    public static void main(String [] args)
    {
        Triplet obj = new Triplet();
        obj.findElements();
    }
}
