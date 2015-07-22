#include <stdio.h>

int upper(char s[], int n){
	int j=0,k=0;
	while(j < n){
		
		if(s[j] == 't')
			k = j;
		j++;
	   }
	if(k < 0)
	    return k;
	
	else 
	   return -2;
	}

int main(int argc, char **argv)
{
	int i,l;
	char c,s[50];
	for(i=0;(c = getchar()) != EOF ;i++){
		s[i] = c;
		}

	l = upper(s, i);
	printf("%d",l+1);
	return 0;
}
