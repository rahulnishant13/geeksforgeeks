/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class KthSearch
{
    int [] arr1;
    int [] arr2;
    void setSearch(int l)
    {
        int number = kthlargest(arr1.length-1,arr1.length-1, l);
        System.out.println("The Number is : " +number);
    }

    int kthlargest(int j,int k, int l)
    {
          if ((arr1.length -1) == 0)
                return arr2[l];
            else if((arr2.length -1) == 0)
                return arr1[l];

            int mid1,mid2;
            mid1 = j/2;
            mid2 = k/2;

            if ((mid1+mid2) < l)
            {
                if(arr1[mid1] > arr2[mid2])
                    return kthlargest();
                else
                    return kthlargest(arr1[mida1+1:], arr2, k-mida1-1);
            }
            else
            {
                if(arr1[mida1] > arr2[mida2])
                    return kthlargest(arr1[:mida1], arr2, k);
                else
                    return kthlargest(arr1, arr2[:mida2], k);
            }
    }
}

public class KthElementIn2SortedArray
{
    public static void main(String [] args)
    {
        KthSearch obj = new KthSearch();
        obj.arr = new int []{};
        obj.arr1 = new int []{};
        obj.setSearch(5);
    }
}
