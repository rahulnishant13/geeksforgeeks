/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class Search
{
    int [] arr;

    void binarySearch(int search)
    {
        int i =0, j = arr.length -1, mid = ((i + j)/2) ;

        while(i <= j)
        {
            if ( arr[mid] < search )
                i = mid + 1;

            else if ( arr[mid] == search )
            {
                System.out.println(search + " found at location " + (mid + 1));
                break;
            }

            else
                j = mid - 1;

            mid = (i + j)/2;
        }

        if(i > j)
            System.out.println("Data not found");
    }

}

public class BinarySearch
{
    public static void main(String [] args)
    {
        Search ob = new Search();
        ob.arr = new int[]{2,5,6,8,9};
        int x = 7;
        ob.binarySearch(x);
    }
}
