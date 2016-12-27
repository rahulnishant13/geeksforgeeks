/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList_JAVA;

/**
 *
 * @author RAHUL
 */

class Sort
{

    ListNode mergeSortList(ListNode n1) {
        
    }

    void printList(ListNode n1) {

    }

}

public class MergeSort {
    public static void main(String[] args) {
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);

		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(4);
		ListNode n6 = new ListNode(5);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		n1 = new Sort().mergeSortList(n1);

		new Sort().printList(n1);
	}

}
