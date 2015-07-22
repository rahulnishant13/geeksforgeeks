#include <stdio.h>


void heapsort( int arr[], int n )
{  
	int i, val, lr, t ;
	while(n>0){
    for ( i = 1 ; i <= n-1 ; i++ )
    {
        val = arr[i] ;
        lr = i ;
        t = ( lr - 1 ) / 2 ;
        while ( lr > 0 && arr[t] < val )
        {
            arr[lr] = arr[t] ;
            lr = t ;
            t = ( lr - 1 ) / 2 ;
        }
        arr[lr] = val ;
    }
	
        val = arr[n-1] ;
        arr[n-1] = arr[0] ;
        arr[0]=val;   
        n--; 
	}
}

void heap(int arr[], int n){
	int i, val, lr, t ;
    for ( i = 1 ; i < n ; i++ )
    {
        val = arr[i] ;
        lr = i ;
        t = ( lr - 1 ) / 2 ;
        while ( lr > 0 && arr[t] < val )
        {
            arr[lr] = arr[t] ;
            lr = t ;
            t = ( lr - 1 ) / 2 ;
        }
        arr[lr] = val ;
    }
	}


int main(int argc, char **argv)
{
	int arr[50],i,n;
	printf("Enter the no elements : ");
	scanf("%d",&n);
	printf("Enter The Elements : ");
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
		}

	printf("Array : ");
	for(i=0;i<n;i++){
		printf("%d\t",arr[i]);
		}
	
	
	printf("\n HEAP :");
	heap(arr,n);
	for(i=0;i<n;i++){
	    printf("%d\t",arr[i]);
	    }
	 
	 
	 printf("\n heapsort : ");
	heapsort(arr,n);
	for(i=0;i<n;i++){
	    printf("%d\t",arr[i]);
	    }
	 
	return 0;
}
