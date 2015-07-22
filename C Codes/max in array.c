#include <stdio.h>

int main(int argc, char **argv)
{
	int a[10][10],i,j;
	int n=2;
	
	for(i=0;i<n;i++){
		 for(j=0;j<n;j++){
			 scanf("%d",&a[i][j]);
			 }
		 }
	int max =0;
	for(i=0;i<n;i++){
		 for(j=0;j<n;j++){
			 if(max < a[i][j])
			  max = a[i][j];
			 }
		 }
	printf("\nMAX : %d",max);
	return 0;
}

