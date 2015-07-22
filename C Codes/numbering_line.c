#include <stdio.h>

int main(int argc, char **argv)
{
	FILE *fp;
	fp = fopen("ls.txt", "r");
	//ft = fopen(*(&argv[2]),"w");
	char ch;
	int i=1;
	printf("%d\t",i);
	while((ch = fgetc(fp)) != EOF){
		putchar(ch);
		if(ch == '\n'){
			i++;
			printf("%d\t",i);
			}
		}
	
	fclose(fp);
	return 0;
}
