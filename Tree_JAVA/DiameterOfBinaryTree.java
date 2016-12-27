/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Diameter
{
    int getDiameter(Node r)
    {
        if(r == null)
            return 0;

        int ld = getDiameter(r.left);
        int rd = getDiameter(r.right);

        int lh = height(r.left);
        int rh = height(r.right);

        return max( (lh + rh + 1),max(ld , rd)) ;
    }

    private int height(Node n)
    {
        int l=0,r=0;
        if(n == null)
            return 0;
        l = height(n.left);
        r = height(n.right);

        return 1 + max(l,r);
    }

    private int max(int a, int b)
    {
        if(a < b)
            return b;
        else
            return a;
    }
}

public class DiameterOfBinaryTree {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        System.out.println(new Diameter().getDiameter(root));
    }
}
