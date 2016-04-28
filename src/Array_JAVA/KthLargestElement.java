/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class Kthnumber
{
    int [] arr;
    void quicksort(int x)
    {
        int pivot,j,temp,i, first = 0, last = arr.length - 1;

     if(first<last){
         pivot=x;
         i=first;
         j=last;

         while(i<j){
             while(arr[i]<=arr[pivot]&&i<last)
                 i++;
             while(arr[j]>arr[pivot])
                 j--;
             if(i<j){
                 temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
             }
         }

         temp=arr[pivot];
         arr[pivot]=arr[j];
         arr[j]=temp;
        System.out.println("Kth number : "+arr[pivot]);
    }
    }
}

public class HelloWorld{

     public static void main(String [] args)
    {
        Kthnumber obj = new Kthnumber();
        obj.arr = new int[]{1, 23, 12, 9, 30, 2, 50};
        int x = 4;
        obj.quicksort(x-1);
    }
}

