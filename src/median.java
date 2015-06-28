/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAHUL
 */

class A
{
    int median(int arr[], int n)
    {
        if (n%2 == 0)
        return (arr[n/2] + arr[n/2-1])/2;
    else
        return arr[n/2];
    }


    int getMedian(int ar1[], int ar2[], int n)
    {
        int m1,m2;
        if(n<=0)
            return -1;

        else if(n == 1)
            return (ar1[0]+ar2[0])/2;

        else if(n == 2)
            return (Math.max(ar1[0], ar2[0]) + Math.min(ar1[1], ar2[1])) / 2;

        m1 = median(ar1, n);
        m2 = median(ar2, n);

        if(m1 == m2)
            return m1;

        else if(m1 < m2)
        {
            if (n % 2 == 0)
                return getMedian(ar1 + n/2 - 1, ar2, n - n/2 +1);
            else
                return getMedian(ar1 + n/2, ar2, n - n/2);
        }

    }
}


public class median {
   public static void main(String z[])
   {
        int[] ar1 = {1, 12, 15, 26, 38};
        int[] ar2 = {2, 13, 17, 30, 45};
        int n1=ar1.length,n2=ar2.length;
        A ob = new A();
        if (n1 == n2)
            System.out.print("Median is %d" +ob.getMedian(ar1, ar2, n2));
        else
            System.out.print("Doesn't work for arrays of unequal size");
    }
}