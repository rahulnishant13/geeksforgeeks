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

    void fun( List<Node> list )
    {
        for(int i=0; i < list.size() ; )
        {
            int x=1,j=i;
            while( (j < list.size()-1) && (list.get(j).data == list.get(j+1).data))
            {
                x++;
                j++;
            }
            
            while( i <= j )
            {
                list.get(i).count =x;
                i++;
            }
        }
    }

}

class Frequency implements Comparator<Node>
{
    public int compare(Node d, Node d1)
    {
        return d1.count - d.count;
    }
}

public class SortElimentByFreq {
    public static void main(String [] args)
    {
          Node obj = new Node();
          List<Node> list = new ArrayList<Node>();

          list.add(new Node(0,2));
          list.add(new Node(1,3));
          list.add(new Node(2,2));
          list.add(new Node(3,3));
          list.add(new Node(4,3));

          Collections.sort(list, new Node());

          for(Node a: list)
            // System.out.print("  "+a.getData());

          obj.fun(list);

          System.out.println();

          Collections.sort(list, new Frequency());

          for(Node a: list)
             System.out.print(a.getData() + " , ");

    }
}
