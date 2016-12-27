/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList_JAVA;

/**
 *
 * @author RAHUL
 */

class Node1
{
        public int data;
        public Node1 next;

    public Node1(int data)
    {
        this.data = data;
        this.next = null;
    }

}

class OrderList
{
    Node1 asc,des;
    void splitList(Node1 root)
    {
        asc=new Node1(root.data);
        des=new Node1(root.next.data);
        asc.next = new Node1(root.next.next.data);
        des.next = new Node1(root.next.next.next.data);
        asc.next.next = new Node1(root.next.next.next.next.data);
        des.next.next = new Node1(root.next.next.next.next.next.data);
        asc.next.next.next = new Node1(root.next.next.next.next.next.next.data);

        revDesList(des);
    }

    void revDesList(Node1 r)
    {
        Node1 prev, curr, next;
        prev = null;
        curr = r;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        des = prev;
    }

    private Node1 mergeList(Node1 a, Node1 d)
    {
        if (a == null) return d;
        if (d == null) return a;

        Node1 temp = null;
        if (a.data < d.data)
        {
            temp = a;
            a.next = mergeList(a.next, d);
        }
        else
        {
            temp = d;
            d.next = mergeList(a, d.next);
        }
        return temp;
    }

    void printList()
    {
        Node1 temp = mergeList(asc, des);
        while( temp != null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
}

public class SortAscDesOrderList {
    public static void main(String [] args)
    {
        Node1 root = new Node1(10);
        root.next = new Node1(40);
        root.next.next = new Node1(53);
        root.next.next.next = new Node1(30);
        root.next.next.next.next = new Node1(67);
        root.next.next.next.next.next = new Node1(12);
        root.next.next.next.next.next.next = new Node1(89);

        OrderList obj = new OrderList();
        obj.splitList(root);
        obj.printList();
    }
}
