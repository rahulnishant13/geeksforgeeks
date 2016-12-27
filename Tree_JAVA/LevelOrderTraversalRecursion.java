/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class LOTREc
{
    void callPath(Node r)
    {
        for(int i=1; i <= height(r);i++)
            printLevelOrder(r, i);
    }

    private int height(Node r) 
    {
        int l=0,ryt=0;
        if(r == null)
            return 0;

        l = height(r.left);
        ryt = height(r.right);

        if (l > ryt) {
            return  (l+1);
        }
        else
            return (ryt+1);
    }

    private void printLevelOrder(Node r, int i) 
    {
        if(r == null)
            return;
        if(i == 1)
            System.out.print(r.data +" ");
        else if(i == 0)
            return;
        printLevelOrder(r.left, i-1);
        printLevelOrder(r.right, i-1);
    }
}

public class LevelOrderTraversalRecursion {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new LOTREc().callPath(root);
    }
}
