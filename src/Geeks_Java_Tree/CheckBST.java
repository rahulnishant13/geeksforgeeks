/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

/**
 *
 * @author RAHUL
 */

class BSTorNOT
{
    boolean isBST(Node r, int min, int max)
    {
        if (r == null)
            return true;
        if(r.data < min || r.data > max)
        {
            System.out.println("NOT BST");
            return false;
        }
        isBST(r.left, min, r.data - 1);
        isBST(r.right, r.data + 1, max);
        return true;
    }
}

public class CheckBST {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        if(new BSTorNOT().isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Is BST");
    }
}
