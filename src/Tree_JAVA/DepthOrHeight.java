/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Depth
{
    
    int depth(Node r)
    {
        int l=0,ryt=0;
        if(r == null)
            return 0;
        
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

        System.out.println(new Depth().depth(root));
    }

}
