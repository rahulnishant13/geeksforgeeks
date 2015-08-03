/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class SearchElement
{
    int [] arr;
    SearchElement()
    {
        arr = new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3};
    }

    void pivotedBinarySearch(int x)
    {
        int pivot = findPivot(0, arr.length-1);
        if (pivot == -1)
            System.out.println("No DATA"); // no data

        if (arr[pivot] == x)
        {
            System.out.println("Data Found X "); // if found at pivot no need to search further
            return;
        }
        if (arr[0] <= x)
            binarySearch(0, pivot-1, x);
        else
            binarySearch( pivot+1, arr.length-1, x);
    }

    int findPivot(int low, int high)
    {
        if (high < low)  return -1;
        if (high == low) return low;

        int mid = (low + high)/2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid-1);
        if (arr[low] >= arr[mid])
            return findPivot(low, mid-1);
        else
            return findPivot(mid + 1, high);
    }

    void binarySearch( int low, int high, int x)
    {
        if(low > high)
        {
            System.out.println("Data Not Found");
            return;
        }

        int mid = (low + high)/2;
        if(x == arr[mid])
            System.out.println("Data Found");
        else if(x > arr[mid])
            binarySearch((mid + 1), high, x);
        else
            binarySearch(low, (mid -1), x);
    }

}

public class PivotedkArraySearchElement
{
    public static void main(String [] args)
    {
        SearchElement obj = new SearchElement();
        obj.pivotedBinarySearch(1);
    }
}
