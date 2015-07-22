#include <stdio.h>


int main(int argc, char **argv)
{
	FILE *fp1,*fp2,*ft;
	fp1 = fopen("baba.txt", "r");
	fp2 = fopen("new.txt", "r");
	ft = fopen("math.txt","w");

	char ch;
	int t=1,r1,r2;
	while(1){
		if(t == 1){
			ch = fgetc(fp1);
			
			if(ch == EOF){
				r1 = 0;
				t = 2;
				}
			
			if(ch == '\n')
				t = 2;
			
			if(r1 != 0)
			fputc(ch,ft);
			}
		
		if(t == 2){
			ch = fgetc(fp2);
			
			if(ch == EOF){
				r2 = 0;
				t = 1;
				}
			
			if(ch == '\n')
				t = 1;
			
			if(r2 != 0)
			fputc(ch,ft);
			}
		if(r1 == 0 && r2 == 0)
		   break;
		}

	fclose(fp1);
	fclose(fp2);
	fclose(ft);

	return 0;
}
