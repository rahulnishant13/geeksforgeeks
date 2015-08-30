/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class MergePath
{
    private int [] arr1;
    private int [] arr2;

    MergePath()
    {
        arr1 = new int[]{2, 3, 7, 10, 12, 15, 30, 34};
        arr2 = new int[]{1, 5, 7, 8, 10, 15, 16, 19};
    }

    void calSumPath()
    {
        int i=0, j=0, sum1=0, sum2=0, sumTotal =0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                sum1 = sum1 + arr1[i++];
            }
            else if(arr1[i] > arr2[j])
            {
                sum2 = sum2 + arr2[j++];
            }
            else
            {
                sum1 = sum1 < sum2 ? sum2 : sum1 ;
                sumTotal = sumTotal + sum1 + arr1[i];
                sum1=sum2=0;
                i++; j++;
            }
        }
      
            while(i < arr1.length)
            {
                sum1 = sum1 + arr1[i++];
            }

     
            while(j < arr2.length)
            {
                sum2 = sum2 + arr2[j++];
            }

        sum1 = sum1 < sum2 ? sum2 : sum1;
        sumTotal = sumTotal + sum1;

        System.out.println( "Sum Total : "+sumTotal );
    }
}

public class SumPathInArrays
{
    public static void main(String [] args)
    {
        MergePath obj = new MergePath();
        obj.calSumPath();
    }
}
