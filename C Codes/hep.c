#include <stdio.h>

void heap(int arr[], int low, int high){
	int lr,i,p,n;
	while(high > 0){
	for(i=1;i<=high;i++){
		p = arr[i];
		lr = i;
		n = (lr-1)/2;
		while((lr > 0) && (arr[n] < p)){
			arr[i] = arr[n];
			lr = n;
			n = (lr-1)/2;
			}
		arr[lr] = p;
		}

		p = arr[high];
		arr[high] = arr[0];
		arr[0] = p;
		high = high - 1;
		heap(arr,low,high);
		}
	}

int main(int argc, char **argv)
{
	int arr[]={7,6,8,12,15},i;
	heap(arr,0,4);
	for(i=0;i<5;i++)
	  printf("%d  ",arr[i]);
	return 0;
}

