/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author RAHUL
 */

class LevelQueue
{
    void getWidth(Node r)
    {
        for(int i=1; i <= height(r);i++)
            System.out.println( this.width(r,i) );
    }

    int width(Node r, int i)
    {
        if(r == null)
            return 0;

        if(i == 1)
            return 1;
        
        int l = width(r.left, i-1);
        int ryt = width(r.right, i-1);

        return l+ryt; 
    }

    private int height(Node r)
    {
        if(r == null)
            return 0;
        int l=0,ryt=0;

        l = height(r.left);
        ryt = height(r.right);
        
        if(l > ryt)
            return l+1;
        else
            return ryt+1;
    }
}

public class WidthOfBinaryTree
{
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new LevelQueue().getWidth(root);
    }
}
