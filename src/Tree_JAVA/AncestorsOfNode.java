/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class GetAncestors
{
    boolean printAncestors(Node n, int rslt)
    {
        if(n == null)
            return false;

        if(n.data == rslt)
            return true;
        boolean l=false,r=false;
        l = printAncestors(n.left, rslt);
        r = printAncestors(n.right, rslt);

        if(l || r)
        {
            System.out.print(n.data+" ");
            return true;
        }
        else
            return false;
    }
}

public class AncestorsOfNode
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

        new GetAncestors().printAncestors(root, 40);
    }
}
