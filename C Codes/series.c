#include <stdio.h>
#include <malloc.h>

float fact(int n){
	if(n >1 ){
	n = n * fact(n-1) ;
      }

	return n;
	}

int main(int argc, char **argv)
{
	int n,i;
	float result=0;
	printf("Enter the no of terms : ");
	scanf("%d",&n);
	for(i=1;i<=n;i++){
		result = result + i/fact(i);
		}
	
	printf("\n%f",result);
	return 0;
}

