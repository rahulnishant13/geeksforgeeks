/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Node1
{
    public int data;
    public Node1 left;
    public Node1 right;
    public Node1 leftright;

    public Node1(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.leftright = null;
    }
}

class ConnectNode
{
    void connectAtSameLevel(Node1 r)
    {
        if(r == null)
            return;

        if(r.left != null)
            r.left.leftright = r.right;

        if(r.right != null)
            r.right.leftright = (r.leftright != null)?(r.leftright.left):null;

        connectAtSameLevel(r.left);
        connectAtSameLevel(r.right);
    }

    void printTree(Node1 r)
    {
        if(r == null)
            return;

        System.out.println(r.data +"  "+ ((r.leftright == null)?-1:r.leftright.data));
        printTree(r.left);
        printTree(r.right);
    }
}

public class ConnectNodeAtSameLevel
{
    public static void main(String [] args)
    {
        Node1 root = new Node1(50);
        root.left = new Node1(30);
        root.right = new Node1(70);
        root.left.left = new Node1(15);
        root.left.right = new Node1(40);
        root.right.left = new Node1(60);
        root.right.right = new Node1(90);
        
        ConnectNode nd = new ConnectNode();
        nd.connectAtSameLevel(root);
        nd.printTree(root);
    }
}
