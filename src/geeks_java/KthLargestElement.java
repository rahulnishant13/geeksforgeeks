/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class Kthnumber
{
    int [] arr;
    void quicksort(int pivot)
    {
        int i,j,temp,low=0,h=arr.length-1;
        i = low;
        for(j=low+1;j <= h;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
            temp = arr[i];
            arr[i] = pivot;
            arr[low] = temp;
        System.out.println("Kth number : "+arr[pivot]);
    }
}

public class KthLargestElement
{
    public static void main(String [] args)
    {
        Kthnumber obj = new Kthnumber();
        obj.arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        int x = 5;
        obj.quicksort(x);
    }
}
