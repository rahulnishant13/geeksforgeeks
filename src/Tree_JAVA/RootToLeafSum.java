/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class LeafSum
{
    boolean leafSum(Node r, int sum)
    {
        if(r == null)
            return false;

        boolean rslt = false;
        sum = sum - r.data;
        if(sum == 0 && r.left == null && r.right == null)
            return true;
        
        rslt = rslt || leafSum(r.left, sum);
        rslt = rslt || leafSum(r.right, sum);

        return rslt;
    }
}

public class RootToLeafSum {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        if(new LeafSum().leafSum(root, 110))
            System.out.println("Its there");
        else
            System.out.println("Sum is not there");
    }
}
