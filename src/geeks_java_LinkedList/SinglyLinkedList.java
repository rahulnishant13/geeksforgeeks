/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_LinkedList;
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */

class Node
{
    protected int data;
    protected Node link;

    Node()
    {
        link = null;
        data = 0;
    }
    Node(int d, Node n)
    {
        link = n;
        data = d;
    }
     public void setLink(Node n)
     {
         link = n;
     }
     public void setData(int d)
     {
         data = d;
     }
     public Node getLink()
     {
         return link;
     }
     public int getData()
     {
         return data;
     }
}

class LnkdList
{
    protected
}

public class SinglyLinkedList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LnkdList list = new LnkdList();
        
    }
}
