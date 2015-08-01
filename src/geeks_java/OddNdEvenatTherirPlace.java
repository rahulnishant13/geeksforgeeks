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

class Reaarange
{
    private int [] arr;
    Reaarange()
    {
        System.out.println("Enter no. of elements : ");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        arr = new int[x];
        System.out.println("Enter the elements : ");
        for(int i =0; i < x; i++)
            arr[i] = sc.nextInt();
    }

    void setPosition()
    {
        int i = 0, j = 1, n = arr.length;
        while((i < n) || (j < n))
        {
            while(( i < n ) && (arr[i]%2 == 1))
                i += 2;
            while(( j < n ) && (arr[j]%2 == 0))
                j += 2;
            if(i < n || j < n)
                swap(i,j);
        }
        for(i=0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    void swap(int i, int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class OddNdEvenatTherirPlace
{
    public static void main(String [] args)
    {
        Reaarange obj = new Reaarange();
        obj.setPosition();
    }
}
