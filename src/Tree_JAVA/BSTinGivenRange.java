/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class PrintNodeInRange
{
    void printNodes(Node n, int s, int e)
    {
        if(n == null)
            return;

        if(n.data > s)
            printNodes(n.left, s, e);

        if(s < n.data && e > n.data)
            System.out.println(n.data);

        if(n.data < e )
            printNodes(n.right, s, e);

    }
}

public class BSTinGivenRange
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

        new PrintNodeInRange().printNodes(root, 20, 70);
    }
}
