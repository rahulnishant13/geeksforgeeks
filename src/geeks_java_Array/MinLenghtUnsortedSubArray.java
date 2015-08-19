/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;

/**
 *
 * @author RAHUL
 */

class UnsortedArrayIndex
{
    private int [] arr;

    public UnsortedArrayIndex()
    {
        arr = new int[]{10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
    }

    void getIndex()
    {
        int s = 0, e = arr.length-1, i, max, min;

      for (s = 0; s < arr.length-1; s++)
      {
        if (arr[s] > arr[s+1])
          break;
      }
      if (s == arr.length-1)
      {
        System.out.println("The complete array is sorted");
        return;
      }

      for(e = arr.length - 1; e > 0; e--)
      {
        if(arr[e] < arr[e-1])
          break;
      }

      max = arr[s]; min = arr[s];
      for(i = s + 1; i <= e; i++)
      {
        if(arr[i] > max)
          max = arr[i];
        if(arr[i] < min)
          min = arr[i];
      }

      for( i = 0; i < s; i++)
      {
        if(arr[i] > min)
        {
          s = i;
          break;
        }
      }

      for( i = arr.length -1; i >= e+1; i--)
      {
        if(arr[i] < max)
        {
          e = i;
          break;
        }
      }

      System.out.println(s+" sorted lies between the indees "+e);
        }
}

public class MinLenghtUnsortedSubArray
{
    public static void main(String [] args)
    {
       UnsortedArrayIndex obj = new UnsortedArrayIndex();
       obj.getIndex();
    }
}