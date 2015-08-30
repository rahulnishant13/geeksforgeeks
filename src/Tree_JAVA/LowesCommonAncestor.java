/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class LCA
{
    void lowestCommAncestor(Node r, int a, int b)
    {
        if(r == null)
            return;
        if (r.data > a && r.data > b)
            lowestCommAncestor(r.left, a, b);

        else if(r.data < a && r.data < b)
            lowestCommAncestor(r.right, a, b);

        else
            System.out.println(r.data);
    }
}

public class LowesCommonAncestor {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new LCA().lowestCommAncestor(root, 15, 40);
    }
}
