#include <stdio.h>

int main(int argc, char **argv)
{
	int i,j,b,max=0,arr[]={-3,4,-1,7,-5};
	
	for(i=0;i<5;i++){
		int sum=0;
		for(j=i;j<5;j++){
			sum = sum + arr[j];
			
			if(max <= sum){
				max = sum;
				
				b = j;
				}
			}
		}
		char a=';
		printf("  %d %d %d",a,b,max);
	return 0;
}
