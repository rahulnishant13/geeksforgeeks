/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class CelngFlr
{
    int [] arr;

    int callCelling(int x)
    {
        x = getCelling(x , 0, arr.length-1);
        return x;
    }

    int getCelling(int x, int low,int high)
    {
        int mid;

        if(x < arr[low])
            return 0;
        if(x > arr[high])
            return -1;

        mid = (low + high)/2;

        if(arr[mid] == x)
            return mid;
        else if(arr[mid] < x)
        {
            if(mid+1 <= high && x <= arr[mid+1])
                return mid+1;
            else
              return getCelling(x,mid+1,high);
        }
        else
        {
            if(mid-1 >= low && x >= arr[mid-1])
                return mid-1;
            else
               return getCelling(x,low+1,mid-1);
        }
    }
}

public class CellingFloorOfNum
{
    public static void main(String [] args)
    {
        CelngFlr obj = new CelngFlr();
       // int [] arr = new int[]{2,5,7,9};
        obj.arr = new int[]{2,5,7,9};
        System.out.print(obj.arr.length);
        int index;
        index = obj.callCelling(7);

        if(index == -1)
            System.out.println("Celling not found");
        else
            System.out.println("celling found : " +obj.arr[index]);
    }
}
