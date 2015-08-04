/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

/**
 *
 * @author RAHUL
 */

class NodeIntervals implements Comparator<NodeIntervals>
{
    private int min;
    private int max;
    NodeIntervals(){}

    NodeIntervals(int min, int max)
    {
        this.min = min;
        this.max = max;
    }

    public int getMin()
    {
      return min;
    }
    public int getMax()
    {
      return max;
    }

    public int compare(NodeIntervals d, NodeIntervals d1){
      return d.min - d1.min;
   }
}

public class OverlappingIntervals
{
    public static void main(String [] args)
    {
        ArrayList <NodeIntervals> x = new ArrayList();
        x.add(new NodeIntervals(1,3));
        x.add(new NodeIntervals(5,7));
        x.add(new NodeIntervals(2,4));
        x.add(new NodeIntervals(6,8));

        Collections.sort(x, new NodeIntervals());
        for(NodeIntervals a: x)
         //System.out.print(a.getMin() +" , "+a.getMax() + " ;   " );


        for (int i=0; i < x.size()-1; i++)
        {
                if( x.get(i).getMax() > x.get(i+1).getMin())
                {
                    System.out.println( "Overlapping ");
                    return;
                }
        }
        
    }
}
