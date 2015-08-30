/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */

class Inversan
{
    int [] arr;
     int inv_count;

    void setMergesort()
    {
       inv_count= part(arr,0,arr.length-1);
    }

    int part(int [] arr, int low, int high)
    {
        int part_count =0;
        if(low < high){
		int mid = (low + high)/2;
		part_count =  part(arr,low,mid);
		part_count += part(arr,mid+1,high);

		part_count += merge(arr,low,mid,high);
		}
        return part_count;
    }

    int merge(int arr[], int low, int mid, int high)
    {
        int merge_count =0;
        int m = mid+1,i,l;
        int [] temp = new int[high +1] ;
	i=l=low;

	while((l<=mid) && (m<=high))
        {
            if(arr[l] <= arr[m])
            {
                // System.out.println("arr[i]  " + arr[l] + " arr[m] " +arr[m]);
		temp[i] = arr[l++];
                 
            }else
            {
               // System.out.println( " arr[i]  " + arr[l] + " arr[m] " +arr[m]);
		merge_count += ((mid +1) - i);
                temp[i] = arr[m++];
                
               //  System.out.println(" Merge : "+merge_count );
                        
            }
            i++;
	}

	while(l <= mid)
        {
            temp[i++] = arr[l++];
	}
	while(m <= high)
        {
            temp[i++] = arr[m++];
	}

	for(int k=low; k<=high; k++)
        {
            arr[k] = temp[k];
	}

        return merge_count;
    }

    void printInversn()
    {
        System.out.println(" Total inversan count : "+inv_count);
        for(int i=0; i < arr.length ; i++)
        System.out.print(" "+arr[i]);
    }
}

public class CountInversions
{
    public static void main(String [] args)
    {
        Inversan obj = new Inversan();
        obj.arr = new int[]{1, 20, 6, 4, 5};
        obj.inv_count = 0;
        obj.setMergesort();
        obj.printInversn();
    }
}