/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class NodePIS
{
    int data;
    NodePIS left;
    NodePIS right;
    NodePIS next;

    NodePIS(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.next = null;
    }
}

class PopulateInorder
{
    NodePIS populateSuccesor(NodePIS n, NodePIS temp)
    {
        if(n == null)
            return temp;
        temp =  populateSuccesor(n.right, temp);
        n.next = temp;
        temp = n;
        temp = populateSuccesor(n.left, temp);

        return temp;
    }

    void printSuccessor(NodePIS n)
    {
        if(n == null)
            return;

        System.out.println(n.data +" : Successor : "+(n.next == null ? -1 : n.next.data));
        printSuccessor(n.left);
        printSuccessor(n.right);
    }
}

public class PopulateInorderSuccessorForAll
{
    public static void main(String [] args)
    {
        NodePIS root = new NodePIS(50);
        root.left = new NodePIS(30);
        root.right = new NodePIS(70);
        root.left.left = new NodePIS(15);
        root.left.right = new NodePIS(40);
        root.right.left = new NodePIS(60);
        root.right.right = new NodePIS(90);

        PopulateInorder obj = new PopulateInorder();
        obj.populateSuccesor(root, null);
        obj.printSuccessor(root);
    }
}