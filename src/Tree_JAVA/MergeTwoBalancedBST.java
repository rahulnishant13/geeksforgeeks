/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

import java.util.ArrayList;

/**
 *
 * @author RAHUL
 */

class MergeTrees
{
    ArrayList<Integer> al = new ArrayList<Integer>();
    ArrayList<Integer> bl = new ArrayList<Integer>();

    void callIn(Node n1, Node n2)
    {
        al = inArray(n1);
        int[] arr1 = new int[al.size()];

        for(int i = 0; i < al.size(); i++)
            if (al.get(i) != null)
                arr1[i] = al.get(i);

        bl = inArray1(n1);
        int[] arr2 = new int[bl.size()];

        for(int i = 0; i < bl.size(); i++)
            if (bl.get(i) != null)
                arr2[i] = bl.get(i);

        merge(arr1,arr2);
    }

    private ArrayList<Integer> inArray(Node n)
    {
        if(n == null)
            return null;

        inArray(n.left);
        al.add(n.data);
        inArray(n.right);

        return al;
    }

    private ArrayList<Integer> inArray1(Node n)
    {
        if(n == null)
            return null;

        inArray(n.left);
        bl.add(n.data);
        inArray(n.right);

        return bl;
    }

    private void merge(int[] arr1, int[] arr2)
    {
        int [] arr = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] > arr2[j])
                arr[k++] = arr[i++];
            else
                arr[k++] = arr[j++];
        }

        while (i < arr1.length)
            arr[k++] = arr1[i++];

        while (j < arr2.length)
            arr[k++] = arr1[j++];

        createBST(arr);
    }

    private void createBST(int[] arr)
    {
        Node n = new Node(arr[arr.length/2]);
        Node temp = null;
        for(int i=0; i < arr.length; i++)
        {
            if(i == arr.length/2)
                i++;
            temp = insertData(n,arr[i]);
        }

        printBST(temp);
    }

    private Node insertData(Node n, int d)
    {
        if(n == null)
            n = new Node(d);

        else
        {
            if(d <= n.data)
                n.left = insertData(n.left, d);
            else
                n.right = insertData(n.right, d);
        }

        return n;
    }

    private void printBST(Node n)
    {
        if(n == null)
            return;
        System.out.print(n.data+"  ");
        printBST(n.left);
        printBST(n.right);
    }
}

public class MergeTwoBalancedBST
{
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);

        Node root1 = new Node(100);
        root1.left = new Node(50);
        root1.right = new Node(300);
        root1.left.left = new Node(20);
        root1.left.right = new Node(70);
        
        MergeTrees obj = new MergeTrees();

        new MergeTrees().callIn(root, root1);
    }
}
