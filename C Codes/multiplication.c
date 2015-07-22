#include <stdio.h>

int main(int argc, char **argv)
{
	int i,j,k,n,sum=0;
	int a[10][10],b[10][10],c[10][10];
	 printf("Enter no of coloums :\n");
	 scanf("%d",&n);
	 printf("\nEnter 1st Matrix :\n");
	 for(i=0;i<n;i++){
		 for(j=0;j<n;j++){
			 scanf("%d",&a[i][j]);
			 }
		 }

	printf("\nEnter 2nd Matrix :\n");
	for(i=0;i<n;i++){
		 for(j=0;j<n;j++){
			 scanf("%d",&b[i][j]);
			 }
		 }
	
	for(i=0;i<n;i++){
		 for(j=0;j<n;j++){
			 for(k=0;k<n;k++){
				 sum = sum + (a[j][k] * b[k][j]);
				 }
			 c[i][j]=sum;
			 }
		 }
	
	printf("\nThe required Matrix is : \n");
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			printf("%d\t",c[i][j]);
			}
			printf("\n");
		}
	return 0;
}
