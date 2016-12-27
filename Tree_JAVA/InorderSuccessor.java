/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class SuccessorOfTree
{
    void getSuccessor(Node r, Node n)
    {
        Node temp = n;
        if(temp.right != null)
        {
            temp = temp.right;
            while(temp.left != null)
                temp = temp.left;
        }

        while(r != null)
        {
            if (n.data < r.data)
            {
                temp = r;
                r = r.left;
            }
            else if (n.data > r.data)
                r = r.right;
            else
                break;
        }
        
        System.out.println(n.data+" : successor : "+temp.data);
    }
}

public class InorderSuccessor
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

        Node temp = root.right.left;
        new SuccessorOfTree().getSuccessor(root, temp);
    }
}
