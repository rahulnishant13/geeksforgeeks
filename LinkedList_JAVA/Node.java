/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList_JAVA;

/**
 *
 * @author RAHUL
 */

class Node{
    protected int data;
    protected Node link;

    public Node(){
        link = null;
        data = 0;
    }

    public Node(int data, Node n){
        this.data = data;
        this.link = n;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setLink(Node link){
        this.link = link;
    }

    public int getData(){
        return this.data;
    }

    public Node getLink(){
        return this.link;
    }
}
