package geeks_java_Array;

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
    void majority(int arr[],int n)
    {
        int rslt;
        rslt = findCandidate(arr, n);

        if(checkmajority(arr,n,rslt))
            System.out.print("Found : " +rslt);
        else
            System.out.print("NULL");
    }

   
    int findCandidate(int arr[],int n)
    {
        int majority_index = 0, count = 1;
        int i;
        for(i = 1; i < n; i++)
        {
            if(arr[majority_index] == arr[i])
                count++;
            else
                count--;
            if(count == 0)
            {
                majority_index = i;
                count = 1;
            }
        }
        return arr[majority_index];
    }

    boolean checkmajority(int arr[], int n, int majority_value)
    {
        int i,z=0;
        for(i=0;i<n;i++)
        {
            if(majority_value == arr[i])
            z++;
        }
        if(z > n/2)
            return true;
        else
            return false;

    }
}

public class MajorityMooresmajority {
    public static void main(String z[])
    {
        int a[] = {1, 3, 3, 1, 3, 3, 2};
        A ob = new A();
        ob.majority(a, 5);
    }

}
