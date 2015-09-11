/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Foldable
{
    boolean splitTree(Node r)
    {
        if(r == null)
            return true;
       return checkFoldable(r.left, r.right);
    }

    private boolean checkFoldable(Node l, Node r)
    {
        if(l == null && r == null)
            return true;

        if(l == null || r == null)
            return false;

        return checkFoldable(l.left, r.right) && checkFoldable(l.right, r.left);
    }
}

public class FoldableBinaryTrees
{
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        //root.right.right = new Node(90);

        if(new Foldable().splitTree(root))
            System.out.println("Is Foldable");
        else
            System.out.println("Is NOT Foldable");
    }
}
