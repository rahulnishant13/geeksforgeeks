/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Delete
{
    void delete(Node r)
    {
        if(r == null)
            return;
        delete(r.left);
        delete(r.right);
        r = null;
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

public class DeleteTree {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new Delete().print(root);
        new Delete().delete(root);
        new Delete().print(root);
        
    }

}
