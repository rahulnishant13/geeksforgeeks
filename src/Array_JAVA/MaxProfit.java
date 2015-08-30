/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class CalculateProfit
{
    int [] arr;
    int [] profit;
    CalculateProfit()
    {
        arr = new int[]{100, 30, 15, 10, 8, 25, 80};
        profit = new int[arr.length];
    }

    void leftProfitArray()
    {
        int max_cost = arr[arr.length-1],max_profit =0,min;
        profit[arr.length-1] = 0;
        for(int i = arr.length -2; i >= 0; i-- )
        {
            max_cost =  max_cost < arr[i] ? arr[i] : max_cost;
            profit[i] = max_profit < (max_cost - arr[i]) ? (max_cost - arr[i]) : max_profit;
        }

        min = arr[0];
        max_profit = profit[0];
        for(int i = 1; i< arr.length; i++)
        {
            min = min < arr[i] ? min : arr[i];

            max_profit = max_profit < (profit[i] - (arr[i] - min)) ? (profit[i] - (arr[i] - min)) : max_profit;
        }

        System.out.println( "Maximum Profit : " +max_profit );
    }
}

public class MaxProfit
{
    public static void main(String [] args)
    {
        CalculateProfit obj = new CalculateProfit();
        obj.leftProfitArray();
    }
}
