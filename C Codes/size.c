#include <stdio.h>

int main(int argc, char **argv)
{
	short int i;
	
	int	a=20;
   for(i=7;i>=0;i--){
	   int dig= 1<<i;
	   
	   char bin= (a & dig);
	   if(bin == 0)
	   printf("0");
	   else
	   printf("1");
	   }
	printf("\n%d",sizeof a);
	return 0;
}

