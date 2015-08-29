/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

/**
 *
 * @author RAHUL
 */

class Depth
{
    int l=0,ryt=0;
    int depth(Node r)
    {
        if(r == null)
            return 1;
        
        l = depth(r.left);
        ryt = depth(r.right);

        if (l > ryt) {
            return  (l+1);
        }
        else
            return (ryt+1);
    }
}

public class DepthOrHeight {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        System.out.print(new Depth().depth(root));
    }

}
