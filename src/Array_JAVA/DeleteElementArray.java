/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */

class DeleteElemnt
{
    private int [] arr;
    private int x;
    DeleteElemnt()
    {
        arr = new int[]{2, 3, 7, 6, 8, -1, -10, 15};
        Scanner ad = new Scanner(System.in);
        this.x = ad.nextInt();
    }

    void deleteData()
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                while(i < arr.length-1)
                {
                    arr[i] = arr[i+1];
                    i++;
                }
            }
        }
        for(int i=0; i<arr.length-1; i++)
            System.out.print( arr[i] +"  " );
    }
}

public class DeleteElementArray
{
    public static void main(String [] args)
    {
        DeleteElemnt obj = new DeleteElemnt();
        obj.deleteData();
    }
}
