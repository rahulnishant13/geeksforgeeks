/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author RAHUL
 */

class KthInBSt
{
    int [] arr = new int[10];
    int i =0;

    void createArray(Node r)
    {
        if(r == null)
            return;
        createArray(r.left);
        arr[i++] = r.data;
        createArray(r.right);
    }

}

public class KthSmallestElementInBST
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

        new KthInBSt().createArray(root);
    }
}
