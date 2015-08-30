/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class SortedRotated
{
    private int [] arr;

    SortedRotated()
    {
        arr = new int[]{5,4,3,2,1};
    }
    
    int getArrLen()
    {
        return arr.length-1;
    }

    void getMinimum(int low, int high)
    {
        while(low < high)
        {
            int mid = (low+high)/2;

            if(arr[0] < arr[arr.length-1])
            {
                System.out.println("Minimum is : "+arr[low]);
                return;
            }
            if(arr[arr.length-2] > arr[arr.length-1])
            {
                System.out.println("Minimum is : "+arr[arr.length-1]);
                return;
            }

            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1])
            {
                System.out.println("Minimum is : "+arr[mid]);
                return;
            }

            else if(low < mid && arr[low] < arr[mid])
                    getMinimum(mid+1, high);

            else if(high > mid && arr[high] > arr[mid])
                    getMinimum(low, mid-1);
        }
    }
}

public class MinimumElementInSortedRotated
{
    public static void main(String [] args)
    {
        SortedRotated obj = new SortedRotated();
        obj.getMinimum(0, obj.getArrLen());
    }
}
