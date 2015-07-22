#include <stdio.h>

void rotate(int a,int b,int c){
	int x,y,z;
	x=b;
	y=c;
	z=a;
	printf("\n\nX = %d, Y = %d, Z = %d",x,y,z);
	}

int main(int argc, char **argv)
{
	int x,y,z;
	printf("Enter the nos : ");
	scanf("%d%d%d",&x,&y,&z);
	printf("\nX = %d, Y = %d, Z = %d",x,y,z);
	rotate(x,y,z);
	return 0;
}

