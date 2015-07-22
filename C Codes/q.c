#include <stdio.h>

void quicksort(int arr[], int low, int high){
	int i,j,p,temp;
	i=low;
	p = arr[low];

	for(j=low; j<= high;j++){
		if(arr[j] < p){
			i++;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			}
		}

	temp = arr[i];
	arr[i] = p;
	arr[low] = temp;
	p = i;
	
	if(low < p)
		quicksort(arr,low,p-1);
	
	if(p < high)
		quicksort(arr,p+1,high);

	}

int main(int argc, char **argv)
{
	int arr[]={4,2,8,9,3,6},i;
	quicksort(arr,0,5);
	for(i=0;i<=5;i++){
		printf("%d\t",arr[i]);
		}
	return 0;
}

