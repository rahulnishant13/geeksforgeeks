/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree_JAVA;

/**
 *
 * @author RAHUL
 */

class Path
{
    int [] arr = new int [10] ;
    void printPath(Node r , int index)
    {
        if(r == null)
            return;

        arr[index++] = r.data;
        printPath(r.left, index);
        printPath(r.right, index);
        if (r.right == null && r.left == null)
        {
            int i =0;
            while(i < index)
                System.out.print(arr[i++]+" " );
            System.out.println();
        }
    }
}

public class PrintPath {
    public static void main(String [] args)
    {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(15);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(90);

        new Path().printPath(root, 0);
    }

}
