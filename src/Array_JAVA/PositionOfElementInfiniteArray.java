/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */

class InfiniteArraySearch
{
    private int data;
    private int [] arr;

    InfiniteArraySearch(int d)
    {
        data = d;
        arr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
    }

    void minMaxIndex()
    {
        int h=1;
        while( arr[h] < data )
        {
            h = 2*h;
        }
        bnrySearch(h,h*2);
    }

    void bnrySearch(int low, int high)
    {
        while(low < high)
        {
            int mid = (low+high)/2 ;

            if(arr[mid] == data)
            {
                System.out.println("Found Index : "+mid);
                return;
            }

            if(arr[mid] < data)
                bnrySearch(mid+1, high);
            else
                bnrySearch(low, mid-1);
        }
    }
}

public class PositionOfElementInfiniteArray
{
    public static void main(String [] args)
    {
        InfiniteArraySearch obj = new InfiniteArraySearch(5);
        obj.minMaxIndex();
    }
}
