/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.Scanner;

/**
 *
 * @author RAHUL
 */

class NodeAVL
{
        int data;
        int height;
        NodeAVL left;
        NodeAVL right;

    NodeAVL(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class ALV
{
    Node insertAVL(NodeAVL n, int d)
    {
        if(n == null)
            new Node(d);
        
        if(d > n.data)
            insertAVL(n.right,d);
        else
            insertAVL(n.left, d);

        int balance = balance(n.left, n.right);
        

    }

    private int balance(NodeAVL left, NodeAVL right)
    {
        return height(left) - height(right);
    }

    private int height(NodeAVL n)
    {
        if(n == null)
            return 0;
        return 
    }
}

public class AVLTreeInsertion
{
    public static void main(String [] args)
    {
        ALV obj = new ALV();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Data : ");
        int n = sc.nextInt();
        System.out.println("Enter Elements : ");
        Node root;
        for(int i = 0; i < n; i++)
        {
            int d = sc.nextInt();
            root = obj.insertAVL(root, d);
        }
    }
}
