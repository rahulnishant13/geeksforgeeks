#include <stdio.h>

int main(int argc, char **argv)
{
	//FILE * fp;
	int c,b=0,bs=0,p=0,dq=0,sq=0;
	freopen("MAX.c","r",stdin);
	//freopen("readit.c","a",stdout);
	while((c=getchar())!=EOF){
		switch (c){
		case '[' : b++;
		           break;
		case ']'  : b--;
		           break;
	    case '('  : bs++;
	    break;
	    case ')' : bs--;
	    break;
	    case '{' : p++;
	    break;
	    case '}' : p--;
	    break;
	    case '"' : dq++;
	    break;
	   
	    case '\'' :  sq++;
	    break;
	}
		}
	if(b == 0 && bs == 0 && p == 0 && ((dq%2) == 0) && ((sq%2) == 0)){
		printf("No Error");
		}
	else{
		printf("Error");
		}
		//fclose(fp);
	return 0;
}

