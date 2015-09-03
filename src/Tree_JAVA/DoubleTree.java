/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class DoubleT
{
    void createDoubleTree(Node r)
    {
        if(r == null)
            return;

        createDoubleTree(r.left);
        createDoubleTree(r.right);
        Node x;
        x = r.left;
        r.left = new Node(r.data);
        r.left.left = x;
    }

    void preintTree(Node r)
    {
        if(r == null)
            return;
        
            preintTree(r.left);
            preintTree(r.right);
            System.out.print(r.data +"  ");
            
    }
}

public class DoubleTree {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new DoubleT().createDoubleTree(root);
        new DoubleT().preintTree(root);
    }
}
