/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class BSTSubtree
{
    int getSizeSubTree(Node n)
    {
        if(n == null)
            return 0;

        if(isBST(n,Integer.MIN_VALUE,Integer.MAX_VALUE))
            return size(n);

        return (getSizeSubTree(n.left) > getSizeSubTree(n.right) ? getSizeSubTree(n.left) : getSizeSubTree(n.right));

    }

    private boolean isBST(Node r, int min, int max)
    {
        if (r == null)
            return true;
        if(r.data < min || r.data > max)
            return false;

        return (isBST(r.left, min, r.data - 1) && isBST(r.right, r.data + 1, max));
    }

    private int size(Node n)
    {
        if(n == null)
            return 1;
        int l=0,r=0;

        l = size(n.left);
        r = size(n.right);

        return l+r;
    }
}

public class LargestBSTSubtree
{
    public static void main(String [] args)
    {
        Node root = new Node(20);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        System.out.println("count : "+new BSTSubtree().getSizeSubTree(root));
    }
}
