#include <stdio.h>

/*int main(int argc, char **argv)
{
	int c;
	FILE *fp;
	fp = fopen("fopen.c","r");
	while((c=fgetc(fp)) != EOF){
		printf("%c",c);
		}
	
	fclose(fp);
	return 0;
}*/



int main(int argc, char **argv)
{
	FILE *fg,*fp;
	char ch;
	char ba[]="fopen.c";
	fg = fopen(ba,"r");
	fp = fopen("new.txt","w");
	puts(ba);
	
	while((ch =fgetc(fg)) != EOF){
		fputc(ch,fp);
		}

	fclose(fg);
	fclose(fp);
	
	return 0;
}

