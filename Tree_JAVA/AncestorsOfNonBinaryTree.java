/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author RAHUL
 */

class AncestorsOfTree
{
    ArrayList<Integer> in = new ArrayList<Integer>();
    ArrayList<Integer> po = new ArrayList<Integer>();

    void lowestCommAncestor(Node n, int a, int b)
    {
        callIn(n);
        Iterator itr = in.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+"  ");
        
        System.out.println();

        callPos(n);
        itr = po.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+"  ");

        int [] arr = new int[in.size()];
        int i=0,k=0;
        while(i < in.size())
        {
            if((in.get(i) == a) || (in.get(i)== b))
            {
                while(true)
                {
                    arr[k++] = in.get(i);
                    //System.out.print("\n"  + arr[--k]);
                    i++;
                    if((in.get(i) == a) || (in.get(i)== b))
                    {
                        arr[k++] = in.get(i);
                        break;
                    }
                }
            }
            i++;
        }

        for(i =(po.size()-1); (i > 0) && (k != -1); i--)
        {
            for(int j =0; j < k; j++ )
            {
                if(po.get(i) == arr[j])
                {
                    System.out.println("Parent is : "+po.get(i));
                    k=-1;
                    break;
                }
            }
        }
    }

    private void callIn(Node n)
    {
        if(n == null)
            return;

        callIn(n.left);
        in.add(n.data);
        callIn(n.right);
    }

    private void callPos(Node n)
    {
        if(n == null)
            return;

        callPos(n.left);
        callPos(n.right);
        po.add(n.data);
    }
}

public class AncestorsOfNonBinaryTree
{
    public static void main(String [] args)
    {
        Node root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(35);
        root.left.left = new Node(55);
        root.left.right = new Node(40);
        root.right.left = new Node(100);
        root.right.right = new Node(90);

        new AncestorsOfTree().lowestCommAncestor(root, 90, 100);
    }
}
