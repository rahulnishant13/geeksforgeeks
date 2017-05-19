package HakerRank_Java.DataStructures;

/*
This problem will test your knowledge on java array. 
You are given an array of nn integers. A sub-array is "Negative" if sum of all the integers in that sub-array is negative. Count the number of "Negative sub-arrays" in the input array.

Note: Subarrays are contiguous chunks of the main array. For example if the array is {1,2,3,5} then some of the subarrays are {1}, {1,2,3}, {2,3,5}, {1,2,3,5} etc. But {1,2,5} is not an subarray as it is not contiguous.
*/


import java.util.*;

class SubArray{

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, count = 0 ;
        int [] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum < 0)
                    count++;
            }
            sum = 0;
        }

        System.out.println(count);
    }
}
