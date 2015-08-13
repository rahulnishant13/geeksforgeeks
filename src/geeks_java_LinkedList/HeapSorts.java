/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package geeks_java_LinkedList;

/**
 *
 * @author RAHUL
 */

class Heapify
{
    int[] a;
    private int n;
    private int left;
    private int right;
    private int largest;

    void buildheap()
    {
        n = a.length-1;
        for(int i=n/2;i>=0;i--)
            maxheap(i);
    }

    void maxheap(int i)
    {
        left=2*i;
        right=left+1;
        if(left <= n && a[left] > a[i])
            largest=left;
        else
            largest=i;

        if(right <= n && a[right] > a[largest])
        {
            largest=right;
        }
        if(largest!=i){
            int t=a[i];
            a[i]=a[largest];
            a[largest]=t;
            maxheap(largest);
        }
    }
}

public class HeapSorts
{
    public static void main(String[] args) {
        Heapify obj = new Heapify();
        obj.a = new int[]{4,1,3,2,16,9,10,14,8,7};
        obj.buildheap();
        for(int i=0;i<obj.a.length;i++){
            System.out.print(obj.a[i] + " ");
        }
    }
}