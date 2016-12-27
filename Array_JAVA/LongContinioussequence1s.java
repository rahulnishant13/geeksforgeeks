/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class Replace0s
{
    int [] arr;
    Replace0s()
    {
        arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1};
    }

    void get0sIndex()
    {
        int prev,pprev,max=0,index=0;
        prev=pprev=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                if((i - pprev) > max)
                {
                    max = (i - pprev) + 1;
                    index = prev;
                }
                pprev = prev;
                prev = i;
            }
        }
        if ((arr.length-(pprev)) > max)
        {
            index = prev;
        }

        System.out.println("Max : "+ max +" Index to be repalced with 1 : "+index);
    }

}

public class LongContinioussequence1s
{
    public static void main(String [] args)
    {
        Replace0s obj = new Replace0s();
        obj.get0sIndex();
    }
}
