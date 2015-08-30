/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class MergeK
{
    int[] arr1;
    int[] arr2;
    int[] arr3;
    private int k;
    private int left;
    private int right;
    private int smallest;

    MergeK(int k)
    {
        this.k = k;
        arr1 = new int[]{};
        arr2 = new int[]{};
        arr3 = new int[]{};
    }
    void buildheap()
    {
        for(int i=k;i>=0;i--)
            minheap(i);
    }

    void minheap(int i)
    {
        left=2*i;
        right=left+1;
        if(left <= n && arr[left] < arr[i])
            smallest=left;
        else
            smallest=i;

        if(right <= n && arr[right] < arr[smallest])
        {
            smallest = right;
        }
        if(smallest!=i){
            int t=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=t;
            minheap(smallest);
        }
    }
}

public class Merge_K_SortedArray
{
    public static void main(String [] args)
    {
        MergeK obj = new MergeK();
        obj.arr = new int[]{4,1,3,2,16,9,10,14,8,7};
        obj.buildheap();
        for(int i=0;i<obj.arr.length;i++){
            System.out.print(obj.arr[i] + " ");
    }
}
