/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class ConnetNodeNotCmpleteBinary
{
    void connectNode(Node1 n)
    {
        if(n == null)
            return;

        n.leftright = null;

        while(n != null)
        {
            Node1 r = n;

            while(r != null)
            {
                if(r.left != null)
                {
                    if(r.right != null)
                        r.left.leftright = r.right;
                    else
                        r.left.leftright = getnextRight(r);
                }

                if(r.right != null)
                    r.right.leftright = getnextRight(r);

                r = r.leftright;
            }

            if(n.left != null)
                n = n.left;
            else if(n.right != null)
                n = n.right;
            else
                n = n.leftright;
        }
    }

    private Node1 getnextRight(Node1 r)
    {
        Node1 temp = r.leftright;
        while(temp != null)
        {
            if(temp.left != null)
                return temp.left;
            if(temp.right != null)
                return temp.right;
            temp = temp.leftright;
        }
        return null;
    }

    void printTreeNB(Node1 r)
    {
        if(r == null)
            return;

        System.out.println(r.data +"  "+ ((r.leftright == null)?-1:r.leftright.data));
        printTreeNB(r.left);
        printTreeNB(r.right);
    }
}

public class ConnectNodeAtSameLevelNotCmpltBinary
{
    public static void main(String [] args)
    {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        root.left.left.left = new Node1(8);
        root.left.left.right = new Node1(9);
        root.right.left = new Node1(6);
        root.right.right = new Node1(7);
        root.right.right.left = new Node1(10);
        root.right.right.right = new Node1(11);

        ConnetNodeNotCmpleteBinary obj = new ConnetNodeNotCmpleteBinary();

        obj.connectNode(root);
        obj.printTreeNB(root);

    }
}
