#include <stdio.h>

int main(int argc, char *argv[])
{
	FILE *fc;
	char c;
	int i=0,n;
    n = atoi(argv[2]);
    fc = fopen(argv[1],"r");
    
   while( (c=fgetc(fc)) != EOF ){
		printf("%c",c);
		if(c == '\n'){
			i++;
			}
			if(i==n)
			break;
		}
	
	return 0;
}
