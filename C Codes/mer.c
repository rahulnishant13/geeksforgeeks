#include <stdio.h>

void merge(int arr[], int l, int mid, int h){
	int low,m,i,temp[h+1],k;
	low = i = l;
	m = mid+1;
	
	while((low <= mid)&&(m <= h)){
		if(arr[low] <= arr[m]){
			temp[i] = arr[low];
			low++;
			}
		else{
			temp[i] = arr[m];
			m++;
			}
		i++;
		}

	while(low <= mid){
		temp[i] = arr[l];
		low++;
		i++;
		}
	while(m <= h){
		temp[i] = arr[m];
		m++;
		i++;
		}

	for(k=l;k<=h;k++){
		arr[k]=temp[k];
		}
	}

void part(int arr[], int l, int h){
	int mid;
	if(l < h){
		mid = (l+h)/2;
		
		part(arr,l,mid);
		part(arr,mid+1,h);
		
		merge(arr,l,mid,h);
		}
	}

int main(int argc, char **argv)
{
	int arr[]={4,2,8,9,3},i;
	part(arr,0,4);
	for(i=0;i<=4;i++){
		printf("%d\t",arr[i]);
		}
	return 0;
}
