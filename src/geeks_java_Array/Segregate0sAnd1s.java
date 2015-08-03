/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class Segregate
{
    int [] arr;
    void reaarange()
    {
        int i=0,j = arr.length-1;

        while(i < j)
        {
            while(arr[i] == 0 && i < j )
                i++;
            while(arr[j] == 1 && i < j)
                j--;
            if(i < j)
            {

                arr[i++]=0;
                arr[j++]=1;
            }
        }

        for(i=0; i < arr.length; i++)
            System.out.print(" "+arr[i]);
    }
}

public class Segregate0sAnd1s
{
    public static void main(String [] args)
    {
        Segregate obj = new Segregate();
        obj.arr = new int[]{0,0,1,0,0,1};
        obj.reaarange();
    }
}
