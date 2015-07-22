#include <stdio.h>

int main(int argc, char *argv[])
{
	FILE *fs,*ft;
	char ch;
	
	if(argc != 3){
		puts("improper no of arguments\n");
		exit(1);
		}

	fs = fopen(argv[1],"r");
	if(fs == NULL){
		puts("cannot open source file\n");
		exit(2);
		}
	
	ft = fopen(argv[2],"w");
	if(ft == NULL){
		puts("cannot open target file\n");
		fclose(fs);
		exit(3);
		}
	
	while(1){
		ch = fgetc(fs);
		if(ch == EOF)
		   break;
		else
		   fputc(ch,ft);
		}
	
	fclose(fs);
	fclose(ft);
	return 0;
}

