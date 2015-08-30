/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class Node
{
    int data;
   int count;
//
//   void setData(int d)
//   {
//       this.data = d;
//   }
//
//   void setCount()
//   {
//       this.count++;
//   }
//
//   int getData()
//   {
//       return data;
//   }
//   int getCount()
//   {
//       return count;
//   }

}

class MoreThanNK
{
    private int [] arr;
    private int k;

    Node [] nk = new Node[k-1];

    MoreThanNK(int k)
    {
        this.k = k;
        arr = new int[]{};
    }

    void getNumberNK()
    {
        for(int i=0; i < k-1; i++ )
        {
            nk[i].data = arr[i];
        }
    }

}

public class NumberAppersMoreThanNKtimes
{
    public static void main(String [] args)
    {
        MoreThanNK obj = new MoreThanNK(4);
    }
}
