/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author RAHUL
 */

class SpiralTraversal
{
    Queue<Node> q = new LinkedList();
    Stack<Node> s = new Stack<Node>();

    void printSpiral(Node r)
    {
        q.add(r);
        Node temp = r;
        while(!q.isEmpty() || !s.empty())
        {
            while(!q.isEmpty())
            {
                temp = q.poll();
                System.out.print( temp.data+" ");
                if(temp.left != null)
                s.push(temp.right);

                if(temp.right != null)
                s.push(temp.left);
            }
            
            while(!s.empty())
            {
                temp = s.pop();
                System.out.print( temp.data+" ");
                if(temp.left != null)
                    q.add(temp.right);

                if(temp.right != null)
                    q.add(temp.left);
            }

        }
    }
}

public class LevelOrderSpiralTraversal {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new SpiralTraversal().printSpiral(root);
    }
}
