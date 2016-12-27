/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class Jump
{
    int [] arr;
    int [] jum;
    Jump()
    {
        arr = new int[]{1, 2, 0, 0, 3, 10, 5};
        jum = new int[arr.length+1];
    }

    void jumpArray()
    {
        int  j = 0;
        for(int i = (arr.length-1); i >= 0; i--)
        {
            if((arr[i] - j) > 0)
            {
                jum[i] = 1;
                j++;
            }
            else
            {
                int min = jum[i+1];
                for(int k=i+1; k < (i+arr[i]); k++)
                {
                    min = min<jum[k+1]?min:jum[k+1];
                }
                jum[i] = min + 1;
                j++;
            }
        }

        System.out.println("Minimum Required Jump : "+jum[0]);
    }
}

public class JumpToReachEnd
{
    public static void main(String [] args)
    {
        Jump obj = new Jump();
        obj.jumpArray();
    }
}
