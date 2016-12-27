/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.Scanner;

/**
 *
 * @author RAHUL
 */

class SortedArrayBST
{
    private int [] arr;

    SortedArrayBST()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. data : ");
        int x = sc.nextInt();
        arr = new int[x];
        System.out.println("Enter data in Array : ");
        for(int i=0; i < x; i++)
            arr[i] = sc.nextInt();
        callInsertBST();
    }

    private void callInsertBST()
    {
        Node n = new Node(arr[arr.length/2]);
        Node temp = null;
        for(int i=0; i < arr.length; i++)
        {
            if(i == arr.length/2)
                i++;
            temp = insertBST(n, arr[i]);
        }
        System.out.println("BST Tree : ");
        callPrint(temp);
    }

    private Node insertBST(Node n, int d)
    {
        if(n == null)
        {
            n = new Node(d);
        }

        else
        {
            if(d <= n.data)
                n.left = insertBST(n.left, d);
            else
                n.right = insertBST(n.right, d);
        }
        return n;
    }

    private void callPrint(Node n)
    {
        if(n == null)
            return;
        System.out.print(n.data+"  ");
        callPrint(n.left);
        callPrint(n.right);
    }
}

public class SortedArrayToBalancedBST
{
    public static void main(String [] args)
    {
        new SortedArrayBST();
    }
}
