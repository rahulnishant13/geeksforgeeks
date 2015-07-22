#include <stdio.h>

int main(int argc, char **argv)
{
	char ch;
	while((ch = getchar()) != EOF){
		if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')){
			ch = ' ';
			}
		else{
			printf("%c",ch);
			}
	}

	return 0;
}
