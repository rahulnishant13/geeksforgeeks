/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java;

/**
 *
 * @author RAHUL
 */

class Permutation
{
    private char [] arr;
    Permutation()
    {
        arr = new char[]{'A', 'B', 'C'};
    }

    void setfunc()
    {
        func(arr,0,arr.length);
    }

    void func(char [] zrr,int start, int end)
    {
        char [] brr = new char[zrr.length];
        System.arraycopy(zrr, 0, brr, 0, zrr.length);
        if(start == end)
        {

            System.out.print("  "+new String(brr));
            return;
        }

        for(int i = start; i < end; i++)
        {
            swap(brr,start,i);
            func(brr,start+1,end);
            swap(brr,i,start);
        }
    }

    void swap(char [] brr,int a, int b)
    {
        char temp ;
        temp = brr[a];
        brr[a] = brr[b];
        brr[b] = temp;
    }
}

public class PermutationOfStrings
{
    public static void main(String [] args)
    {
        Permutation obj = new Permutation();
        obj.setfunc();       
    }
}