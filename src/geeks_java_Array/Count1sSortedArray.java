/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class BinarySearchCount
{
    public int [] arr;
    BinarySearchCount()
    {
        arr = new int[]{1, 1, 1, 1, 0, 0, 0};
    }

    void setCount()
    {
        int x =getIndex(0,arr.length);
        System.out.println( "Count : " +x );
    }

    int getIndex(int low, int high)
    {
        while(low < high)
        {
            int mid = (low+high)/2;

            if ( (mid == high || arr[mid+1] == 0) && (arr[mid] == 1))
                return mid+1;

            if(arr[mid] == 1)
                getIndex(mid,high);
            else
                getIndex(low,mid-1);
        }

        return 0;
        
    }
}

public class Count1sSortedArray
{
    public static void main(String [] args)
    {
        BinarySearchCount obj = new BinarySearchCount();
        obj.setCount();
    }
}
