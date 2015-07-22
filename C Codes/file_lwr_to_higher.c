#include <stdio.h>

int main(int argc, char **argv)
{
	FILE *fp,*ft;
	fp = fopen("baba.txt", "r");
	ft = fopen("math.txt","w");
	char ch;
	while((ch = fgetc(fp)) != EOF){
		if(ch >= 'a' && ch <= 'z'){
			ch = 'A' + (ch - 'a');
			}
		fputc(ch,ft);
		}
	
	fclose(fp);
	return 0;
}
