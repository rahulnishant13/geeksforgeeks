#include <stdio.h>
#define MAXLINE 100

int getlin(char s[], int lim){
	int c,i = 0;
	
	while(--lim > 0 && (c = getchar()) != EOF && c != '\n')
	     s[i++] = c;
	if(c == '\n')
	     s[i++] = c;
	s[i] = '\0';
	return i;
	}

int main(int argc, char **argv)
{
	double sum = 0,atof(char []);
	char line[MAXLINE];

	while(getlin(line, MAXLINE) > 0)
	    printf("\t%g\n",sum += atof(line));
	return 0;
}
