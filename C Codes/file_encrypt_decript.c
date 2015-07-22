#include <stdio.h>

int main(int argc, char **argv)
{
	freopen("input.txt","r",stdin);
	freopen("output.txt","w",stdout);

	char ch;
	while((scanf("%c",&ch)) != EOF){
		if( (ch >= 'v') && (ch <= 'z') ){
			ch = 'a' + (ch - 'v');
			printf("%c",ch);
			}
		else if( (ch >= 'V') && (ch <= 'Z') ){
			ch = 'A' + (ch - 'V');
			printf("%c",ch);
			}
		else if((ch == ' ') || (ch == '\t') || (ch == '\n') ){
			printf("%c",ch);
			}
		else{
			ch = ch + 5;
			printf("%c",ch);
			}
		}

	return 0;
}
