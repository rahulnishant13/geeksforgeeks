/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Geeks_Java_Tree;

/**
 *
 * @author RAHUL
 */

class Identical
{
    boolean identical(Node a1, Node a2)
    {
        
    }
}

public class IdenticalTree {
    public static void main(String  [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);
        
    }

}
