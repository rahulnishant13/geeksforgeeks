#include <stdio.h>
#include <conio.h>

int quicksort(int a[], int low, int h){
	int pivot,i,j,temp;
	i = low;
	pivot = a[low];
	for(j=low+1;j <= h;j++)
    {
		if(a[i] > pivot)
			i++;
		else{
             temp = a[j];
			 a[j] = a[i];
			 a[i] = temp;
            }
		}
	temp = a[i];
	a[i] = pivot;
	a[low] = temp;
	return i;	
	}

void partition(int a[], int low, int h){
	    if(low < h){
			int p;
			p = quicksort(a,low,h);
	        partition(a,low,p-1);
		    partition(a,p+1,h);
		}
	}

int main(int argc, char **argv)
{
	int a[]={7,6,5,4,3,2,1},i;
	
	partition(a,0,5);
	
	printf("\n");
	for(i=0;i<6;i++){
		printf("%d\t",a[i]);
		}
		getch();
	return 0;
}
