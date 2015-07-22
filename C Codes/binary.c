#include <stdio.h>

int main(int argc, char **argv)
{     int a;
	scanf("%d",&a);
	int i;
	for(i=8; i>=0;i--){
		//printf("0");
		int mask= 1<<i;
		int bin = mask & a;
		(bin==0) ? printf("0"):printf("1") ;
	
		}
	return 0;
}

