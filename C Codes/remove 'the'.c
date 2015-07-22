#include <stdio.h>

/*Write a program that will read a line and delete from it all
occurrences of the word ‘the’.
*/

int main(int argc, char **argv)
{
	char ch,check[]="the";
	int i=0;
	while((ch = getchar()) != EOF){
		while((ch == check[i])){
		ch = getchar();
		i++;
		}
		if(i==1){
			i=0;
			putchar('t');
			}
			else if(i==2){
				putchar('t');
				putchar('h');
				i=0;
				}
			printf("%c",ch);
			i=0;	
	}

	return 0;
}
