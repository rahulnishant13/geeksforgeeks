/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class ConvertSumTree
{
    int sumTree(Node n)
    {
        if(n == null)
            return 0;

        int prev_data = n.data;

        n.data = sumTree(n.left) + sumTree(n.right);

        return prev_data + n.data;
    }

    void printSumTree(Node n)
    {
        if(n == null)
            return;
        System.out.print(n.data+" ");
        printSumTree(n.left);
        printSumTree(n.right);
    }
}

public class TreeToItsSumTree
{
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        ConvertSumTree obj = new ConvertSumTree();
        obj.sumTree(root);
        obj.printSumTree(root);
    }
}
