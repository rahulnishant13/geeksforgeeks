/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Mirror
{
    void mirror(Node r)
    {
        if(r == null)
            return;
        mirror(r.left);
        mirror(r.right);
        if(r.left != null && r.right != null){
            int temp = r.left.data;
            r.left.data = r.right.data;
            r.right.data = temp;
        }
    }

    void print(Node r)
    {
        if (r != null)
        {
            System.out.print(r.data + " ");
            print(r.left);
            print(r.right);
        }
    }
}

public class MirrorTree {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

       new Mirror().print(root);
       System.out.println();
       new Mirror().mirror(root);
       new Mirror().print(root);

    }
}
