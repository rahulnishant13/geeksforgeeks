/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PonderDaily;
import java.util.*;
//import java.lang.*;
/**
 *
 * @author RAHUL
 */

class Node implements Comparator<Node>
{
    private int data;
    private int index;
    public int count;

    Node(){}

    Node(int index, int data)
    {
        this.data = data;
        this.index = index;
    }

    public int getData(){
      return data;
   }
    
    public int getCount(){
      return count;
   }

    public int compare(Node d, Node d1){
      return d.data - d1.data;
   }

    int fun(List<Node> list, int x , int [] count_frequency )
    {
        if( (x < list.size()) && (list.get(x).data != list.get(x+1).data) )
        {
            System.out.println(x +" rXn  " + list.size());
            return x;
        }
        int y;
        if(count_frequency[0]==-1)
        {
            count_frequency[0] = 1;
            y=0;
          
        }else
        {
        y=x+1;
        count_frequency[0] = count_frequency[0] + 1;
        }
            int z;
            z = fun(list, y,count_frequency);
            list.get(y).count = count_frequency[0];
            
            return z;
    }
}

class Frequency implements Comparator<Node>
{
    public int compare(Node d, Node d1)
    {
        return d.count - d1.count;
    }
}

public class SortElimentByFreq {
    public static void main(String [] args)
    {
          Node obj = new Node();
          int[] count_frequency = new int[]{-1} ;
          List<Node> list = new ArrayList<Node>();
  
          list.add(new Node(0,2));
          list.add(new Node(1,3));
          list.add(new Node(2,2));
          list.add(new Node(3,3));
          list.add(new Node(4,3));

          Collections.sort(list, new Node());

          for(Node a: list)
            // System.out.print("  "+a.getData());

          for(int i=0; i < list.size(); i++)
          {
                i = obj.fun(list, i, count_frequency);

          }

          System.out.println();
          
       /*   Collections.sort(list, new Frequency());

          for(Node a: list)
             System.out.print("  "+a.getData() +" " +a.count + ",");
*/
    }
}
