/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */
class C
{
    public int [] ar;
  
    void set_rev()
    {
        rev(ar,0,ar.length-1);
    }

   void rev(int [] ar, int s, int e)
    {
        if(s>e)
        {
           return;
        }
            int temp;
            temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;
            rev(ar, s+1, e-1);
     }

   void print()
    {
        for(int i =0; i < ar.length; i++)
        {
            System.out.print(" " + ar[i]);
        }
    }
 }

public class ReverseArray
{
    public static void main(String [] args)
    {
        C obj = new C();
        obj.ar = new int[]{1,2,4,6,7};
        obj.set_rev();
        obj.print();
    }
}