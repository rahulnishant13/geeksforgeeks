/**
 * To find the fist node of a loop in a linked list
 */

package LinkedList_JAVA;

/**
 *
 * @author RAHUL
 */
 
 
public class DetectingLoopInLinkedlist
{
    static Node getLoopInLinkedList(Node head){
        Node fast = null;
        fast = checkLoop(head);
        
        if(fast != null){
            Node start = head;
            
            while(true){
                start = start.next;
                fast = fast.next;
                
                if(start == fast)
                    return start;
            }
        }
        
        return null;
        
    }
    
    static Node checkLoop(Node head){
        Node fast, slow;
        fast = slow = head;
        while(fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast == slow)
                return fast;
        }
        
        return null;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//insert your linked list
		
		Node startLoop = getLoopInLinkedList();
		
		if(startLoop != null){
		    System.out.println(startLoop.data);
		}
		
		else{
		    System.out.println("No loop");
		}
	}
}
