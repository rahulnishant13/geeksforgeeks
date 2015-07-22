#include <stdio.h>
#include <conio.h>

int main(int argc, char **argv)
{
	int a[50],b[50],i,j,k=1;
	int r,row;
	scanf("%d",&row);
	r=row;
	
for(i=0;i<row+2;i++){
	printf("  ");
	}
	printf("1\n");


	while(k<row){
	for(i=0;i<=r;i++){
	printf("  ");
	}
	for(j=1;j<k;j++){
		b[j]=a[j-1]+a[j];
		//printf("%d\t",b[j]);
		}
		
	  b[0]=b[k]=1;
	for(i=0;i<=k;i++){
		a[i]=b[i];
		printf("%d   ",a[i]);
		}

		printf("\n");
	k++;
	r--;
	}	
		getch();
	return 0;
}
