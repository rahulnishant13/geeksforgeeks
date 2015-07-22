#include <stdio.h>
#include <ctype.h>

int atoi(char s[] ) {
	int i,sign,val;
   for(i=0;(isspace(s[i]));i++)
      ;
   sign = (s[i] == '-') ? -1 : 1;
   if(s[i] == '+' || s[i] == '-')
       i++;
   for(val = 0;isdigit(s[i]);i++){
	   val = val * 10 + (s[i] - '0');
	   }
    return sign*val;
}

int main(int argc, char **argv)
{
	int i,val = 0;
	char c,s[50];
	for(i=0;(c = getchar()) != EOF ;i++){
		s[i] = c;
		}

	val = atoi(s);
	printf("%d",val);
	return 0;
}
