/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList_JAVA;
import java.util.Scanner;
/**
 *
 * @author RAHUL
 */

public class SinglyLinkedList
{
    protected Node start;
    protected Node end;
    protected int size;

    LinkedList(){
        start = null;
        end = null;
        size = 0;
    }

    void insertAtBegining(int val){
      Node nptr = new Node(val, null);
      size++;

      if(start == null){
        start = nptr;
        end = start;
      }
      else{
        nptr.setLink(start);
        start = nptr;
      }
    }

    void insertAtEnd(int val){
      Node nptr = new Node(val, null);
      size++;

      if(start == null){
        start = nptr;
        end = start;
      }
      else{
        end.setLink(nptr);
        end = nptr;
      }
    }

    void insertAtPos(int val , int pos){
      Node nptr = new Node(val, null);
      Node ptr = start;
      pos = pos -1;

      for(int i = 1; i < size; i++){
        if(i == pos){
          Node temp = ptr.getLink();
          ptr.setLink(nptr);
          nptr.setLink(temp);
          break;
        }
        ptr = ptr.getLink();
      }
      size++;
    }

    void deleteAtPos(int pos){
      if(pos == 1){
        start = start.getLink();
        size--;
        return;
      }

      if(pos == size){
        Node s = start;
        Node t = start;

        while(s != end){
          t = s;
          s = s.getLink();
        }
        end = t;
        end.setLink(null);
        size--;
        return;
      }

      Node ptr = start;
      pos = pos -1;
      for(int i=1; i<size; i++){
        if( i == pos){
        Node temp = ptr.getLink();
          ptr.setLink(temp.getLink());
          break;
        }
        ptr = ptr.getLink();
      }
      size--;
    }

    boolean isEmpty(){
      return start == null;
    }

    int getSize(){
      return size;
    }

    void display(){
      System.out.println("Singly Linked List: ");

      if(size == 0){
        System.out.println("Empty List.");
        return;
      }

      if(start.getLink() == null){
        System.out.println(start.getData());
        return;
      }

      Node ptr = start;

      while(ptr.getLink() != null ){
        System.out.print(ptr.getData() +" -> ");
        ptr = ptr.getLink();
      }

      System.out.print(ptr.getData() +"\n");
    }

    public static void main (String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        Scanner scan = new Scanner(System.in);
        char ch;

        System.out.println("\nSingly Linked List Operations\n");
        System.out.println("1. insert at begining");
        System.out.println("2. insert at end");
        System.out.println("3. insert at position");
        System.out.println("4. delete at position");
        System.out.println("5. check empty");
        System.out.println("6. get size");

        do
        {
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Insert data: ");
                    list.insertAtBegining(scan.nextInt());
                    break;

                case 2:
                    System.out.println("Insert data: ");
                    list.insertAtEnd(scan.nextInt());
                    break;

                case 3 :
                    System.out.println("Enter integer element to insert");
                    int num = scan.nextInt() ;
                    System.out.println("Enter position");
                    int pos = scan.nextInt() ;
                    if (pos <= 1 || pos > list.getSize() )
                        System.out.println("Invalid position\n");
                    else
                        list.insertAtPos(num, pos);
                    break;
                case 4 :
                    System.out.println("Enter position");
                    int p = scan.nextInt() ;
                    if (p < 1 || p > list.getSize() )
                        System.out.println("Invalid position\n");
                    else
                        list.deleteAtPos(p);
                    break;
                case 5 :
                    System.out.println("Empty status = "+ list.isEmpty());
                    break;
                case 6 :
                    System.out.println("Size = "+ list.getSize() +" \n");
                    break;
                 default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
                /*  Display List  */
                list.display();
                System.out.println("\nDo you want to continue (Type y or n) \n");
                ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');

    }
}
