#include <stdio.h>

long int arr[50][50];
unsigned int num;
int count=0;

unsigned int divide(a,b){
	int j;
	count++;
    unsigned int sum = num >> a;
    for(j=0;j<b;j++)
    sum /= 3;

    return sum;
	}

long int value(short int a, short int b){
	count++;
	unsigned int n = divide(a,b);
	long int A=0,B=0,C=0;

	if(n < 12){
		return (long unsigned int)n;
		}

	else{
		A += value(a+1,b);
		B += value(a,b+1);
		C += value(a+2,b);
	/*	printf("A %lu %d %d \n",value(a+1,b),a+1,b);
		printf("B %lu %d %d \n",value(a,b+1),a,b+1);
		printf("C %lu %d %d \n",value(a+2,b),a+2,b);
		printf("V %lu %d %d \n",A+B+C,a,b);
		printf("%d\n\n",count);*/
		return A+B+C;
		}
	}

int main(int argc, char **argv)
{
	while(scanf("%d",&num) != EOF){
		printf("%ld\n",value(0,0));
		printf("%d\n",count);
		}

	return 0;
}
