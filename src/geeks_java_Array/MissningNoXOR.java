package geeks_java_Array;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */
public class MissningNoXOR
{
    public static void main(String z[])
    {
        int[] arr = {1,3,5,2,6,7};
        int x=5,i;
        for ( i = 1; i <= x; i++)
        {
               arr[0] = arr[0] ^ arr[i] ;
         }

        for(i=1;i<=x+2;i++)
        {
            arr[0] = i^arr[0];

        }

        System.out.println("Missing Number : " +arr[0]);
    }

}
