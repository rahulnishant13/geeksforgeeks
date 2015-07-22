#include <stdio.h>

int main(int argc, char **argv)
{
	int n=0,t=0,s=0;
	int c;
	while((c=getchar()) != EOF){
		
		if(c == ' ')
		 s++;
		
		if(c == '\t')
		 t++;
		
		
		if(c == '\n')
		 n++;
   //   printf("%d   %d %d %d\n",c,' ','\t','\n');		 
		}
	printf("tab %d nl %d space %d",t,n,s);
	
	return 0;
}

