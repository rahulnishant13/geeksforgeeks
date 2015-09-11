/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class CheckSumTree
{
    boolean isSumTree(Node n)
    {
        int l=0,r=0;
        if(n == null || (n.left == null && n.right == null))
            return true;
        if(isSumTree(n.left) && isSumTree(n.right))
        {
            if(n.left == null)
                l =0;
            else if(n.left.left == null && n.left.right == null)
                l = n.left.data;
            else
                l = 2*(n.left.data);

            if(n.right == null)
                r = 0;
            else if(n.right.left == null && n.right.right == null)
                r = n.right.data;
            else
                r = 2*(n.right.data);
        }
        return (n.data == l + r);
    }
}

public class CheckBinaryTreeSumTree
{
    public static void main(String [] args)
    {
        Node root = new Node(26);
        root.left = new Node(10);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(3);

        if(new CheckSumTree().isSumTree(root))
            System.out.println("Sum Child");
        else
            System.out.println("Not Sum Child");
    }
}
