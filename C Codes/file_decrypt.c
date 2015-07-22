#include <stdio.h>

int main(int argc, char **argv)
{
	freopen("output.txt","r",stdin);
	freopen("output.txt","a",stdout);

	char ch;
	while((scanf("%c",&ch)) != EOF){
		if( (ch >= 'a') && (ch <= 'e') ){
			ch = 'v' + (ch - 'a');
			printf("%c",ch);
			}
		else if( (ch >= 'A') && (ch <= 'E') ){
			ch = 'V' + (ch - 'A');
			printf("%c",ch);
			}
		else if((ch == ' ') || (ch == '\t') || (ch == '\n') ){
			printf("%c",ch);
			}
		else{
			ch = ch - 5;
			printf("%c",ch);
			}
		}

	return 0;
}
