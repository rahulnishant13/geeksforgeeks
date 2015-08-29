/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

/**
 *
 * @author RAHUL
 */

class LOSRec
{
    void callPrintSpiral(Node r)
    {
        boolean ltr = false;
        for(int i=1; i<= hght(r);i++)
        {
            printSpiral(r, i, ltr);
            ltr = !ltr;
        }
    }

    private int hght(Node r)
    {
        int l=0,ryt=0;
        if(r == null)
            return 1;

        l = hght(r.left);
        ryt = hght(r.right);

        if (l > ryt) {
            return  (l+1);
        }
        else
            return (ryt+1);
    }

    private void printSpiral(Node r, int i, boolean ltr)
    {
        if(r == null)
           return;
        if(i == 1)
            System.out.print(" "+r.data);
        else if (i > 1)
        {
            if(ltr)
            {
                printSpiral(r.left, i-1, ltr);
                printSpiral(r.right, i-1, ltr);
            }
            else
            {
                printSpiral(r.right, i-1, ltr);
                printSpiral(r.left, i-1, ltr);
            }
        }
    }
}

public class LevelOrderSpiralRecursive {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new LOSRec().callPrintSpiral(root);
    }
}
