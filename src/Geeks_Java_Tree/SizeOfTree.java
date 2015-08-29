/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

/**
 *
 * @author RAHUL
 */



public class SizeOfTree {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        System.out.println(size(root));
    }
    static int size(Node root)
    {
        if (root == null)
            {
                return 0;
            }
            return(size(root.left) + size(root.right) + 1);
    }
}
