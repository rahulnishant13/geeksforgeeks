/**
 * Given a sorted array consisting 0's and 1's. find the index of first '1'. 
 * Write a complete program which takes less time complexity. and test all boundary conditions also. 
 * Eg: If given array is 0,0,0,0,0,0,1,1,1,1 the out put should be 6.
 */

package Array_JAVA;

/**
 *
 * @author RAHUL
 */
 
 public class GetLast0InSortedArrayOf0nd1
 {
    
    static int binaraySearchIndex(int [] arr, int low, int high){
        if(low > high)
            return -1;
        
        int mid = low + (high - low)/2;
        
        if((arr[mid] == 0) && (mid == arr.length -1 || arr[mid + 1] == 1))
            return mid;
        
        else if(arr[mid] == 1 && (mid == 0 || arr[mid - 1] != 0))
                return binaraySearchIndex(arr, low, mid - 1);
        else
                return binaraySearchIndex(arr, mid + 1, high);
    }

     public static void main(String []args){
        int [] arr = new int[]{0,0,0,0,0,1,1,1,1};
        
        int result = binaraySearchIndex(arr, 0, arr.length - 1);
        
        if(result == -1)
            System.out.println(result);
        else
            System.out.println( result + 1); // index starts from 0 so +1
     }
}
