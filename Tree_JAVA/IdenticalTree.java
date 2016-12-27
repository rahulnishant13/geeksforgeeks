/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Identical
{
    boolean identical(Node a1, Node a2)
    {
        if(a1 == null && a2 == null)
            return true;

        if(a1 == null || a2 == null)
            return false;

        return (a1.data == a2.data) && identical(a1.left, a2.left) && identical(a1.right, a2.right);
    }
}

public class IdenticalTree {
    public static void main(String  [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        Node root1 = new Node(50);
        root1.left = new Node(30);
        root1.right = new Node(70);
        root.left.left = new Node(15);
        root1.left.right = new Node(40);
        root1.right.left = new Node(60);
        //root1.right.right = new Node(90);

        if(new Identical().identical(root1, root))
            System.out.println("Identical ");

        else
            System.out.println("Unidentical ");
    }

}
