#include <stdio.h>
#include <string.h>


void itoa(int n){
	int i=0,sign,j=0,k,temp;
	char s[50];
	
	if((sign = n) < 0){
		n = -n;
		}
		
	do {
		s[i++] = n % 10 + '0';
		} while((n = n/10) > 0);
		
	if(sign < 0){
		s[i++] = '-';
		}
		
	s[i] = '\0';
	
	for(k=0,j = i; k < j; k++, j-- ){
		temp = s[j] , s[j] = s[k] , s[k] = temp;
		}
	j=0;
	while(j <= i){
		printf("%c",s[j]);
		j++;
		}

	}

int main(int argc, char **argv)
{
	int n;
    printf("Enter the Integer : ");
	scanf("%d",&n);

	itoa(n);

	return 0;
}

