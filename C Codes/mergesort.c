#include <stdio.h>
#include <conio.h>

void merge(int a[], int low, int mid, int high){
	int m = mid+1,i,l,temp[high+1];
	i=l=low;

	while((l<=mid) && (m<=high)){
		if(a[l] <= a[m]){
			temp[i] = a[l];
			l++;
			}
		else{
			temp[i] = a[m];
			m++;
			}
		i++;
		}


	while(l<=mid){
		temp[i] = a[l];
		i++;
		l++;
		}
	while(m<=high){
		temp[i] = a[m];
		i++;
		m++;
		}


	int k;
	for(k=low;k<=high;k++){
		a[k]=temp[k];
		}
	}


void part(int a[], int low, int high){
	if(low < high){
		int mid = (low + high)/2;
		part(a,low,mid);
		part(a,mid+1,high);
		
		merge(a,low,mid,high);
		}
	}

int main(int argc, char **argv)
{
	int a[]={7,6,5,4,3,2,1},i;

	part(a,0,6);
	
	for(i=0;i<7;i++){
		printf("%d\t",a[i]);
		}
    getch();
	return 0;
}
