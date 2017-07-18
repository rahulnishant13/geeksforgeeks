/**
 * To find the mid element in a linked list
 */

package LinkedList_JAVA;

/**
 *
 * @author RAHUL
 */
 
 
public class MidElementInLinkedList
{
    static Node getMidNodeInLinkedList(Node head){
        Node fast, slow;
        fast = slow = head;
        
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

        return slow;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//insert your linked list
		// and pass the head to below method
		
		Node midNode = getLoopInLinkedList(head);
		
		System.out.println(midNode.data);
		
	}
}
