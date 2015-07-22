#include <stdio.h>

void heap(int a[] , int );
void heapsort(int a[], int);

int main(int argc, char **argv)
{
	int i,n,arr[50];
	printf("Enter the nos of elements : ");
	scanf("%d",&n);
	printf("Enter the Elements : ");
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
		}
	heap(arr,n-1);
	printf("\n\nSORTED\t");
	for(i=0;i<n;i++){
		printf("%d\t",arr[i]);
		}

	return 0;
}

void heapsort(int arr[], int n){
	int temp;
	if(n > 0){
		temp = arr[0];
		arr[0] = arr[n];
		arr[n] = temp;
		n=n-1;

		heap(arr,n);
		}
	}


void heap(int arr[], int n){
	int temp,lr,i,prnt;

  for(i=0;i <= n;i++){
	temp = arr[i];
	lr = i;
	prnt = (lr -1)/2;
	while(lr > 0 && arr[prnt] < temp){
		arr[lr] = arr[prnt];
		lr = prnt;
		prnt = (lr-1)/2;
		}
	arr[lr] = temp;
	}
	heapsort(arr,n);
	}
