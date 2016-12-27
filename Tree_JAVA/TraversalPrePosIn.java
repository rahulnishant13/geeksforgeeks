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

class TreeNodes
{
    TreeNodes left, right;
    int      data;

    public TreeNodes()
    {
        left = null;
        right = null;
        data = 0;
    }

    public TreeNodes(int n)
    {
        left = null;
        right = null;
        data = n;
    }

    public void setLeft(TreeNodes n)
    {
        left = n;
    }

    public void setRight(TreeNodes n)
    {
        right = n;
    }

    public TreeNodes getLeft()
    {
        return left;
    }

    public TreeNodes getRight()
    {
        return right;
    }

    public void setData(int d)
    {
        data = d;
    }

    public int getData()
    {
        return data;
    }
}

class BinarySearchTree
{
    public TreeNodes root;

    public BinarySearchTree()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void insert(int data)
    {
        root = insert(root, data);
    }

    private TreeNodes insert(TreeNodes node, int data)
    {
        if (node == null)
            node = new TreeNodes(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    void preorder(TreeNodes r)
    {
        if (r != null)
        {
            System.out.print(r.getData() + " ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }
    void posorder(TreeNodes r)
    {
        if (r != null)
        {
            posorder(r.getLeft());
            posorder(r.getRight());
            System.out.print(r.getData() + " ");
        }
    }
    void inorder(TreeNodes r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() + " ");
            inorder(r.getRight());
        }
    }
}

public class TraversalPrePosIn
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Enter the first 10 elements of the tree\n");
        for (int i = 0; i < 7; i++)
            bst.insert(scan.nextInt());

        System.out.print("\nPre order  : ");
        bst.preorder(bst.root);
        System.out.print("\nPos order  : ");
        bst.posorder(bst.root);
        System.out.print("\nIn order  : ");
        bst.inorder(bst.root);
    }
}