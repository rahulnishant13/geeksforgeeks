/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class CheckSum
{
    boolean checkChildSum(Node r)
    {
        int ld =0, rd =0;
        boolean lc,rc;
        if( (r == null) || r.left == null && r.right == null)
            return true;
        
        lc = checkChildSum(r.left);
        rc = checkChildSum(r.right);
        
        if(r.left != null)
        {
            ld = r.left.data;
        }

        if(r.right != null)
        {
            rd = r.right.data;
        }

        if( (r.data == ld + rd) && (lc == true || rc == true) )
        {
            return true;
        }

        return false;
        }
    }

public class ChildrenSum
{
    public static void main(String [] args)
    {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        if(new CheckSum().checkChildSum(root))
            System.out.println("Sum Child");
        else
            System.out.println("Not Sum Child");
    }
}
