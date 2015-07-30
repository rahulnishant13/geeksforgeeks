/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PonderDaily;
import java.util.*;
/**
 *
 * @author RAHUL
 */

class Node implements Comparable < ListNode >
{
    int data;
    int index;
    int count;

    public int compare(Node n1, Node n2)
        {
          return  n1.count > n2.count ? 1 :(n1.count <n2.count ? -1:0);
        }


}



class ListNode
{
    Node []n;
    int []arr;
    ListNode(int d)
       {
           this.n = new Node[d];
       }
}


public class SortElimentByFreq {
    public static void main()
    {
        ListNode obj=new ListNode(6);
        obj.arr = new int[]{2,1,2,3,2,3};
        for(int i=0; i<obj.n.length; i++)
        {
            int val = obj.arr[i];
                obj.n[val].data = obj.arr[i];
                if(obj.n[val].index!= 0)
                obj.n[val].index = i;

                obj.n[val].count += 1;
        }

        Collections.sort(obj,new Node.CompareCount());

    }

}
