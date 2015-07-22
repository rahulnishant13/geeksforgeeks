#include <stdio.h>

int main(int argc, char **argv)
{
	FILE *fo;
	char ch;
	fo = fopen("mergesort.c","r");

	while((ch =fgetc(fo)) != EOF){
		while(ch != '\n'){
			printf("%c",ch);
			ch =fgetc(fo);
			}
			printf("\n");
		}

	fclose(fo);
	return 0;
}

