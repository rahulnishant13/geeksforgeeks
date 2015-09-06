/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class CheckSumTree
{
    boolean checkSum(Node r)
    {
    }

public class CheckBinaryTreeSumTree
{
    public static void main(String [] args)
    {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        if(new CheckSumTree().checkSum(root))
            System.out.println("Sum Child");
        else
            System.out.println("Not Sum Child");
    }
}
