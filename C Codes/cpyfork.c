#include <stdio.h>
#include <time.h>
#include <sys/types.h>

int main(int argc, char **argv)
{ int a,b;
	FILE *fc,*fp;
	char c;
	
	printf("%d\n",a=time(NULL));
   
    fc = fopen("xcvb.pdf","r");
    fp = fopen("aaaa","w");
     fork();
    while((c=fgetc(fc)) != EOF){
		fputc(c,fp);
		}
    
	printf("%d",b=time(NULL));
	
	printf("\n%d\n",b-a);
	return 0;
}

