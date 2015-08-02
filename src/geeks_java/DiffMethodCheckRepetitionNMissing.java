/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */

class CkeckRepetitionMissing
{
    int [] arr;
    CkeckRepetitionMissing()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int x = sc.nextInt();
        arr = new int[x];
       // System.out.println(x+"Enter elements : ");

        for(int i=0; i < x; i++)
            arr[i] = sc.nextInt();
    }

    void getMissingAndRepeted()
    {
        int arr_prod = 1,sum = 0, x;
        for(int i=0; i < arr.length; i++)
        {
            sum = sum + arr[i];
            arr_prod = arr_prod * arr[i];
        }

        int i=1;
        x = fact(arr.length);

        while( i < (arr.length+1))
        {
            if(arr_prod % i == 0)
            {
                sum -= i;
                System.out.println("xn   :  "+sum);
                i++;
            }
            else
            {
                System.out.println("Missing No. is : " +i);
                i++;
            }
        }
        System.out.println("Repaeated No. is : "+sum);

    }

    int fact(int x)
    {
        int z=1;
       if (x > 1)
            z = x * fact(x-1);
        return z;
    }
}

public class DiffMethodCheckRepetitionNMissing
{
    public static void main(String [] args)
    {
        CkeckRepetitionMissing obj = new CkeckRepetitionMissing();
        obj.getMissingAndRepeted();
    }
}
