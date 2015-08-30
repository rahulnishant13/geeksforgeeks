/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */


public class NodeWithMinimunValue {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);
        
        Node temp = root;

        while(true)
        {
            if(temp.left == null)
            {
                System.out.println(temp.data);
                return;
            }
            temp = temp.left;
        }
    }

}
