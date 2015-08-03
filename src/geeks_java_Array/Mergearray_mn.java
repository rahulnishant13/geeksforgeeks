/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class MergeArray
{
   public int [] arr1;
   public int [] arr2;

    void merge()
    {
        int i,j=3,k=2;

        for(i=6;i>0;i--)
        {
            if(arr1[j] > arr2[k])
            {
                arr1[i] = arr1[j];
                j--;
            }else
            {
                arr1[i]=arr2[k];
                k--;
            }
        }

        while(i >= 0)
        {
            if(k >= 0)
            {
                arr1[i] = arr2[k];
                k--;
            }else
            {
                arr1[i]=arr1[j];
                j--;
            }
            i--;
       }

      for(i=0;i<7;i++)
         System.out.print(" " +arr1[i]);
    }
}

public class Mergearray_mn {
    public static void main(String x[]){
        MergeArray obj = new MergeArray();
        obj.arr1 = new int[]{5,9,12,20,0,0,0};
        obj.arr2 = new int[]{3,7,18};

        obj.merge();
    }
}