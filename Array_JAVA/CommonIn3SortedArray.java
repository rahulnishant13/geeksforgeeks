/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class CommonInArrays
{
    private int [] arr1;
    private int [] arr2;
    private int [] arr3;
    CommonInArrays()
    {
        arr1 = new int[]{1, 5, 10, 20, 40, 80};
        arr2 = new int[]{6, 7, 20, 80, 100};
        arr3 = new int[]{3, 4, 15, 20, 30, 70, 80, 120};
    }

    void getCommon()
    {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length)
        {
             if (arr1[i] == arr2[j] && arr2[j] == arr3[k])
             {
                  System.out.print( arr1[i] +" , " );
                  i++; j++; k++;
             }

             else if (arr1[i] < arr2[j])
                 i++;

             else if (arr2[j] < arr3[k])
                 j++;

             else
                 k++;
        }
    }
}

public class CommonIn3SortedArray
{
    public static void main(String [] args)
    {
        CommonInArrays obj = new CommonInArrays();
        obj.getCommon();
    }
}