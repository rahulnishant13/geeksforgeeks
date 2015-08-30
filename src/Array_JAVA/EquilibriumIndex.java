/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class EquilibriumI
{
    int [] arr;

    void findIndex()
    {
        int sum=0,i,left=0;
        for( i=0; i < arr.length ;  i++)
            sum += arr[i];

        for( i=0; i< arr.length ; i++)
        {
            sum -= arr[i];

            if(left == sum)
                System.out.println(" "+i);
            else
                left += arr[i];
        }
    }
}

public class EquilibriumIndex
{
    public static void main(String [] args)
    {
        EquilibriumI obj = new EquilibriumI();
        obj.arr = new int[]{-7, 1, 5, 2, -4, 3, 0};
        obj.findIndex();
    }
}
