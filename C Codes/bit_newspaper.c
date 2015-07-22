#include <stdio.h>

int main(int argc, char **argv)
{
	int arr[10],b[]={0,0,0,0,0,0,0,0,0,0},i,j;
	for(i=0;i<=9;i++){
		scanf("%d",&arr[i]);
		}

   for(j=0;j<=9;j++){
	   printf("\n%d\n",arr[j]);
	for(i=8;i>=0;i--){
		int mask= 1<<i;
		int bin = mask & arr[j];
		(bin==0) ? (printf("0")):(printf("1") && (b[i] = b[i] + 1)) ; 
		}
	}
	printf("Upper\t%d\n",b[0]);
	printf("Middle\t%d\n",b[1]);
	printf("Lower\t%d\n",b[2]);
	printf("English\t%d\n",b[3]);
	printf("Hindi\t%d\n",b[4]);
	printf("Regional\t%d\n",b[5]);
	printf("Daily\t%d\n",b[6]);
	printf("Supplement\t%d\n",b[7]);
	printf("Tabloid\t%d\n",b[8]);
	return 0;
}
