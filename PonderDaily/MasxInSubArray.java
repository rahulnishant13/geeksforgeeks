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
class DeqeueArray
{
    Integer [] arr;

    void maxInWindow(Integer w)
    {
        Deque <Integer> dq = new LinkedList();
        Integer i;
        for( i=0;i<w;i++)
        {
          while(!dq.isEmpty() && arr[dq.getLast()] < arr[i])
              dq.pollLast();

             dq.addLast(i);
        }
        System.out.print(" "+arr[dq.getFirst()]);
        for(;i<arr.length;i++)
        {
                while(dq.getFirst()<=(i-w))
                {
                    dq.removeFirst();
                }

                while(!dq.isEmpty() && arr[dq.getLast()] < arr[i])
              dq.pollLast();

             dq.addLast(i);

             System.out.print(" "+arr[dq.getFirst()]);
        }

    }
}


public class MasxInSubArray {

    public static void main(String [] Arrr)
    {
        DeqeueArray obj = new DeqeueArray();
        obj.arr = new Integer []{22,1,9,5,2,3,7,8};

        obj.maxInWindow(3);
    }
}
