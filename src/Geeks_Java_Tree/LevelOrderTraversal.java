/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author RAHUL
 */

public class LevelOrderTraversal {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print( temp.data+" ");
            if(temp.left != null)
            q.add(temp.left);
            
            if(temp.right != null)
            q.add(temp.right);
        }
    }
}
