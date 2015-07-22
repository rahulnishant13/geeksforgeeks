#include <stdio.h>

void upper(char s[], int n){
	int j=0;
	while(j < n){
		int k=0;
			
            for(k=s[j-1] + 1; (k <= s[j+1]) && (s[j] == '-'); ++k)
			printf("%c", k);

		    
			printf("%c",s[j++]);
			
		
		}
	}

int main(int argc, char **argv)
{
	int i;
	char c,s[50];
	for(i=0;(c = getchar()) != EOF ;i++){
		s[i] = c;
		}
	
	upper(s, i);
	
	return 0;
}
