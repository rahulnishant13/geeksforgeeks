/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

import java.util.Arrays;

/**
 *
 * @author RAHUL
 */

class FourElementSum
{
    private int arr[];
    private int sum;

    public FourElementSum()
    {
        arr = new int[]{};
    }
    void elementSum()
    {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 4; i++) {
            sum = sum - arr[i];
            for (int j = 1; j < arr.length - 2; j++) {
                sum = sum - arr[j];
                for (int k = 2; k < arr.length; k++) {
                    
                }
            }
        }
    }
}

public class FourElementSumN3
{
    public static void main(String [] args)
    {
        FourElementSum obj = new FourElementSum();
    }
}
