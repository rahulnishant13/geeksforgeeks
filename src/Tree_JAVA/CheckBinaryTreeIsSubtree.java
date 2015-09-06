/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class SubtreeOrNot
{
    private boolean checkIdentical(Node n1, Node n2)
    {
        if(n1 == null && n2 == null)
            return true;

        if(n1 == null || n2 == null)
            return false;

        return (n1.data == n2.data) && checkIdentical(n1.left, n2.left) && checkIdentical(n1.right, n2.right);
    }

    boolean checkSubtree(Node n1, Node n2)
    {
        if(n2 == null)
            return true;

        if(n1 == null)
            return false;

        if(checkIdentical(n1, n2))
            return true;

        return checkSubtree(n1.left, n2) || checkSubtree(n1.right, n2);
    }
}

public class CheckBinaryTreeIsSubtree
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

        Node root2 = new Node(30);
        root2.left = new Node(15);
        root2.right = new Node(40);
        //root2.right = new Node(90);

        if(new SubtreeOrNot().checkSubtree(root, root2))
            System.out.println("Is subtree");
        else
            System.out.println("Not a Subtree");
    }
}
