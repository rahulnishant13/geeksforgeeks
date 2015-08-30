/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author RAHUL
 */

class SpiralTraversal
{
    Stack<Node> s = new Stack<Node>();
    Stack<Node> s1 = new Stack<Node>();

    void printSpiral(Node r)
    {
        s1.push(r);
        Node temp = r;
        while(!s1.empty() || !s.empty())
        {
            while(!s1.empty())
            {
                temp = s1.pop();
                System.out.print( temp.data+" ");
                if(temp.right != null)
                s.push(temp.right);

                if(temp.left != null)
                s.push(temp.left);
            }
            
            while(!s.empty())
            {
                temp = s.pop();
                System.out.print( temp.data+" ");
                if(temp.left != null)
                    s1.push(temp.left);

                if(temp.right != null)
                    s1.push(temp.right);
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
