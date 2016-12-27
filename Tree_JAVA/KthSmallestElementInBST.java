/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author RAHUL
 */

class KthInBSt
{
    ArrayList<Integer> arr = new ArrayList<Integer>();

    void createArray(Node r,int k)
    {
        if(r == null)
            return;
        createArray(r.left, k);
        arr.add(r.data);
        if(arr.size() == k)
            System.out.println(r.data);
        createArray(r.right, k);
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

        new KthInBSt().createArray(root, 3);
    }
}
