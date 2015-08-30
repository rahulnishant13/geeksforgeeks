/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class FindLeader
{
    int [] arr;
    void leader()
    {
        int max = arr[arr.length-1];
        System.out.print(+max);
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i] > max)
            {
                System.out.print(" "+arr[i]);
                max = arr[i];
            }

        }
    }
}

public class LeaderInArray
{
    public static void main(String [] args)
    {
        FindLeader obj = new FindLeader();
        obj.arr = new int[]{10,5,8,3,9,1};
        obj.leader();
    }

}
