#include <stdio.h>

int main(int argc, char **argv)
{
	int a,b,x=1;
	printf("Enter the Nos. : ");
	scanf("%d%d",&a,&b);

	do{
		x = a%b;
		a = b;
		b = x;
		}while(x != 0);
	printf("\n HCD : %d",a);
	return 0;
}

