/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */
class AncestorsOfTree1
{
    int a, b;

    public AncestorsOfTree1(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    void lowestCommAncestor(Node r)
    {
        if( ( (r.left.left == null && r.left.right == null) || (r.right.left == null && r.right.right == null) ) )
            return;

//        if((r.left.left == null && r.left.right == null))
//        {
//            if(r.left.data == a || r.left.data == b)
//                return r;
//        }
//
//        if((r.right.right == null && r.right.left == null ) )
//        {
//            if (r.right.data == a || r.right.data == b)
//                return r;
//        }
        
        lowestCommAncestor(r.left);
        lowestCommAncestor(r.right);

        if(r.left.data == a || r.right.data == a)
        {
             this.a = r.data;
             return;
        }

        if(r.left.data == b || r.right.data == b)
        {
            this.b = r.data;
            return;
        }

        if(a == b)
        {
            System.out.println(" "+a);
            return;
        }
    }
}

public class AncestorsNotBinaray
{
    public static void main(String [] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        AncestorsOfTree1 obj = new AncestorsOfTree1(5, 6);
        obj.lowestCommAncestor(root);
    }
}
